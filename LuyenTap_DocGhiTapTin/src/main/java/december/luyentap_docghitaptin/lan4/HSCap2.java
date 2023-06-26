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
public class HSCap2 extends HocSinh implements I_HocSinh, Serializable{
    private double ly;
    private double tiengAnh;
    private double hoa;

    public HSCap2() {
    }

    public HSCap2(String maHS, String tenHS, int tuoi, double ly, double tiengAnh, double hoa) {
        super(maHS, tenHS, tuoi);
        this.ly = ly;
        this.tiengAnh = tiengAnh;
        this.hoa = hoa;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(double tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public String xepLoai() {
        if(this.diemTB() >= 9 )return "Xuat sac";
        else if(this.diemTB()>= 8) return "Gioi";
        else if(this.diemTB()>= 6.5) return "Kha";
        else if(this.diemTB()>= 5) return "Trung binh";
        return "Yeu";
    }

    @Override
    public Double diemTB() {
        return (this.hoa * 2 + this.ly * 2 + this.tiengAnh)/5;
    }

    @Override
    public String toString() {
        return super.toString() + " - Diem TB: " + this.diemTB() + " - " + this.xepLoai() + " (HS2)"; 
    }
    
    
    
    
    
}
