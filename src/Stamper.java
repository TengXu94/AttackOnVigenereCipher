import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Homework 1 Computer and Networks Security 2016
//Xu Teng Andrea 1607870
public class Stamper {
	public void listStamp(List<String> l){
		for(int i = 0 ; i < l.size() ; i++){
			System.out.println(l.get(i));
		}
	}
	
	public  void listStampOneRow(List<?> l){
		for(int i = 0 ; i < l.size() ; i++){
			System.out.print(l.get(i) + "\t");
		}
	}

	public void stampMap(HashMap<?,?> m){
		for (Map.Entry<?,?> entry : m.entrySet()) {
			String key = entry.getKey().toString();
			String value = entry.getValue().toString();
			System.out.print(key);
			System.out.print("\t");
			System.out.print(value);;
			System.out.println("");
		}
	}
}
