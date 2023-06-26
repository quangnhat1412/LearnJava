/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan4;

/**
 *
 * @author AN515-45
 */
public class XuLyHS {
    public static void main(String[] args) {
        DSHocSinh dshs = new DSHocSinh();
        HocSinh hs = new HSCap2("LM30", "Lionel Messi", 36, 9, 10, 10);
        dshs.add(hs);
        // doc file txt vao danh sanh hoc sinh
        String path = "data4/text/dshocsinh.txt";
        dshs.docFile_txt(path);
        
        // in danh sach hoc sinh 
        dshs.printList();
        
//        // luu danh sach hoc sinh vao file json
        String path2 = "data4/json/dshocsinh.json";
        dshs.ghiDS_json(path2);
        
        // doc tap tin json vao danh sach hoc sinh
//        String path3 = "data4/json/dshocsinh.json";
//        dshs.docDS_json(path3);
//        dshs.printList();
        
        // Ghi dshs thanh tap tin dat
        //dshs.ghiDSHS_fileDat("data4/dat/dshs.dat");
        
        // Doc file dat vao danh sach hoc sinh
//        dshs.docDSHS_fileDat("data4/dat/dshs.dat");
//        dshs.printList();
    }
}
