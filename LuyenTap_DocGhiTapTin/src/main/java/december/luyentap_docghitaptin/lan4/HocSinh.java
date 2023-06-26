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
public abstract class HocSinh implements Serializable{
    protected String maHS;
    protected String tenHS;
    protected int tuoi;

    public HocSinh() {
    }

    public HocSinh(String maHS, String tenHS, int tuoi) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoi = tuoi;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Hoc Sinh: - " + this.maHS + " - " + this.tenHS + " - " + this.tuoi;
    }
    
    public abstract String xepLoai();
    
}
