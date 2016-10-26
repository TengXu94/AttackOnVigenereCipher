//Homework 1 Computer and Networks Security 2016
//Xu Teng Andrea 1607870
public class Encrypter {

	public int[] StringToNumbers(String stringa){
		int lunghezzaStringa = stringa.length();
		int[] result;
		result = new int[lunghezzaStringa];
		for(int i = 0; i<lunghezzaStringa; i++){
			if(stringa.charAt(i) == 'a' || stringa.charAt(i) == 'A')
				result[i] = 0;
			if(stringa.charAt(i) == 'b' || stringa.charAt(i) == 'B')
				result[i] = 1;
			if(stringa.charAt(i) == 'c' || stringa.charAt(i) == 'C')
				result[i] = 2;
			if(stringa.charAt(i) == 'd' || stringa.charAt(i) == 'D')
				result[i] = 3;
			if(stringa.charAt(i) == 'e' || stringa.charAt(i) == 'E')
				result[i] = 4;
			if(stringa.charAt(i) == 'f' || stringa.charAt(i) == 'F')
				result[i] = 5;
			if(stringa.charAt(i) == 'g' || stringa.charAt(i) == 'G')
				result[i] = 6;
			if(stringa.charAt(i) == 'h' || stringa.charAt(i) == 'H')
				result[i] = 7;
			if(stringa.charAt(i) == 'i' || stringa.charAt(i) == 'I')
				result[i] = 8;
			if(stringa.charAt(i) == 'j' || stringa.charAt(i) == 'J')
				result[i] = 9;
			if(stringa.charAt(i) == 'k' || stringa.charAt(i) == 'K')
				result[i] = 10;
			if(stringa.charAt(i) == 'l' || stringa.charAt(i) == 'L')
				result[i] = 11;
			if(stringa.charAt(i) == 'm' || stringa.charAt(i) == 'M')
				result[i] = 12;
			if(stringa.charAt(i) == 'n' || stringa.charAt(i) == 'N')
				result[i] = 13;
			if(stringa.charAt(i) == 'o' || stringa.charAt(i) == 'O')
				result[i] = 14;
			if(stringa.charAt(i) == 'p' || stringa.charAt(i) == 'P')
				result[i] = 15;
			if(stringa.charAt(i) == 'q' || stringa.charAt(i) == 'Q')
				result[i] = 16;
			if(stringa.charAt(i) == 'r' || stringa.charAt(i) == 'R')
				result[i] = 17;
			if(stringa.charAt(i) == 's' || stringa.charAt(i) == 'S')
				result[i] = 18;
			if(stringa.charAt(i) == 't' || stringa.charAt(i) == 'T')
				result[i] = 19;
			if(stringa.charAt(i) == 'u' || stringa.charAt(i) == 'U')
				result[i] = 20;
			if(stringa.charAt(i) == 'v' || stringa.charAt(i) == 'V')
				result[i] = 21;
			if(stringa.charAt(i) == 'w' || stringa.charAt(i) == 'W')
				result[i] = 22;
			if(stringa.charAt(i) == 'x' || stringa.charAt(i) == 'X')
				result[i] = 23;
			if(stringa.charAt(i) == 'y' || stringa.charAt(i) == 'Y')
				result[i] = 24;
			if(stringa.charAt(i) == 'z' || stringa.charAt(i) == 'Z')
				result[i] = 25;
		}
		return result;
	}

	public int CharacterToNumbers(Character c){
		int result = 0;
		if(c == 'a' || c == 'A')
			result = 0;
		if(c == 'b' || c == 'B')
			result = 1;
		if(c == 'c' || c == 'C')
			result = 2;
		if(c == 'd' || c == 'D')
			result = 3;
		if(c == 'e' || c == 'E')
			result = 4;
		if(c == 'f' || c == 'F')
			result = 5;
		if(c == 'g' || c == 'G')
			result = 6;
		if(c == 'h' || c == 'H')
			result = 7;
		if(c == 'i' || c == 'I')
			result = 8;
		if(c == 'j' || c == 'J')
			result = 9;
		if(c == 'k' || c == 'K')
			result = 10;
		if(c == 'l' || c == 'L')
			result = 11;
		if(c == 'm' || c == 'M')
			result = 12;
		if(c == 'n' || c == 'N')
			result = 13;
		if(c == 'o' || c == 'O')
			result = 14;
		if(c == 'p' || c == 'P')
			result = 15;
		if(c == 'q' || c == 'Q')
			result = 16;
		if(c == 'r' || c == 'R')
			result = 17;
		if(c == 's' || c == 'S')
			result = 18;
		if(c == 't' || c == 'T')
			result = 19;
		if(c == 'u' || c == 'U')
			result = 20;
		if(c == 'v' || c == 'V')
			result = 21;
		if(c == 'w' || c == 'W')
			result = 22;
		if(c == 'x' || c == 'X')
			result = 23;
		if(c == 'y' || c == 'Y')
			result = 24;
		if(c == 'z' || c == 'Z')
			result = 25;

		return result;
	}

	public String NumbersToString(int[] numbers){
		int lunghezzaStringa = numbers.length;
		String result="";
		for(int i = 0; i<lunghezzaStringa; i++){
			if(numbers[i] == 0)
				result += 'A';
			if(numbers[i] == 1)
				result += 'B';
			if(numbers[i] == 2)
				result += 'C';
			if(numbers[i] == 3)
				result += 'D';
			if(numbers[i] == 4)
				result += 'E';
			if(numbers[i] == 5)
				result += 'F';
			if(numbers[i] == 6)
				result += 'G';
			if(numbers[i] == 7)
				result += 'H';
			if(numbers[i] == 8)
				result += 'I';
			if(numbers[i] == 9)
				result += 'J';
			if(numbers[i] == 10)
				result += 'K';
			if(numbers[i] == 11)
				result += 'L';
			if(numbers[i] == 12)
				result += 'M';
			if(numbers[i] == 13)
				result += 'N';
			if(numbers[i] == 14)
				result += 'O';
			if(numbers[i] == 15)
				result += 'P';
			if(numbers[i] == 16)
				result += 'Q';
			if(numbers[i] == 17)
				result += 'R';
			if(numbers[i] == 18)
				result += 'S';
			if(numbers[i] == 19)
				result += 'T';
			if(numbers[i] == 20)
				result += 'U';
			if(numbers[i] == 21)
				result += 'V';
			if(numbers[i] == 22)
				result += 'W';
			if(numbers[i] == 23)
				result += 'X';
			if(numbers[i] == 24)
				result += 'Y';
			if(numbers[i] == 25)
				result += 'Z';
		}
		return result;
	}

	public String encrypt(String p, String k){
		int[] plaintext = new int[p.length()];
		int[] key = new int[k.length()];
		int[] ciphertext = new int[p.length()];
		plaintext = StringToNumbers(p);
		key = StringToNumbers(k);
		for(int i = 0,  j = 0 ; i < p.length(); i++){
			ciphertext[i] = (plaintext[i]+key[j]) % 26;
			j = ++j % key.length;
		}
		String result = NumbersToString(ciphertext);
		return result;
	}


}
