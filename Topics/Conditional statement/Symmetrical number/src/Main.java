import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String testNumber = scanner.next();

        if (testNumber.charAt(0) == testNumber.charAt(3) && testNumber.charAt(1) == testNumber.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}