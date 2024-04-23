package com.iqt.training.LongestSubstring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LongestSubstringApplication {
	public static void main(String[] args) {
		SpringApplication.run(LongestSubstringApplication.class, args);
		//A partir de una cadena de carácteres debes encontrar la más larga
		// subcadena de carácteres sin que se repita ningún carácter.
		String s = "abcabcbb"; // Ejemplo de cadena
		int size = s.length();
		int p1 = 0; //apuntador inicial
		int p2 = 1; //apuntador que va a ir moviendose
		int longestLength = 1; //el minimo tamaño
		while (p2 < size) {
			String substring = s.substring(p1, p2);
			char p2Value = s.charAt(p2);
			if (substring.contains(String.valueOf(p2Value))) {
				longestLength = Math.max(longestLength, substring.length());
				int repeatedCharIndex = substring.indexOf(p2Value) + 1;
				p1 += repeatedCharIndex;
			}
			p2++;
		}
		System.out.println("Longitud de la subcadena mas larga sin repeticion: " + longestLength);
	}
}
