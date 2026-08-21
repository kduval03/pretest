package prob2;

public class Prob2 {

	public static void main(String[] args) {
		System.out.print(countVowelSequence("Steam engine in heavy rain"));

	}
	public static int countVowelSequence(String str) {
		
		char[] vowels = {'a','e','i','o','u'};
		char[] str1 = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' '){
				str1[i] == str.charAt(i);
			}
		}
		
		
		int vowelPairs = 0;
		
		for(int i = 0; i < str.length()-1; i ++) {
			for(int j = 0; j < vowels.length; j++) {
				if(str.charAt(i) == vowels[j] && str.charAt(i+1) == vowels[j]) {
					vowelPairs += 1;
				}
				
			}
		}
		
		
		return vowelPairs;
		
	}

}
