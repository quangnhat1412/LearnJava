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
public class HocSinhMauGiao extends HocSinh{
    private int day_off;
    
    public HocSinhMauGiao (){
        
    }

    public HocSinhMauGiao(String id, String name, int age, int day_off) {
        super(id, name, age);
        this.day_off = day_off;
    }

    public int getDay_off() {
        return day_off;
    }

    public void setDay_off(int day_off) {
        this.day_off = day_off;
    }

    @Override
    public String toString() {
        return super.toString() + " - ngay vang: " + this.day_off  ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
