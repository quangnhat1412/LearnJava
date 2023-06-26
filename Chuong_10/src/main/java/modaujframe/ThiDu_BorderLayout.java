/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modaujframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AN515-45
 */
public class ThiDu_BorderLayout extends JFrame{
    public ThiDu_BorderLayout(){
        
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
        
        JButton btn = new JButton("Phia Bac");
        btn.setFont(font);
        this.add(btn,BorderLayout.NORTH);
        JButton btn2 = new JButton("Phia Nam");
        btn2.setFont(font);
        this.add(btn2,BorderLayout.SOUTH);
        JButton btn3 = new JButton("Phia Dong");
        btn3.setForeground(Color.red);
        this.add(btn3,BorderLayout.EAST);
        JButton btn4 = new JButton("Phia Tay");
        btn.setForeground(Color.BLUE);
        this.add(btn4,BorderLayout.WEST);
        JButton btn5 = new JButton("Phia Center");
        btn5.setForeground(Color.cyan);
        this.add(btn5,BorderLayout.CENTER);       
        
        // Hien Thi JFrame 
        this.setVisible(true);
    }
    public static void main(String[] args) {
        ThiDu_BorderLayout fl = new ThiDu_BorderLayout();
        fl.khoiTao();
    }
}
