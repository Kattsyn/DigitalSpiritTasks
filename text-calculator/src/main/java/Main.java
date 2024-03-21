import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static final String[] arr = new String[]{"odin", "dva", "tri", "chetire", "pyat", "shest", "sem", "vosem", "devyat`"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = getNumValue(scanner.next());
        int second = getNumValue(scanner.next());

        if(first == -1 || second == -1) {
            System.out.println("error");
        } else {
            System.out.println(first + second);
        }


    }
    public static int getNumValue(String stringNum) {
        for(int i = 0; i < arr.length; i++) {
            if(Objects.equals(arr[i], stringNum)) {
                return i + 1;
            }
        }
        return -1;
    }
}