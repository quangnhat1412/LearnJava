/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap.nguoilaodong;

import december.baitap.myinterface.I_CapNhapDanhSach;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class DSNguoiLaoDong implements I_CapNhapDanhSach<NguoiLaoDong>{
    private ArrayList<NguoiLaoDong> danhsach;
    
    public DSNguoiLaoDong(){
        this.danhsach = new ArrayList<>();
    }

    public ArrayList<NguoiLaoDong> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(ArrayList<NguoiLaoDong> danhsach) {
        this.danhsach = danhsach;
    }
    
    public void add(NguoiLaoDong nld){
        this.danhsach.add(nld);
    }
    
    public void remove(NguoiLaoDong nld){
        this.danhsach.remove(nld);
    }
    
    public void printList(){
        System.out.println("Danh Sach Nguoi Lao Dong");
        for(NguoiLaoDong nld : this.danhsach){
            nld.xuatThongTin();
        }
    }
    
    public double tongThuNhap(){
        double tongTT = 0;
        for(NguoiLaoDong nld : this.danhsach){
            tongTT += nld.ThuNhap();
        }
        return tongTT;
    }
    public int tongSoNLD(){
        return this.danhsach.size();
    }
    
    public double thuNhapLonNhat(){
        double maxTT =0;
        for(NguoiLaoDong nld : this.danhsach){
            if(maxTT < nld.ThuNhap()){
                maxTT = nld.ThuNhap();
            }
        }
        return maxTT;
    }
}
