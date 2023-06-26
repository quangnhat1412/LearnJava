/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modaujframe;

import javax.swing.JFrame;

/**
 *
 * @author AN515-45
 */
public class MyWindow extends JFrame{

    public MyWindow(){
        
    }
    public void khoiTao(){
        // thiet lap cac thuoc tinh quan trong 
        //1. Thiet lap tieu de
        this.setTitle("Chuong Trinh Dau Tien Demo Jframe 2");
        
        //2. Thiet lap kich thuoc 
        this.setSize(400,300);
        
        //3. Thiet lap vi tri hien thi theo toa do x, y
        //myJFrame.setLocation(30,60);
        
        //3bis ==> Canh giua cua so theo man hinh lamf viec
        this.setLocationRelativeTo(null);
        
        //4. Thiet lap che do dung chuong trinh khi nhan nut close;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //5. Thie lap khong thay doi kich thuoc
        this.setResizable(false);
        
        // Hien Thi JFrame 
        this.setVisible(true);
    }
    public static void main(String[] args) {
        MyWindow mw = new MyWindow();
        mw.khoiTao();
    }
    
}
