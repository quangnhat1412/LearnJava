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
public class NhaSX {
    private String tenHangPhim;
    private String tenQuocGia;

    public NhaSX(String tenHangPhim, String tenQuocGia) {
        this.tenHangPhim = tenHangPhim;
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenHangPhim() {
        return tenHangPhim;
    }

    public void setTenHangPhim(String tenHangPhim) {
        this.tenHangPhim = tenHangPhim;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
    
    
}
