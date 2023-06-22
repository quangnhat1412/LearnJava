package december.chuong_07;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AN515-45
 */
public class XuLyChuoi {
    public static void main(String[] args) {
        String s = "LearnJavaOOP";
        String sa = "               LearnJavaOOP             ";
        // trich chuoi doi tuong 
        String s1 = s.substring(4, 7);
        System.out.println("chuoi tu vi tri thu 4 den truoc vi tri thu 7: "+s1); //nJa
        
        String s2 = s.substring(4); 
        System.out.println("Lay tu vi tri so 4 den het chuoi: "+ s2); //nJavaOOP
        
        int doDai = s.length();
        String s3 = s.substring(doDai - 3); 
        System.out.println("Lay 3 ki tu tu ben phai: "+ s3); //nJavaOOP
        
        // ham trim, toUpperCase, toLowerCase
        
        String s5 = sa.trim();
        System.out.println("ham xoa cac khoang trang dau chuoi va cuoi chuoi: "+s5);
        
        String s6 = s.toUpperCase();
        System.out.println("Ham chuyen ki tu thanh chu hoa: "+ s6);
        
        String s7 = s6.toLowerCase();
        System.out.println("Ham chuyen ki tu thanh chu hoa: "+ s7);
        
        
        // ham replaceAll => tim ca thay the chuoi con;
        String chuoiCha = "bro Long time no see, bro :))";
        String chuoiCon = "bro";
        String chuoiThayThe = "guy";
        
        String chuoiKQ = chuoiCha.replaceAll(chuoiCon, chuoiThayThe);
        System.out.println(chuoiKQ);
        
        // TIm vi tri bat dau cuar chuoi con trong chuoi cha
        int vt = chuoiCha.indexOf(chuoiCon);
        System.out.println("Vi tri bat dau cua chuoi con bro: " + vt); // vi tri dau tien tim thay dc
        
        int vt2 = chuoiCha.lastIndexOf(chuoiCon);
        System.out.println("Vi tri cuoi cung cua chuoi con bro: " + vt2); // vi tri cuoi cung cua chuoi con tim thay dc
        
        
        // Ung dung: cho mot chuoi chua ho va ten mot nguoi, In ra ten nguoi do ==> thi du: Tran Quang Nhat ==> In ra Nhat
        String name = "       Tran Quang Nhat         ";
        String name_catbo = name.trim();
        String kt = " ";
        int vtc = name_catbo.lastIndexOf(kt);
        String ten = name_catbo.substring(vtc + 1);
        System.out.println("Ten cua ban: "+ten);
        
        // Su dung ham split de chuyen 1 chuoi thanh mang voi cac phan tu theo ki tu phan cach cac tu trong chuoi
        String chuoi1 = "A001|Tran Quang Nhat|Nam|200000";
        String[] mang_tach = chuoi1.split("\\|");
        System.out.println("Mang nhan dc sau khi tach: "+ Arrays.toString(mang_tach));
        
        
        
       
    }
}
