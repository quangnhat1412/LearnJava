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
public class DongVat {
    protected String ten;
    protected String mau;

    public DongVat(String ten, String mau) {
        this.ten = ten;
        this.mau = mau;
    }
    public void an(){
        System.out.println("Dong Vat biet an");
    }
    public void inThongTin(){
        System.out.println("- Cho: " + this.ten + "\n- Mau: " + this.mau);
    }
}
