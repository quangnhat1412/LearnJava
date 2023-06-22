/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan3;

/**
 *
 * @author AN515-45
 */
public class HocSinhCap1 extends HocSinh{
    private double diemToan;
    private double diemVan;
    
    public HocSinhCap1(){
        
    }

    public HocSinhCap1(String id, String name, int age, double diemToan, double diemVan) {
        super(id, name, age);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    @Override
    public String toString() {
        return super.toString() + " - Toan: " + this.diemToan + " - Van: " + this.diemVan; 
    }

    
    
}
