package december.javacb;

import java.util.Scanner;

public class KhaiBaoBien {
    public static void main(String[] args) {
        // Khai báo biến
        double a;
        // Nhập liệu ==> Khai báo đối tượng có kiểu Scanner
        Scanner s = new Scanner(System.in);
        // Nhập một số 
        System.out.print("Nhap so bat ki: ");
        a = s.nextDouble();
        System.out.println("So vua nhap: " + a);
        
    }
}
