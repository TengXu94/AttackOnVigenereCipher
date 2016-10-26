import java.util.HashMap;
import java.util.Set;
import java.util.*;
//Homework 1 Computer and Networks Security 2016
//Xu Teng Andrea 1607870
public class TrigramFunctions {


	//Input String s
	//Output HashMap<Trigram, Integer> for each trigram counts the frequency
	public HashMap<String, Integer> TrigramsCounter(String s){
		HashMap<String, Integer> trigrams = new HashMap<>();
		String trigram = "";
		for(int i = 0; (i+2)<s.length(); i++){
			trigram = s.substring(i, (i+3));
			if(trigrams.containsKey(trigram)){
				int frequency = (int)trigrams.get(trigram) + 1;
				trigrams.put(trigram, (Integer)frequency);
			}
			else {
				trigrams.put(trigram, 1);
			}
		}
		return trigrams;
	}
	
	//Input  HashMap<Trigram, Frequency>, uniqueTrigramList
		//Output HasMap<Trigram, Frequency> with frequency > 1

		public HashMap<String, Integer> ReliableTrigrams(HashMap<String, Integer> t){
			Set<String> keys = t.keySet();
			HashMap<String, Integer> result = new HashMap<String, Integer>();
			for ( String key : keys ) {
				int frequency = t.get(key);
				if(frequency > 1) 
					result.put(key, frequency);
				else continue;
			}
			return result;
		}


	//Input String S
	//Output UniqueTrigrams In The text
	
	public HashMap<String,LinkedList<Integer>> TrigramsInText(String s){
		HashMap<String, LinkedList<Integer>> trigrams = new HashMap<>();
		String trigram = "";
		for( int i = 0; (i+2)<s.length(); i++){
			trigram = s.substring(i, (i+3));
			if(trigrams.containsKey(trigram)){
				trigrams.get(trigram).add(i);
			}
			else {
				LinkedList<Integer> positions = new LinkedList<Integer>();
				positions.add(i);
				trigrams.put(trigram, positions);
			}
		}
		return trigrams;
	} 
	
	public HashMap<String, LinkedList<Integer>> TrigramsThinOut(HashMap<String,Integer> reliable, HashMap<String, LinkedList<Integer>> t){
		Set<String> keys = reliable.keySet();
		HashMap<String, LinkedList<Integer>> result = new HashMap<String, LinkedList<Integer>>();
		for ( String key : keys ) {
			LinkedList<Integer> lista = t.get(key);
			result.put(key, lista);
		}
		return result;
	}

	//input: HashMap<String, List of positions>
	//output HashMap<String, List of distances>
	
	public HashMap<String, LinkedList<Integer>> TrigramDistances(HashMap<String, LinkedList<Integer>> t){
		HashMap<String, LinkedList<Integer>> result = new HashMap<>();
		Set<String> keys = t.keySet();
		for ( String key : keys ) {
			LinkedList<Integer> positions = t.get(key);
			LinkedList<Integer> distances = new LinkedList<>();
			for(int i = 0 ; (i+1)<positions.size(); i++){
				int distance = positions.get(i+1) - positions.get(i);
				distances.add(distance);
			}
			result.put(key, distances);
		}
		return result;
	}
}
