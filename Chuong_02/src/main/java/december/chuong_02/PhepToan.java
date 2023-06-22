package december.chuong_02;

import java.util.Scanner;


public class PhepToan {
    public static void main(String[] args) {
        
        //1. Phát sinh 1 số nguyên ngẩu nhiên từ 60 - 100 ==> Math.random
//        int min = 60;
//        int max = 100;
//        int soPhatSinh = (int)(Math.random() * (max - min) + min);
//        System.out.println("So phat sinh: " + soPhatSinh);
        
        //2. Chuyển một chuỗi về kiểu nguyên thủy
//        String str1 = "14";
//        int n1 = Integer.parseInt(str1);
//        System.out.println("So nguyen sau khi chuyen: " + n1);
//        
//        String str2 = "14.12";
//        float n2 = Float.parseFloat(str2);
//        System.out.println("So thuc sau khi chuyen: " + n2);
        
        //3. Bắt lỗi với try ... catch
        
//        Scanner s = new Scanner(System.in);
//        try {
//            System.out.print("Nhap so nguyen bat ki: ");
//            int a = s.nextInt();
//            System.out.println("Ban vua nhap so: "+ a);
//        } catch (Exception e) {
//            System.out.println("Nhap sai du lieu !!!");
//        }

        //4. Kiểm tra kiểu dữ liệu với hasNextInt của đối tượng Scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        if(s.hasNextInt()){
            int a = s.nextInt();
            System.out.println("So nguyen vua nhap: "+ a);
        }
        else{
            System.out.println("Nhap sai du lieu !!!");
        }
            
    }
}
