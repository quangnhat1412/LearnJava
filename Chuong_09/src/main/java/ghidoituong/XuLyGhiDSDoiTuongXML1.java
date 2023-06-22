/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghidoituong;

import java.io.FileWriter;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XuLyGhiDSDoiTuongXML1 {
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A001", "Tran Quang Nhat", 22));
        ds.add(new HocSinh("A002", "Ly Cong Uan", 20));
        ds.add(new HocSinh("A003", "Le Loi", 25));
        ds.add(new HocSinh("A004", "Vo Thi Sau", 19));
        try {
            // Tao 2 doi tuong sau de phan tich, xu ly dc tai lieu xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong tai lieu xml
            Document doccument = builder.newDocument();
            // tao the goc chua cac the hocsinh
            Element DShocsinh = doccument.createElement("DShocsinh");
            // Them the vua tao vao tai lieu 
            doccument.appendChild(DShocsinh);
            // duyet qua arraylist va tao cac the hs tuong ung voi tung phan tu trong arraylist
            for(HocSinh hs : ds){
                // Tao the con HocSinh
                Element hocSinh = doccument.createElement("HocSinh");
                DShocsinh.appendChild(hocSinh);
                hocSinh.setAttribute("mahs", hs.getMaHS());
                hocSinh.setAttribute("tenhs", hs.getTenHS());
                hocSinh.setAttribute("tuoi", hs.getTuoi()+"");
            }
            // Tien hanh ghi tai lieu xml vao tap tin
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            
            FileWriter writer = new FileWriter("data/ghidoituong/dshocsinh1.xml");
            StreamResult result = new StreamResult(writer);
            
            DOMSource soure = new DOMSource(doccument);
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // cho phep tao xuong dong cho the
            transformer.transform(soure, result);
            System.out.println("ghi danh sach doi tuong vao tap tin thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi tap tin that bai !!!");
        }
    }
    
}
