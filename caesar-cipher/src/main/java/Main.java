public class Main {

    public static void main(String[] args) {
        System.out.println(CaesarCipher.encode("Vsem Privet!", -10)); //Liuc Fhyluj!
        System.out.println(CaesarCipher.decode("Liuc Fhyluj!", -10)); //Vsem Privet!
        System.out.println(CaesarCipher.encode("ABC ZXC QWERTY", 3)); //DEF CAF TZHUWB
        System.out.println(CaesarCipher.decode("DEF CAF TZHUWB", 3)); //ABC ZXC QWERTY
    }
}