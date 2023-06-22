/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.javacb_bt;

import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class XuLyCanBo {
    public static void main(String[] args) {
        System.out.println("----- CHUONG TRINH QUAN LY CAN BO ------");
        System.out.println(" 1. Them Can bo moi  ");
        System.out.println(" 2. Tim kiem theo ho ten ");
        System.out.println(" 3. Hien thi thong tin ve danh sach can bo  ");
        System.out.println(" 4. Thoat khoi chuong trinh  ");
        Scanner s = new Scanner(System.in);
        DSCanBo ds = new DSCanBo();
        do{ 
            System.out.print("Hay lua chon chuc nang: ");
            int lc = s.nextInt();
            s.nextLine();
            switch (lc) {
                case 1: {
                    System.out.println("Lua chon can bo");
                    System.out.println("a. Cong Nhan");
                    System.out.println("b. Ky Su");
                    System.out.println("c. Nhan vien");
                    System.out.print("Ban muon them loai can bo nao?: ");
                    String loai = s.nextLine();
                    
                    switch (loai) {
                        case "a": {
                            System.out.print("Nhap ho ten: ");
                            String hoTen = s.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int tuoi = s.nextInt();
                            s.nextLine();
                            System.out.print("Nhap gioi tinh: ");
                            String gioiTinh = s.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String diaChi = s.nextLine();
                            System.out.print("Nhap cap bac cong nhan:");
                            int capBac = s.nextInt();
                            CanBo cn = new CongNhan(hoTen,tuoi,gioiTinh,diaChi,capBac);
                            ds.themCanBo(cn);
                            break;
                        }
                        case "b": {
                            break;
                        }
                        case "c": {
                            break;
                        }
                        default: {
                            System.out.println("Khong ton tai");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Tim kiem can bo theo ho ten");
                }
                case 3: {
                    System.out.println("hien thi thong tin ve danh sach can bo");
                    ds.inDSCanBo();
                }
                case 4:{
                    return;
                }
                default:{
                    System.out.println("khong ton tai lua chon nay");
                    continue;
                }
            }
           
        }while(true);
        
    }
}
