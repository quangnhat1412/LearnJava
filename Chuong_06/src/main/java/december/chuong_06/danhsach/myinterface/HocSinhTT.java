/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_06.danhsach.myinterface;

import december.chuong_06.danhsach.*;
import december.chuong_06.*;

/**
 *
 * @author AN515-45
 */

// Khai báo class trừu tượng (abstract)
public abstract class HocSinhTT {
    protected String maHS;
    protected String tenHS;
    protected String phai;

    public HocSinhTT(String maHS, String tenHS, String phai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }
    
    
    
    public void inThongTin(){
        System.out.println("- Ma: " + this.maHS +"\n- TenHS: " + this.tenHS + "\n- Phai: " +this.phai );
        
    }
    // Khai báo tính trung bình là phương thức trừu tượng
    public abstract String xepLoai();
    
}
