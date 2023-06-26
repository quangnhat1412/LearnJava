/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modaujframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author AN515-45
 */
public class ThiDu_Layout extends JFrame{
    
    public ThiDu_Layout(){
        
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
       
        JTextField jtxt = new JTextField(20);
        jtxt.setHorizontalAlignment(JTextField.RIGHT);
        this.add(jtxt,BorderLayout.NORTH);
        
        // Tao panel der chua cac button
        Panel pn_c = new Panel();
        // gan layout cho panel
        pn_c.setLayout(new GridLayout(4,3,5,5));
        for (int i = 1; i <= 12; i++) {
            String btnText = null;
            if(i==10){
                btnText = "+/-";
            }
            else if(i==11){
                btnText = "0";
            }
            else if(i==12){
                btnText = ".";
            }
            else{
                btnText = Integer.toString(i);
            }
            JButton jbtn = new JButton(btnText);
            // pha sinh su kien va phuong thuc xu ly xu ly su kien
            jbtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lay thong tin cua btn dc click (phat ra su kien)
                    //JButton btn_click = (JButton)e.getSource();
                    //String giaTri = btn_click.getText();
                    //jtxt.setText(giaTri);
                    // rut gon
                    jtxt.setText(((JButton)e.getSource()).getText());
                    
                }
            });
            pn_c.add(jbtn);
        }
        this.add(pn_c,BorderLayout.CENTER);
        
        // Them panel chua cac btn cong tru nhan chia 
        Panel pn_e = new Panel(new GridLayout(6,1,5,5));
        
        JButton jbtn_xoa = new JButton("<-- backspace");
        pn_e.add(jbtn_xoa);
        JButton jbtn_cong = new JButton("Cong (+)");
        pn_e.add(jbtn_cong);
        JButton jbtn_tru = new JButton("Tru (-)");
        pn_e.add(jbtn_tru);
        JButton jbtn_nhan = new JButton("Nhan (*)");
        pn_e.add(jbtn_nhan);
        JButton jbtn_chia = new JButton("Chia (/)");
        pn_e.add(jbtn_chia);
        JButton jbtn_kq = new JButton("=");
        jbtn_kq.setBackground(Color.CYAN);
        pn_e.add(jbtn_kq);
        
        this.add(pn_e,BorderLayout.EAST);
        
        
        
        
        // Hien Thi JFrame 
        this.setVisible(true);
    }
    public static void main(String[] args) {
        ThiDu_Layout layout = new ThiDu_Layout();
        layout.khoiTao();
    }
    
}
