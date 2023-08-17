public class StringUtils {
    public static String reverse(String original) {
        return new StringBuilder(original).reverse().toString();
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        String[] wordsInReversedOrder = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String wordToLowerCase = words[i].trim().replace(".", "").toLowerCase();
            wordsInReversedOrder[words.length - 1 - i] = wordToLowerCase;
        }

        wordsInReversedOrder[0] = wordsInReversedOrder[0].substring(0, 1).toUpperCase() + wordsInReversedOrder[0].substring(1);
        return String.join(" ", wordsInReversedOrder) + ".";
    }

    public static String reverseCharacters(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedCharactersSentence = new StringBuilder();

        for (String word : words) {
            String wordToLowerCase = word.trim().replace(".", "").toLowerCase();
            StringBuilder reversedWord = new StringBuilder(wordToLowerCase).reverse();
            reversedCharactersSentence.append(reversedWord).append(" ");
        }

        String firstLetterUpperCaseSentence = reversedCharactersSentence.substring(0, 1).toUpperCase() + reversedCharactersSentence.substring(1);
        return firstLetterUpperCaseSentence.trim() + ".";
    }
}
