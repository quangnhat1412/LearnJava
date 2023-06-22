/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.javacb_bt.tailieu;

import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class XuLyTaiLieu {
    public static void main(String[] args) {
        System.out.println("QUAN LY THU VIEN");
        System.out.println(" 1. Them moi tai lieu theo loai");
        System.out.println(" 2. Xoa tai lieu theo ma tai lieu");
        System.out.println(" 3. Hien thi thong tin ve tai lieu");
        System.out.println(" 4. Tim kiem tai lieu theo loai");
        System.out.println(" 5, Ket thuc chuong trinh");
        Scanner s = new Scanner(System.in);
        DSTaiLIeu dstl = new DSTaiLIeu();
        
        String maTL = "", tenNXB = "";
        int soBPH =0;
        
        do{
            System.out.print("Hay nhap lua chon: ");
            int luachon = s.nextInt();
            s.nextLine();
            switch (luachon){
                case 1: {
                    System.out.println(" a. Sach");
                    System.out.println(" b. Tap Chi");
                    System.out.println(" c. Bao");
                    System.out.println("Hay lua chon loai tai lieu can them: ");
                    String loai = s.nextLine();
                    
                    switch (loai){
                        case "a":{
                            System.out.print("- Nhap ma tai lieu: ");
                            maTL = s.nextLine();
                            System.out.print("- Nhap ten nha xuat ban: ");
                            tenNXB = s.nextLine();
                            System.out.print("- Nhap so ban phat hanh: ");
                            soBPH = s.nextInt();
                            s.nextLine();
                            System.out.print("- Nhap ten tac gia: ");
                            String tentg = s.nextLine();
                            System.out.print("- Nhap so trang: ");
                            int sotrang = s.nextInt();
                            TaiLieu tl = new Sach(maTL, tenNXB, soBPH, tentg, sotrang);
                            dstl.add(tl);
                            break;
                        }
                        case "b":{
                            System.out.print("- Nhap ma tai lieu: ");
                            maTL = s.nextLine();
                            System.out.print("- Nhap ten nha xuat ban: ");
                            tenNXB = s.nextLine();
                            System.out.print("- Nhap so ban phat hanh: ");
                            soBPH = s.nextInt();
                            s.nextLine();
                            System.out.print("- Nhap so phat hanh: ");
                            int soPhatHanh = s.nextInt();
                            System.out.print("- Nhap thang phat hanh: ");
                            int thangPH = s.nextInt();
                            TaiLieu tl = new TapChi(maTL, tenNXB, soBPH, soPhatHanh, thangPH);
                            dstl.add(tl);
                            break;
                        }
                        case "c":{
                            System.out.print("- Nhap ma tai lieu: ");
                            maTL = s.nextLine();
                            System.out.print("- Nhap ten nha xuat ban: ");
                            tenNXB = s.nextLine();
                            System.out.print("- Nhap so ban phat hanh: ");
                            soBPH = s.nextInt();
                            s.nextLine();
                            System.out.print("- Nhap ngay phat hanh: ");
                            int ngayPH = s.nextInt();
                            TaiLieu tl = new Bao(maTL, tenNXB, soBPH, ngayPH);
                            dstl.add(tl);
                            break;
                        }
                        default:{
                            System.out.println("Khong ton tai lua chon nay !!!");
                            break;
                        }
                        
                    }
                    break;
                }
                case 2:{
                    System.out.print("Nhap ma tai lieu can xoa: ");
                    String mtlxoa = s.nextLine();
                    dstl.remove(mtlxoa);
                    break;
                }
                case 3:{
                    dstl.printList();
                    break;
                }
                case 4:{
                    System.out.println("a. Tim kiem sach");
                    System.out.println("b. Tiem kiem tap chi");
                    System.out.println("c. Tiem Kiem Bao");
                    System.out.print("Hay nhap lua chon cua ban: ");
                    String loailc = s.nextLine();
                    
                    switch (loailc){
                        case "a": {
                            dstl.timKiemSach();
                            break;
                        }
                        case "b": {
                            dstl.timKiemSach();
                            break;
                        }
                        case "c": {
                            dstl.timKiemSach();
                            break;
                        }
                    }
                    break;
                }
                case 5:{
                    System.exit(0);
                    break;
                }               
                default:{
                    System.out.println("Khong ton tai lua chon nay !!!");
                    break;
                }
            }
        }while(true);
        
    }
}
