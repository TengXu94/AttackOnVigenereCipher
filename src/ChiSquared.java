import java.util.HashMap;
import java.util.Set;

//Homework 1 Computer and Networks Security 2016
//Xu Teng Andrea 1607870
public class ChiSquared {

	
	public static final char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O', 'P','Q','R'
			,'S','T','U','V','W','X','Y','Z'};
	public static final double[] alphabetFrequencies = {0.0812, 0.0149, 0.0271, 0.0432, 0.127, 0.0230, 0.0203, 0.0592, 0.0731, 0.0010,
			0.0069,0.0398, 0.0261, 0.0695, 0.0768, 0.0182, 0.0011, 0.0602, 0.0628, 0.0910, 0.0288, 0.0111, 0.0209, 0.0017, 0.0211, 0.0007}; 
	public static final char[] inverseAlphabet = {'A', 'Z', 'Y','X', 'W', 'V', 'U', 'T', 'S','R','Q','P','O','N','M','L','K','J','I','H'
			, 'G','F','E','D','C','B'};

	public double calculate(String s){
		Encrypter e = new Encrypter();
		HashMap<Character, Integer> map = characterFrequency(s);
		double result = 0;
		Set<Character> keys = map.keySet();
		for ( Character key : keys ) {
			int C = map.get(key);
			double E = alphabetFrequencies[e.CharacterToNumbers(key)] * s.length();
			result += (Math.pow((C - E),2))/(E);
		}
		return result;
	}
	

	public HashMap<Character,Integer> characterFrequency(String s){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>(); 
		
		for(int i = 0; i<26; i++){
			map.put(alphabet[i], 0);
		}
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				int f = map.get(c);
				map.put(c, f+1);
			}
		}
		return map;
	}
	
	
	public double[] calculateChi(String s){
		Encrypter e = new Encrypter();
		double[] result = new double[26];
		String temp = s;
		for(int i = 0; i<26; i++){
			temp = e.encrypt(s, Character.toString(inverseAlphabet[i]));
			result[i] = calculate(temp);			
		}
		return result;
	}
	
	
	
	public int[] ShiftNumbers(int[] r, int n){
		int[] result = new int[r.length];
		for(int i = 0; i<r.length; i++){
			result[i] = r[i] - n;
		}
		return result;
	}

}
