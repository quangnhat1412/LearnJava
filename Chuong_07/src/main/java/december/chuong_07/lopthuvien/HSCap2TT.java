/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_07.lopthuvien;

import december.chuong_07.*;



/**
 *
 * @author AN515-45
 */
public class HSCap2TT extends HocSinhTT{
    private double diemVan;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public HSCap2TT(String maHS, String tenHS, String phai,int tuoi, double diemVan, double diemToan, double diemLy, double diemHoa) {
        super(maHS, tenHS, phai, tuoi);
        this.diemVan = diemVan;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
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
    public void inThongTin() {
        super.inThongTin();
        System.out.println("- Diem trung binh: " + this.tinhTB() + "\n- Xep loai: " + this.xepLoai());
        System.out.println("----------------------------------------");
    }

    @Override
    public double tinhTB() {
        return (this.diemToan *2 + this.diemVan*2 + this.diemHoa + this.diemLy)/ 6;
    }

    @Override
    public String xepLoai() {
        double dtb = tinhTB();
        if(dtb >= 9){
            return "Xuat Sac";
        }
        else if(dtb >= 8){
            return "Gioi";
        }
        else if(dtb >= 6.5){
            return "Kha";
        }
        else if(dtb >= 5){
           return "Trung binh";
        }
        return "Yeu";
    }
}
