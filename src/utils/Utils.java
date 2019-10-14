package utils;

public class Utils {
	
	private static void validaString(String str, String label) {
		if(str == null || str.length() == 0)
			throw new IllegalArgumentException("Campo "+label+" inválido!");
	}
}
