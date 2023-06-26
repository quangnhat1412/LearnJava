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
public class ThiDuJframe_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myJFrame = new JFrame();
        // thiet lap cac thuoc tinh quan trong 
        //1. Thiet lap tieu de
        myJFrame.setTitle("Chuong Trinh Dau Tien Demo Jframe");
        
        //2. Thiet lap kich thuoc 
        myJFrame.setSize(400,300);
        
        //3. Thiet lap vi tri hien thi theo toa do x, y
        //myJFrame.setLocation(30,60);
        
        //3bis ==> Canh giua cua so theo man hinh lamf viec
        myJFrame.setLocationRelativeTo(null);
        
        //4. Thiet lap che do dung chuong trinh khi nhan nut close;
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //5. Thie lap khong thay doi kich thuoc
        myJFrame.setResizable(false);
        
        // Hien Thi JFrame 
        myJFrame.setVisible(true);
    }
    
}
