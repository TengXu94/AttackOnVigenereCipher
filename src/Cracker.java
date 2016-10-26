import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//Homework 1 Computer and Networks Security 2016
//Xu Teng Andrea 1607870
public class Cracker {

	public void findKey(String ciphertext){

		TrigramFunctions tf = new TrigramFunctions();
		Stamper s = new Stamper();
		Encrypter en = new Encrypter();
		MathFunctions mf  = new MathFunctions();
		FrequencyAnalysis fa = new FrequencyAnalysis();
		ChiSquared chi = new ChiSquared();

		HashMap<String, Integer> trigrams = new HashMap<>();
		trigrams = tf.TrigramsCounter(ciphertext);
		HashMap<String,Integer> reliable = tf.ReliableTrigrams(trigrams);

		System.out.println("===                      Trigrams & Positions                            ===");

		HashMap<String, LinkedList<Integer>> trigramsPositions = new HashMap<>();
		trigramsPositions = tf.TrigramsInText(ciphertext);
		HashMap<String, LinkedList<Integer>> trigramsPositionsThinnedOut = new HashMap<>();
		trigramsPositionsThinnedOut = tf.TrigramsThinOut(reliable, trigramsPositions);

		for (Map.Entry<String, LinkedList<Integer>> e : trigramsPositionsThinnedOut.entrySet()) {
			String name = e.getKey();
			LinkedList<Integer> positions = e.getValue();
			System.out.print(name);
			System.out.print("\t");
			s.listStampOneRow(positions);
			System.out.println("");
		}
		System.out.println("===                      Trigrams & Distances                               ===");

		HashMap<String, LinkedList<Integer>> trigramsDistances = new HashMap<>();
		trigramsDistances = tf.TrigramDistances(trigramsPositionsThinnedOut);

		for (Map.Entry<String, LinkedList<Integer>> tri : trigramsDistances.entrySet()) {
			String trig = tri.getKey();
			LinkedList<Integer> distances = tri.getValue();
			System.out.print(trig);
			System.out.print("\t");
			s.listStampOneRow(distances);
			System.out.println("");
		}

		System.out.println("===                  Distances Divisors                                      ===");
		ArrayList<Integer> a = mf.divisorsOfValuesOfAMap(trigramsDistances);
		s.listStampOneRow(a);
		System.out.println("");

		System.out.println("===                  Most Frequent Divisor                                    ===");
		HashMap<Integer, Integer> hashmap = mf.divisorsFrequencies(a);
		int keylength = mf.mostFrequentIntegerInMapGreaterThanTwo(hashmap);
		System.out.println(keylength);

		System.out.println("===                           Divide CipherText wrt KeyLength                 ===");
		HashMap<Integer, String> divided = fa.TextDivisor(ciphertext, keylength);
		s.stampMap(divided);

		System.out.println("===                         CHARACTER FREQUENCY Of the first divided String    ===");
		LinkedList<String> l = new LinkedList<>();
		l.addAll(divided.values());
		String firstSequence = l.get(1);
		HashMap<Character, Integer> map = chi.characterFrequency(firstSequence);
		s.stampMap(map);

		System.out.println("===                        CalculateCHI of the first divided String            ===");
		double[] z = chi.calculateChi(firstSequence);
		System.out.println(Arrays.toString(z));

		System.out.println("===                        We have to calculate X^2 for each Divided String    ===");
		System.out.println("===                        Then We have a POSSIBLE KeyWord                     ===");
		int[] letters = new int[l.size()];
		for(int k = 0; k<l.size(); k++){
			String stringa = l.get(k);
			double[] temporary = chi.calculateChi(stringa);
			letters[k] = mf.FindSmallest(temporary);
		}

		System.out.println(en.NumbersToString(letters));
		
		System.out.println("=== If is wrong we have to try with a different keylength (multiple||submultiple)===");
		System.out.println("=== Or the second most frequent divisor (it is always a multiple of the previous one===");
	}
}




