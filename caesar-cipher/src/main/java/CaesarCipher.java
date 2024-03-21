public class CaesarCipher {


    //Для английского языка
    public static String encode(String text, int shift) {
        char[] charArrText = text.toCharArray();
        for (int i = 0; i < charArrText.length; i++) {
            //[A,Z] - Промежуток символов
            if ((int) charArrText[i] >= 65 && (int) charArrText[i] <= 90) {
                int newIntValueOfChar = (int) charArrText[i] + shift;

                while (newIntValueOfChar > 90) {
                    newIntValueOfChar -= 26;
                }

                while (newIntValueOfChar < 65) {
                    newIntValueOfChar += 26;
                }

                charArrText[i] = (char) newIntValueOfChar;
            }
            //[a,z] - Промежуток символов
            if ((int) charArrText[i] >= 97 && (int) charArrText[i] <= 122) {
                int newIntValueOfChar = (int) charArrText[i] + shift;

                while (newIntValueOfChar > 122) {
                    newIntValueOfChar -= 26;

                }
                while (newIntValueOfChar < 97) {
                    newIntValueOfChar += 26;
                }

                charArrText[i] = (char) newIntValueOfChar;
            }
        }
        return String.valueOf(charArrText);
    }
    //Для английского языка
    public static String decode(String text, int shift) {
        char[] charArrText = text.toCharArray();
        for (int i = 0; i < charArrText.length; i++) {
            //[A,Z] - Промежуток символов
            if ((int) charArrText[i] >= 65 && (int) charArrText[i] <= 90) {
                int newIntValueOfChar = (int) charArrText[i] - shift;

                while (newIntValueOfChar > 90) {
                    newIntValueOfChar -= 26;
                }

                while (newIntValueOfChar < 65) {
                    newIntValueOfChar += 26;
                }

                charArrText[i] = (char) newIntValueOfChar;
            }
            //[a,z] - Промежуток символов
            if ((int) charArrText[i] >= 97 && (int) charArrText[i] <= 122) {
                int newIntValueOfChar = (int) charArrText[i] - shift;

                while (newIntValueOfChar > 122) {
                    newIntValueOfChar -= 26;

                }
                while (newIntValueOfChar < 97) {
                    newIntValueOfChar += 26;
                }

                charArrText[i] = (char) newIntValueOfChar;
            }
        }
        return String.valueOf(charArrText);
    }
}
