/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AN515-45
 */
public class DanhSachHS {

    public ArrayList<HocSinh> hocsinhs;

    public DanhSachHS() {
        this.hocsinhs = new ArrayList<>();
    }

    public DanhSachHS(ArrayList<HocSinh> hocsinhs) {
        this.hocsinhs = hocsinhs;
    }

    public ArrayList<HocSinh> getHocsinhs() {
        return hocsinhs;
    }

    public void add(HocSinh hs) {
        this.hocsinhs.add(hs);
    }

    public void remove(HocSinh hs) {
        //this.hocsinhs.remove(hs); // xoa bang ten hs

        // xoa bang vi tri 
        int vt = this.hocsinhs.indexOf(hs);
        this.hocsinhs.remove(vt);
    }

    public void printList() {
        for (HocSinh hs : this.hocsinhs) {
            System.out.println(hs);
        }
    }

    public void saveList() {
        for (HocSinh hs : this.hocsinhs) {
            String path1 = null;
            String chuoiHS = hs.id + ";" + hs.getName() + ";" + hs.getAge();
            if (hs instanceof HocSinhMauGiao) {
                path1 = "data2/maugiao/" + hs.getId() + ".txt";
                chuoiHS += ";" + ((HocSinhMauGiao) hs).getDay_off();

            }
            if (hs instanceof HocSinhCap2) {
                path1 = "data2/cap2/" + hs.getId() + ".txt";
                chuoiHS += ";" + ((HocSinhCap2) hs).getDiemHoa() + ";" + ((HocSinhCap2) hs).getDiemLy() + ";" + ((HocSinhCap2) hs).getDiemTA();
            }
            if (hs instanceof HocSinhCap1) {
                path1 = "data2/cap1/" + hs.getId() + ".txt";
                chuoiHS += ";" + ((HocSinhCap1) hs).getDiemToan() + ";" + ((HocSinhCap1) hs).getDiemVan();
            }

            try {
                FileWriter file1 = new FileWriter(path1);
                BufferedWriter ghi_file = new BufferedWriter(file1);
                ghi_file.write(chuoiHS);
                ghi_file.close();
            } catch (IOException ex) {
                System.out.println("Ghi tap tin that bai");
            }

        }
    }

}
