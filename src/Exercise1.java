import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("1) metodo multiply(3, 4): " + multiply(3, 4));

        System.out.println("2) metodo concatenate(ciao, 6): " + concatenate("ciao", 6));

        String[] testArr = {"asd", "xd", "lmao", "lol", "rofl"};
        String testStr = "roflmao";
        System.out.println("3b) metodo insertInArray(testArr, testStr): " + Arrays.toString(insertInArray(testArr, testStr)));

    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatenate(String str, int num) {
        return str + num;
    }

    public static String[] insertInArray(String[] arr, String str ) {
        if (arr.length != 5) {
            throw new RuntimeException("L'array deve necessariamente avere una lunghezza di 5");
        }
        return new String[]{arr[0], arr[1], arr[2], str, arr[3], arr[4]};
    }
}