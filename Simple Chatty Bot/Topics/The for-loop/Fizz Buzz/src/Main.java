import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i >= end; i++ ) {
            if (i % 5 == 0) && (i % 3 == 0){
                System.out.println("FizzBuzz")
            }
            if (i % 5 == 0){
                System.out.println("Buzz")
            }
            if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else
                System.out.println(i);
        }
    }
}