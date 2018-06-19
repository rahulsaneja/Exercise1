
public class LetterChecking {
	
	public String vowel(String str) {
		String str2=str.toLowerCase();
		String vowelConsonantString = "";
		for(int i = 0; i< str.length();i++ ) {
			char ch = str2.charAt(i);
			if(ch=='i'||ch=='e'||ch=='o'||ch=='a'||ch=='u') {
				
				vowelConsonantString=vowelConsonantString+"Vowel";
			}
			else if((ch>=97 && ch<=122) || (ch>=65 && ch<=90)) {
				vowelConsonantString=vowelConsonantString+"Consonant";

			}
			else {
				vowelConsonantString=vowelConsonantString+"Not a letter";

			}
//			if ((ch>=97 && ch<=122) || (ch>=65 && ch<=90)) {
//				switch(ch) {
//				case 'a':
//				case 'A':
//				case 'e':
//				case 'E':
//				case 'i':
//				case 'I':
//				case 'o':
//				case 'O':
//				case 'u':
//				case 'U':
//					vowelConsonantString=vowelConsonantString+"Vowel";
//				default:
//					vowelConsonantString=vowelConsonantString+"Consonant";
//				}
//			}else{
//				vowelConsonantString=vowelConsonantString+"Not a letter";
//			}
//		
		
	}
		return vowelConsonantString;

}

}