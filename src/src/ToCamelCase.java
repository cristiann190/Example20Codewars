package src;

public class ToCamelCase {
	public static String toCamelCase(String input) {
		final String[] words = input.split("[-_]");
        StringBuilder camelCaseSentence = new StringBuilder();
		camelCaseSentence.append(words[0]);
		for (int index = 1; index < words.length; index++) {
			final String word = words[index];
			camelCaseSentence.append(word.substring(0, 1).toUpperCase() + word.substring(1));
		}
		return camelCaseSentence.toString();
	}
}