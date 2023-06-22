/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_05;

/**
 *
 * @author AN515-45
 */
public class XuLySach {
    public static void main(String[] args) {
        Ngay ns1 = new Ngay(14, 12, 2002);
        TacGia tg1 = new TacGia("Tran Quang Nhat", ns1);
        Sach s1 = new Sach("Lap Trinh Java",199000,2022,tg1);
        
        Sach s2 = new Sach("Lap Trinh PHP", 299000, 2023, new TacGia("Messi", new Ngay(24,06,1987)));
        Sach s3 = new Sach("Thiet Ke He Thong", 499000, 2023, new TacGia("Tran Thi Phuong Nghi", new Ngay(16,12,2005)));
        Sach s4 = new Sach("Thiet Ke He Thong", 499000, 2023, new TacGia("Tran Thi Phuong Nghi", new Ngay(16,12,2005)));
        
        // Xuat ten sach 
        s1.XuatTenSach();
        s2.XuatTenSach();
        s3.XuatTenSach();
        
        // Xuat gia ban sau khi giam
        s1.XuatGiaSauGiam(10);
        s2.XuatGiaSauGiam(20);
        s3.XuatGiaSauGiam(30);
        
        // Xuat gia ban sau khi giam 
        
        System.out.println("s1 cung nam xuat ban s3: " + s1.XuatCungNam(s3));
        System.out.println("S2 cung nam xuat ban s3: " + s2.XuatCungNam(s3));
        
        
    }
}
