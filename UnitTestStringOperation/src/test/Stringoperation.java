package test;

public class Stringoperation {
	public String firsttwocharacters(String inputString) {
		if(inputString.length()<=2) {
			return inputString;
		}
		else {
			String twochar=inputString.substring(0,2);
			return twochar;
		}
	}
}