package example.gradle.git;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeaserCipherTest {

	private CeaserCipher ceaserCipher = new CeaserCipher();
	
	
	@Test
	void testCipheredmessageoffset12() {
		assertEquals("tai mdq kag pauz", ceaserCipher.cipher("how are you doin", 12));
	}
	
	@Test
	void testemptystring() {
		assertEquals(" ", ceaserCipher.cipher(" ", 12));
	}

}
