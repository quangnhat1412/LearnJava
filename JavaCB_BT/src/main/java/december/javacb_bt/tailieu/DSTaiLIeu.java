/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.javacb_bt.tailieu;

import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class DSTaiLIeu {
    public ArrayList<TaiLieu> danhsach;

    public DSTaiLIeu() {
        this.danhsach = new ArrayList<>();
    }

    public ArrayList<TaiLieu> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(ArrayList<TaiLieu> danhsach) {
        this.danhsach = danhsach;
    }
    
    public void add(TaiLieu tlm){
        for (TaiLieu tl : this.danhsach){
            if(tlm.maTaiLieu == null ? tl.maTaiLieu == null : tlm.maTaiLieu.equals(tl.maTaiLieu)){
                System.out.println("Ma tai lieu da ton tai");
                return;
            }
        }
        this.danhsach.add(tlm);
        System.out.println("Them tai lieu thanh cong !");
        
    }
    
    public void remove(String mtl){
        for (TaiLieu tlx : this.danhsach){
            if(tlx.maTaiLieu == null ? mtl == null : tlx.maTaiLieu.equals(mtl)){
                this.danhsach.remove(tlx);
                System.out.println("Da xoa tai lieu: " + tlx.maTaiLieu +" thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay tai lieu can xoa");
    }
    
    public void printList(){
        for (TaiLieu ds : this.danhsach){
            ds.inThongTin();
        }
    }
    
    public void timKiemSach(){
        TaiLieu sach = new Sach();
        for (TaiLieu tl : this.danhsach){
            if(tl.equals(sach)){
                tl.inThongTin();
            }
        }
    }
}
