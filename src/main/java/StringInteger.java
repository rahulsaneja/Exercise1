

public class StringInteger {
public String stack(int x, String str){
	
	int length= str.length();
	if (x == 0) {
		return "Enter a number greater than 0";
	}
	if (str == "") {
		return "Enter a string";
	}
	if(x>length) {
		return "Input cannot be greater than length";
	}
	
	int n = length - x;
	String substring = str.substring(n);
	for(int i =1; i<=x ;i++) {
		str = str.concat(substring);
	}
	return str;
}
}
