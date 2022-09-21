package vowels;

public class main {

	public static void main(String[] args) {
		// vowels = sesli harfler
		
char character = 'B';
		
		switch (character) {
			case 'A':
			case 'a':
			case 'I':
			case 'ı':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.println(character +" is a bold vowel");
				break;
			case 'E':
			case 'e':
			case 'İ':
			case 'i':
			case 'Ö':
			case 'ö':
			case 'Ü':
			case 'ü':
				System.out.println(character +" is a thin vowel");
				break;

			default:
				System.out.println(character +" is not a vowel");
				break;
			}
	}


}
