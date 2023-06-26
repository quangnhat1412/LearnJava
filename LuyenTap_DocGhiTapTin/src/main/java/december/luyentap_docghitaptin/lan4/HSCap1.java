/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan4;

import java.io.Serializable;

/**
 *
 * @author AN515-45
 */
public class HSCap1 extends HocSinh implements I_HocSinh, Serializable{
    private double tapLamVan;
    private double toan;

    public HSCap1() {
    }

    public HSCap1(String maHS, String tenHS, int tuoi, double tapLamVan, double toan) {
        super(maHS, tenHS, tuoi);
        this.tapLamVan = tapLamVan;
        this.toan = toan;
    }

    public double getTapLamVan() {
        return tapLamVan;
    }

    public void setTapLamVan(double tapLamVan) {
        this.tapLamVan = tapLamVan;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    @Override
    public String toString() {
        return super.toString() + " - xep loai: " + this.xepLoai() + " (HS1)"; 
    }

    @Override
    public String xepLoai() {
        if(this.diemTB()>5){
            return "Dat";
        }
        else{
            return "Khong dat";
        }
    }

    @Override
    public Double diemTB() {
        return (this.tapLamVan + this.toan)/2;
    }
    
    
    
}
