import java.util.HashMap;
//Homework 1 Computer and Networks Security 2016
//Xu Teng Andrea 1607870
public class FrequencyAnalysis {
		
	public HashMap<Integer, String> TextDivisor(String ciphertext, int keylength){
		HashMap<Integer, String> result = new HashMap<>();
		int i = 0;
		while( i<keylength){
			int j = i;
			String s = "";
			while(j<ciphertext.length()){
				s += ciphertext.charAt(j);
				j = j + keylength;
			}
			result.put(i, s);
			i++;
		}
		return result;
	}
	
}
