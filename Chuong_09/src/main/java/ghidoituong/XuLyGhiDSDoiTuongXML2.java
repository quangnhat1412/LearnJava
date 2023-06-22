/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghidoituong;

import java.io.File;
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

public class XuLyGhiDSDoiTuongXML2 {

    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A001", "Tran Quang Nhat", 22));
        ds.add(new HocSinh("A002", "Ly Cong Uan", 20));
        ds.add(new HocSinh("A003", "Le Loi", 25));
        ds.add(new HocSinh("A004", "Vo Thi Sau", 19));
        // duyet qua arraylist va tao cac the hs tuong ung voi tung phan tu trong arraylist
        for (HocSinh hs : ds) {
            Document tl = taoTaiLieu(hs);
            ghiTaiLieu(tl);
        }
    }

    public static Document taoTaiLieu(HocSinh hs) {
        Document document = null;
        try {
            // Tao 2 doi tuong sau de phan tich, xu ly dc tai lieu xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong tai lieu xml
            document = builder.newDocument();
            // tao the goc chua cac the hocsinh
            Element hocSinh = document.createElement("HocSinh");
            // Them the vua tao vao tai lieu 
            document.appendChild(hocSinh);
            // duyet qua arraylist va tao cac the hs tuong ung voi tung phan tu trong arraylist
            hocSinh.setAttribute("mahs", hs.getMaHS());
            hocSinh.setAttribute("tenhs", hs.getTenHS());
            hocSinh.setAttribute("tuoi", hs.getTuoi() + "");

        } catch (Exception e) {
            System.out.println("Ghi tap tin that bai !!!");
        }
        return document;
    }

    public static void ghiTaiLieu(Document doc) {
        try {
            // Tien hanh ghi tai lieu xml vao tap tin
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();

            // Lay maHS thong qua document va lay nut goc
            Element hocsinh = doc.getDocumentElement();
            String mahs = hocsinh.getAttribute("mahs");
            String dd = "data/ghidoituong/DSHS/" + mahs + ".xml";
            FileWriter writer = new FileWriter(dd);
            StreamResult result = new StreamResult(writer);
            DOMSource soure = new DOMSource(doc);
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // cho phep tao xuong dong cho the
            transformer.transform(soure, result);
            System.out.println("ghi danh sach doi tuong vao tap tin thanh cong");
            writer.close();
        } catch (Exception e) {
            System.out.println("ghi that bai");
        }

    }
}
