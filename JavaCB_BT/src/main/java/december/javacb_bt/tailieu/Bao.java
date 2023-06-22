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
public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public Bao() {
    }

    public Bao(String maTaiLieu, String tenNXb, int soPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNXb, soPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("; ngay phat hanh: "+this.ngayPhatHanh);
    }
    
    
    
    
}
