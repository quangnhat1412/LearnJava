/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin;

import java.util.Comparator;



/**
 *
 * @author AN515-45
 */

// Khai báo class trừu tượng (abstract)
public class HocSinh{
    private String maHS;
    private String tenHS;
    private int tuoi;

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
    
    public String getTen(){
        String ten_kkc = this.tenHS.trim();
        String kc = " ";
        int vtc = ten_kkc.lastIndexOf(kc);
        String ten = ten_kkc.substring(vtc + 1);
        return ten;
    }
    

    @Override
    public String toString() {
        return "- Ma HS: " + this.maHS + " - Ho ten: " + this.tenHS + " - tuoi: "+ this.tuoi;
    }
    
    
}
