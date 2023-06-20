package com.giulianna.OnBookLibrary;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnBookLibraryApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public boolean isbnValidator(String isbn) {
		String isbn = "12345"
		String.replaceAll("\\D", "");

		for (int i = 0; i < isbn.length(); i++) {
			int numero = Character.getNumericValue(isbn.charAt(i));
			System.out.println(numero);


		}

}
