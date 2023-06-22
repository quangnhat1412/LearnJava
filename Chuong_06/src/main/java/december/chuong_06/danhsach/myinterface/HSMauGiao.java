/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_06.danhsach.myinterface;

/**
 *
 * @author AN515-45
 */
public class HSMauGiao extends HocSinhTT{
    private int soNgayVang;

    public HSMauGiao(String maHS, String tenHS, String phai, int soNgayVang) {
        super(maHS, tenHS, phai);
        this.soNgayVang = soNgayVang;
    }

    public int getSoNgayVang() {
        return soNgayVang;
    }

    public void setSoNgayVang(int soNgayVang) {
        this.soNgayVang = soNgayVang;
    }

    @Override
    public String xepLoai() {
        return this.soNgayVang > 10 ? "Suy Dinh Duong" : "Be Khoe Be Ngoan";
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("- Xep Loai: " + this.xepLoai());
    }
    
    
    
    
}
