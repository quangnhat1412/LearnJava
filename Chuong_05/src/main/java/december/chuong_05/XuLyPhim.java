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
public class XuLyPhim {
    public static void main(String[] args) {
        
        // Khoi tao phim 
        Phim p1 = new Phim("Avengers 4: End Game", new NhaSX("Marvel", "USA"), 65000, new Ngay(14,12,2002));
        Phim p2 = new Phim("Fast And Furious 9", new NhaSX("Disney", "USA"), 70000, new Ngay(14,12,2002));
        Phim p3 = new Phim("Spider men: No Way Home", new NhaSX("Marvel", "USA"), 55000, new Ngay(16,12,2005));
        
        // xuat thong ten phim 
        p1.XuatTenPhim();
        p2.XuatTenPhim();
        p3.XuatTenPhim();
        
        // Tinh gia ban ve sau khuyen mai 
        p1.GiaBanSauKhuyenMai(30);
        p2.GiaBanSauKhuyenMai(15);
        
        // So sanh gia ve cua 2 phim 
        p1.SSgiave(p2);
        p2.SSgiave(p1);
        p3.SSgiave(p2);
        
        // Kiem tra cac phim co ngay chieu giong nhau khong
        System.out.println("Ngay chieu 2 phim co trung ? " + p1.CheckNgayChieu(p2));
        System.out.println("Ngay chieu 2 phim co trung ? " + p1.CheckNgayChieu(p3));
        
        
    }
}
