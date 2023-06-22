/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghidoituong;

import java.io.FileWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XuLyGhiDoiTuongXML1 {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("A001", "Tran Quang Nhat", 22);
        try {
            // Tao 2 doi tuong sau de phan tich, xu ly dc tai lieu xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong tai lieu xml
            Document doccument = builder.newDocument();
            // tao the (nut - node - Element)
            Element HocSinh = doccument.createElement("HocSinh");
            // Them the vua tao vao tai lieu 
            doccument.appendChild(HocSinh);
            // Tao lan luot cac the con va them vao the cha HocSinh
            Element mahs = doccument.createElement("mahs");
            HocSinh.appendChild(mahs);
            mahs.setTextContent(hs.getMaHS());
            
            Element tenhs = doccument.createElement("tenhs");
            HocSinh.appendChild(tenhs);
            tenhs.setTextContent(hs.getTenHS());
            
            Element tuoi = doccument.createElement("tuoi");
            HocSinh.appendChild(tuoi);
            tuoi.setTextContent(hs.getTuoi()+""); // bien so nguyen thanh chuoi +"" hoac String.valueOf(<songuyen>) hoac Interger.toString(songuyen)
            
            // Tien hanh ghi tai lieu xml vao tap tin
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            FileWriter writer = new FileWriter("data/ghidoituong/hocsinh1.xml");
            StreamResult result = new StreamResult(writer);
            DOMSource soure = new DOMSource(doccument);
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // cho phep tao xuong dong cho the
            transformer.transform(soure, result);
            System.out.println("ghi doi tuong vao tap tin thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi tap tin that bai !!!");
        }
    }
    
}
