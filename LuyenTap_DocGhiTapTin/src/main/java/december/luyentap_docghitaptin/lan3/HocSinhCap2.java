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
public class HocSinhCap2 extends HocSinh{
    private double diemHoa;
    private double diemLy;
    private double diemTA;

    public HocSinhCap2() {
    }

    public HocSinhCap2(String id, String name, int age, double diemHoa, double dimeLy, double diemTA) {
        super(id, name, age);
        this.diemHoa = diemHoa;
        this.diemLy = dimeLy;
        this.diemTA = diemTA;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double dimeLy) {
        this.diemLy = dimeLy;
    }

    public double getDiemTA() {
        return diemTA;
    }

    public void setDiemTA(double diemTA) {
        this.diemTA = diemTA;
    }

    @Override
    public String toString() {
        return super.toString() + " - Hoa: " + this.diemHoa + " - Ly: " + this.diemLy + " - Tieng Anh: " + this.diemTA; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
