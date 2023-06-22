/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.javacb_bt.tailieu;

/**
 *
 * @author AN515-45
 */
public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }
    
    public Sach(String maTaiLieu, String tenNXb, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNXb, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("; ten tac gia: " +this.tenTacGia + "; so trang: " + this.soTrang);
    }
    
    
    
}
