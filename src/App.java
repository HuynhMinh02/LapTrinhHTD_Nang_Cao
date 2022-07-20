import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so n: " );
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n ;) {
            sum += i;
            
        }
        System.out.println("Ket qua la: " + sum );
    }
}

