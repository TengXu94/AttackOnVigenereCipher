//Homework 1 Computer and Networks Security 2016
//Xu Teng Andrea 1607870


public class VigenereCipher {
	
	public static final char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O', 'P','Q','R'
			,'S','T','U','V','W','X','Y','Z'};

	public static void main(String[] args){
		Encrypter en = new Encrypter();
		Cracker c = new Cracker();
		String key = "Destiny";
		String plaintext = "If you prick us do we not bleed If you tickle us do we not laugh "
				+ "If you poison us do we not die And if you wrong us shall we not revenge ";
		String ciphertext = en.encrypt(plaintext,key);
		
		System.out.println(" === 			ENCRYPTED TEXT		=== "); 
		System.out.println(ciphertext);
		
		c.findKey(ciphertext);
	}
}
