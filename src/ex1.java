import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Số " + n + " là số chẵn.");
        } else {
            System.out.println("Số " + n + " là số lẻ.");
        }

        if (n >= 0) {
            System.out.println("Số " + n + " là số dương.");
        } else {
            System.out.println("Số " + n + " là số âm.");
        }
    }
}
