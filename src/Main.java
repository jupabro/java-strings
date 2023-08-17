public class Main {
    public static void main(String[] args) {
        String newline = "\u006C";
        String tabbed = "\u0009";
        String singleQuote = "\u0027";

        System.out.println(newline + " | Length: " + newline.length());
        System.out.println(tabbed + " | Length: " + tabbed.length());
        System.out.println(singleQuote + " | Length: " + singleQuote.length());
        System.out.println();

        String specialExpression = "ähm";
        String smileyFace = "\u263A";
        String abc = "ABC"; // ASCII compatible letters A, B and C
        String abcVariant = "𝔸BC";

        System.out.println("string value: " + smileyFace + " length: " + smileyFace.length() + " reverse: " + StringUtils.reverse(smileyFace));
        System.out.println("string value: " + abcVariant + " length: " + abcVariant.length() + " reverse: " + StringUtils.reverse(abcVariant));
        System.out.println("string value: " + abc + " length: " + abc.length() + " reverse: " + StringUtils.reverse(abc));
        System.out.println("string value: " + specialExpression.toUpperCase() + " length: " + specialExpression.toUpperCase().length() + " reverse: " + StringUtils.reverse(specialExpression.toUpperCase()));
        System.out.println();

        String[] specialChars = { "ä", "é", "Ø" };

        for (String specialChar : specialChars) {
            System.out.println("string value: " + specialChar + " toUpperCase: " + specialChar.toUpperCase());
        }

        String sentence = "This is a test sentence.";
        String reversedWords = StringUtils.reverseWords(sentence);
        String reversedCharacters = StringUtils.reverseCharacters(sentence);

        System.out.println("sentence: " + sentence + " reversed words: " + reversedWords + " reversed characters: " + reversedCharacters);
        System.out.println();

        // here the amount of bytes used by a wrapper class are estimated by its string representation
        System.out.println("Bytes for int: " + DataTypeUtils.getPrimitiveBytes(int.class) + " | Estimated Bytes for Integer: " + DataTypeUtils.estimateBytes(Integer.toString(12345)));
        System.out.println("Bytes for byte: " + DataTypeUtils.getPrimitiveBytes(byte.class) + " | Estimated Bytes for Byte: " + DataTypeUtils.estimateBytes(Byte.toString((byte) 123)));
        System.out.println("Bytes for short: " + DataTypeUtils.getPrimitiveBytes(short.class) + " | Estimated Bytes for Short: " + DataTypeUtils.estimateBytes(Short.toString((short) 12345)));
        System.out.println("Bytes for int: " + DataTypeUtils.getPrimitiveBytes(int.class) + " | Estimated Bytes for Integer: " + DataTypeUtils.estimateBytes(Integer.toString(12345)));
        System.out.println("Bytes for long: " + DataTypeUtils.getPrimitiveBytes(long.class) + " | Estimated Bytes for Long: " + DataTypeUtils.estimateBytes(Long.toString(12345L)));
        System.out.println("Bytes for float: " + DataTypeUtils.getPrimitiveBytes(float.class) + " | Estimated Bytes for Float: " + DataTypeUtils.estimateBytes(Float.toString(123.45f)));
        System.out.println("Bytes for double: " + DataTypeUtils.getPrimitiveBytes(double.class) + " | Estimated Bytes for Double: " + DataTypeUtils.estimateBytes(Double.toString(123.45)));
        System.out.println("Bytes for char: " + DataTypeUtils.getPrimitiveBytes(char.class) + " | Estimated Bytes for Character: " + DataTypeUtils.estimateBytes(Character.toString('A')));
        System.out.println("Bytes for boolean: " + DataTypeUtils.getPrimitiveBytes(boolean.class) + " | Estimated Bytes for Boolean: " + DataTypeUtils.estimateBytes(Boolean.toString(true)));
    }

}
