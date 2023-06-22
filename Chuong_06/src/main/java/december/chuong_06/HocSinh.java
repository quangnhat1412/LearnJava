/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_06;

/**
 *
 * @author AN515-45
 */
public class HocSinh {
    protected String maHS;
    protected String tenHS;
    protected String phai;

    public HocSinh(String maHS, String tenHS, String phai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
    }
    
    
    public void inThongTin(){
        System.out.println("- Ma: " + this.maHS +"\n- TenHS: " + this.tenHS + "\n- Phai: " +this.phai );
    }
    
    public double tinhTB(){
        return 0;
    }
    public String xepLoai(){
        return "";
    }
}
