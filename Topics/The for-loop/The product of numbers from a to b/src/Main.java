import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long outputNum = 1;

        for (int i = a; i < b; i++) {
            outputNum *= i;
        }
        System.out.println(outputNum);
    }
}