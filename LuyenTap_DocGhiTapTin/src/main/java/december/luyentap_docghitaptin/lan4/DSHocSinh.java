/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan4;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author AN515-45
 */
public class DSHocSinh {

    public ArrayList<HocSinh> dshs;

    public DSHocSinh() {
        this.dshs = new ArrayList<>();
    }

    public DSHocSinh(ArrayList<HocSinh> dshs) {
        this.dshs = dshs;
    }

    public ArrayList<HocSinh> getDshs() {
        return dshs;
    }

    public void add(HocSinh hs) {
        this.dshs.add(hs);
    }

    public void remove(HocSinh hs) {
        // this.dshs.remove(hs);
        // Xoa theo chi so trong danh sach 
        int vt = this.dshs.indexOf(hs);
        this.dshs.remove((vt));
    }

    public void printList() {
        for (HocSinh hs : this.dshs) {
            System.out.println(hs);
        }
    }

    public void docFile_txt(String path) {
        // Tao duong dan cua file txt

        // Tao doi tuong thuc hien doc tap tin
        try {
            FileReader file = new FileReader(path);
            BufferedReader doc_file = new BufferedReader(file);
            String dong;
            while ((dong = doc_file.readLine()) != null) {
                if (dong.isEmpty()) {
                    continue;
                }
                String[] mangdong = dong.trim().split(";");
                HocSinh hs;
                if (mangdong.length == 4) {
                    hs = new HSMauGiao(mangdong[0], mangdong[1], Integer.parseInt(mangdong[2]), Integer.parseInt(mangdong[3]));
                    this.dshs.add(hs);
                }
                if (mangdong.length == 5) {
                    hs = new HSCap1(mangdong[0], mangdong[1], Integer.parseInt(mangdong[2]), Double.parseDouble(mangdong[3]), Double.parseDouble(mangdong[4]));
                    this.dshs.add(hs);
                }
                if (mangdong.length == 6) {
                    hs = new HSCap2(mangdong[0], mangdong[1], Integer.parseInt(mangdong[2]), Double.parseDouble(mangdong[3]), Double.parseDouble(mangdong[4]), Double.parseDouble(mangdong[5]));
                    this.dshs.add(hs);
                } else {
                    continue;
                }
            }
            doc_file.close();
            System.out.println("Doc Tep tin txt thanh cong");

        } catch (IOException ex) {
            System.out.println("Doc tep tin txt that bai");
        }

    }

    public void ghiDS_json(String path) {
        Gson gson = new Gson();
        try {
            FileWriter ghi_file = new FileWriter(path);
            gson.toJson(this.dshs, ghi_file);
            ghi_file.close();
            System.out.println("Ghi tap tin json thanh cong");
        } catch (IOException ex) {
            System.out.println("Ghi tap tin json that bai");
        }
    }

    public void ghiDS_json2(String path) {
        Gson gson = new Gson();
        try {
            FileWriter ghi_file = new FileWriter(path);
            JsonWriter jsonWriter = new JsonWriter(ghi_file);
            jsonWriter.setIndent("  ");

            jsonWriter.beginArray(); // Bắt đầu một mảng JSON

            for (HocSinh hs : this.dshs) {
                jsonWriter.beginObject(); // Bắt đầu một đối tượng JSON

                jsonWriter.name("class").value(hs.getClass().getName()); // Ghi thông tin về tên lớp

                // Chuyển đổi đối tượng thành JSON và ghi vào file
                jsonWriter.name("data").jsonValue(gson.toJson(hs));

                jsonWriter.endObject(); // Kết thúc đối tượng JSON
            }

            jsonWriter.endArray(); // Kết thúc mảng JSON

            jsonWriter.close();
            ghi_file.close();
            System.out.println("Ghi tap tin json thanh cong");
        } catch (IOException ex) {
            System.out.println("ghi tap tin json that bai");
            ex.printStackTrace();
        }

    }

    public void docDS_json(String path) {

    }

    public void ghiDSHS_fileDat(String path) {
        try {
            FileOutputStream file_out = new FileOutputStream(path);
            ObjectOutputStream obj_out = new ObjectOutputStream(file_out);
            obj_out.writeObject(this.dshs);
            obj_out.flush();
            file_out.close();
            obj_out.close();
            System.out.println("Ghi tap tin dat thanh cong");
        } catch (IOException ex) {
            System.out.println("Ghi tap tin dat that bai");
            ex.printStackTrace();
        }
    }

    public void docDSHS_fileDat(String path) {
        try {
            FileInputStream file_in = new FileInputStream(path);
            ObjectInputStream obj_in = new ObjectInputStream(file_in);
            this.dshs = (ArrayList<HocSinh>) obj_in.readObject();
            file_in.close();
            obj_in.close();
            System.out.println("Doc tap tin dat thanh cong");
        } catch (Exception ex) {
            System.out.println("Doc tap tin dat that bai");
            ex.printStackTrace();
        }
    }
}
