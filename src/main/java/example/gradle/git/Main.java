package example.gradle.git;

public class Main {

	public static void main(String[] args) {

		String message = "how are you doin";
		int offset = 12;
		
		CeaserCipher ceaserCipher = new CeaserCipher();
		String cipheredMessage =  ceaserCipher.cipher(message, offset);
		
		System.out.println("message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);

	}

}
