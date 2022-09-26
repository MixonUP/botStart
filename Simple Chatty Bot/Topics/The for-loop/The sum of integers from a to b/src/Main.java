import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int cont = 0;
        for (int i = start; i <= end; i++) {
            cont += i;
        }
        System.out.println(cont);
    }
}