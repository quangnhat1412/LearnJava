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
public class HSMauGiao extends HocSinh implements Serializable{
    private int buoiVang;

    public HSMauGiao() {
    }

    public HSMauGiao(String maHS, String tenHS, int tuoi, int buoiVang) {
        super(maHS, tenHS, tuoi);
        this.buoiVang = buoiVang;
    }

    public int getBuoiVang() {
        return buoiVang;
    }

    public void setBuoiVang(int buoiVang) {
        this.buoiVang = buoiVang;
    }

    @Override
    public String toString() {
        return super.toString() + " - Xep Loai: " + this.xepLoai() +" (HSMG)";
    }

    @Override
    public String xepLoai() {
        if(this.buoiVang >= 10){
            return "khong ngoan";
        }else if(this.buoiVang >= 5){
            return "Tam ngoan";
        }
        return "Ngoan";
    }
    
    
    
}
