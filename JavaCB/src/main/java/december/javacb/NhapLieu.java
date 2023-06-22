package december.javacb;

import java.util.Scanner;

public class NhapLieu {
        public static void main(String[] args) {
                String name,kind;
                int age; 
                double point;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter name: ");
                name = s.nextLine();
                System.out.print("Enter age: ");
                age = s.nextInt();
                System.out.print("Enter point: ");
                point = s.nextDouble();
                s.nextLine();
                System.out.print("Enter kind: ");
                kind = s.nextLine();
                System.out.printf("Result: Name: %s - Age: %d - Point: %.2f - Kind: %s",name,age,point,kind);

        }
}
