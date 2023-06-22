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
public class HSCap1TT extends HocSinhTT implements I_HocSinh{
    private double diemVan;
    private double diemToan;

    public HSCap1TT(String maHS, String tenHS, String phai, double diemVan, double diemToan) {
        super(maHS, tenHS, phai);
        this.diemVan = diemVan;
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }


    @Override
    public double tinhTB() {
        return (this.diemToan + this.diemVan )/ 2;
    }

    @Override
    public String xepLoai() {
        return this.tinhTB() >=5 ? "Dat" : "Khong Dat";
    }
    @Override
    public void inThongTin() {
        super.inThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("- Diem trung binh: " + this.tinhTB() + "\n- Xep loai: " + this.xepLoai());
        System.out.println("----------------------------------------");
    }
   
}
