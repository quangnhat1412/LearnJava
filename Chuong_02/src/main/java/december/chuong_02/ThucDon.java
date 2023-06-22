package december.chuong_02;

import java.util.Scanner;


public class ThucDon {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("--         CHON CHUC NANG CHUONG TRINH           --");
        System.out.println("-- 1. Giai phuong trinh bac 1: a*x + b = 0       --");
        System.out.println("-- 2. Giai phuong trinh bac 2: a*x + b*x + c = 0 --");
        System.out.println("-- 3. Tinh so ngay cua thang trong mot nam       --");
        System.out.println("-- 4. Ket thuc chuong trinh                      --");
        System.out.println("---------------------------------------------------");
        int cn = 0;
        
        do {
        System.out.print("Hay chon chuc nang: ");
        Scanner s = new Scanner(System.in);
        cn = s.nextInt();
        
        switch(cn){
            case 1: 
                PTBac1();
                break;
            case 2: 
                PTBac2();
                break;
            case 3: 
                TinhSoNgay();
                break;
            default:
                System.exit(0);
    }
    }
    while(true);
    }
    public static void PTBac1(){
        int a,b;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a = s.nextInt();
        System.out.print("Nhap he so b: ");
        b = s.nextInt();
        
        GiaiPT(a,b);
    }
    
    public static void PTBac2(){
        int a,b,c,denlta;
        double x1,x2;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a = s.nextInt();
        System.out.print("Nhap he so b: ");
        b = s.nextInt();
        System.out.print("Nhap he so c: ");
        c = s.nextInt();
        
        if(a==0){
            GiaiPT(b,c);
        }
        else{
            denlta = b*b - 4*a*c;
            if(denlta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            if(denlta == 0){
                x1 = -(double)b / (2*a);
                System.out.printf("Phuong trinh co nghiep kep: x = %.2f",x1);
            }
            if(denlta > 0){
                x1 = (-b + Math.sqrt(denlta)) / (2*a);
                x2 = (-b - Math.sqrt(denlta)) / (2*a);
                
                System.out.printf("Phuong trinh co 2 nghiep phan bieta: x1 = %.2f ; x2= %.2f",x1,x2);
            }
        }
    
    }
    
    public static void TinhSoNgay(){
        int thang,nam;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Hay nhap thang: ");
        thang = s.nextInt();
        System.out.print("Hay nhap nam: ");
        nam = s.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            case 2:
                if((nam % 4 == 0 && nam % 100 != 0) || nam % 400 ==0 ){
                    System.out.println("thang co 29 ngay");
                }
                else{
                    System.out.println("thang co 28 ngay");
                }
                break;
            default:
                break;
        }
    }

    public static void GiaiPT(int a, int b){
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co so nghiem");
            }
            else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            float x = -(float)b / a;
            System.out.printf("Phuong trinh co nghiem: x=%.2f",x);
        }
    }
}
