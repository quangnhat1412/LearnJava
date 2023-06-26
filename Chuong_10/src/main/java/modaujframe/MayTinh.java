/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modaujframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author AN515-45
 */
public class MayTinh extends JFrame{
    public MayTinh(){
        
    }
    public void khoiTao(){
        // thiet lap cac thuoc tinh quan trong 
        //1. Thiet lap tieu de
        this.setTitle("Chuong Trinh GridLayout");
        
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
        this.setLayout(new BorderLayout());
        Font font = new Font("Arial",Font.BOLD,20);
        
        // tao panel trung tam chua cac dieu khien 
        Panel pnl = new Panel();
        for (int i = 1; i <= 24; i++) {
            String btnText = null;
            if(i==1){
                btnText = "%";
            }
            else if(i==2){
                btnText = "CE";
            }
            JButton jbtn = new JButton(btnText);
            pnl.add(jbtn);
        }

        // Hien Thi JFrame 
        this.setVisible(true);
    }
    public static void main(String[] args) {
        MayTinh mt = new MayTinh();
        mt.khoiTao();
    }
}
