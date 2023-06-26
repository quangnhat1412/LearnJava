/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modaujframe;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author AN515-45
 */
public class TinhToan extends JFrame{
    public TinhToan(){
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
       
        // Hien Thi JFrame 
        this.setVisible(true);
        
        // khoi tao JFrame 
        // Tao header
        this.setLayout(new BorderLayout());
        JLabel jlbl = new JLabel("Chuong Trinh Tinh Toan");
        jlbl.setHorizontalAlignment(JLabel.CENTER);
        jlbl.setFont(font);
        this.add(jlbl,BorderLayout.NORTH);
        
        // Tao footer
        JPanel pnl_f = new JPanel();
        JButton btnCong = new JButton("Cong");
        btnCong.setHorizontalAlignment(JLabel.CENTER);
        btnCong.setFont(font);
        pnl_f.add(btnCong);
    }
    
    public static void main(String[] args) {
        TinhToan tt = new TinhToan();
        tt.khoiTao(); 
    }
}
