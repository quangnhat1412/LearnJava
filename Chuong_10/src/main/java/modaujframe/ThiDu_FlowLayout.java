/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modaujframe;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AN515-45
 */
public class ThiDu_FlowLayout extends JFrame{
    public ThiDu_FlowLayout(){
        
    }
    public void khoiTao(){
        // thiet lap cac thuoc tinh quan trong 
        //1. Thiet lap tieu de
        this.setTitle("Chuong Trinh FlowLayout");
        
        //2. Thiet lap kich thuoc 
        this.setSize(400,300);
        
        //3. Thiet lap vi tri hien thi chinh giua man hinh
        this.setLocationRelativeTo(null);
        
        //4. Thiet lap che do dung chuong trinh khi nhan nut close;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //5. Thie lap khong thay doi kich thuoc
        //this.setResizable(false);
        
        //6. Tao cac dieu khien JButton tren cua so
        // ==> thiet lap FlowLayout cho cua so 
        this.setLayout(new FlowLayout());
        for (int i = 0; i < 20; i++) {
            JButton button = new JButton(i+"");
            this.add(button);
        }
        // Hien Thi JFrame 
        this.setVisible(true);
    }
    public static void main(String[] args) {
        ThiDu_FlowLayout fl = new ThiDu_FlowLayout();
        fl.khoiTao();
    }
}
