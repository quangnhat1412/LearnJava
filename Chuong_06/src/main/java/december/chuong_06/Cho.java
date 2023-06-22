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
public class Cho extends DongVat{
    private int soChan;

    public Cho(String ten, String mau, int soChan) {
//        this.ten = ten;
//        this.mau = mau;
        super(ten,mau);
        this.soChan = soChan;
    }
    
    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
    
    public void sua(){
        System.out.println("gau gau");
    }
    
//    public void inThongTin(){
//        super.inThongTin();
//        System.out.println("- So chan: " + this.soChan);
//    }

    @Override
    public void inThongTin() {
        super.inThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("- So chan: " + this.soChan);
    }
    
    
    
    
}
