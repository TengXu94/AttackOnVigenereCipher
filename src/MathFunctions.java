import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
//Homework 1 Computer and Networks Security 2016
//Xu Teng Andrea 1607870
public class MathFunctions {
	
	public ArrayList<Integer> divisorsOfANumber(int num){
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 2; i <= num / 2; i++) {
		    if (num % i == 0) {
		        result.add((Integer)i);
		    }
		}
		return result;
	}
	
	public ArrayList<Integer> divisorsOfAListOfNumbers(LinkedList<Integer> l){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i<l.size(); i++){
			result.addAll(divisorsOfANumber(l.get(i)));
		}
		return result;
	}
	
	public ArrayList<Integer> divisorsOfValuesOfAMap(HashMap<String, LinkedList<Integer>> h){
		ArrayList<Integer> result = new ArrayList<>();
		Set<String> keys = h.keySet();
		for ( String key : keys ) {
			result.addAll(divisorsOfAListOfNumbers(h.get(key)));
		}
		Collections.sort(result);
		return result;
	}
	
	public HashMap<Integer,Integer> divisorsFrequencies(ArrayList<Integer> a){
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for(int i = 0; i<a.size(); i++){
			if(h.containsKey(a.get(i))){
				int frequency = h.get(a.get(i)) + 1;
				h.put(a.get(i), frequency);
			}
			else
				h.put(a.get(i), 1);
		}
		return h;
	}
	
	public int mostFrequentIntegerInMapGreaterThanTwo(HashMap<Integer,Integer> h){
		int result = 0;
		int ratio = 0;
		for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
			Integer key = entry.getKey();
			Integer frequent = entry.getValue();
			if (ratio<frequent && key>2) {
				result =key;
				ratio = frequent;
			}
			else continue;
		}
		return result;
	}
	
	public int secondMostFrequentIntegerInMapGreaterThanTwo(HashMap<Integer,Integer> h){
		int result = 0;
		int ratio = 0;
		for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
			Integer key = entry.getKey();
			Integer frequent = entry.getValue();
			if (ratio<=frequent && key>2) {
				result =key;
				ratio = frequent;
			}
			else continue;
		}
		return result;
	}
	
	public int FindSmallest (double[] arr1){//start method

	       int index = 0;
	       double min = arr1[index];
	       for (int i=1; i<arr1.length; i++){

	           if (arr1[i] < min ){
	               min = arr1[i];
	               index = i;
	           }


	       }
	       return index ;

	}
	
	

}
