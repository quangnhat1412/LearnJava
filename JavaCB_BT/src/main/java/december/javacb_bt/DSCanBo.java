/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.javacb_bt;

import java.util.ArrayList;


/**
 *
 * @author AN515-45
 */
public class DSCanBo {
    private ArrayList<CanBo> danhsach;
    
    public DSCanBo(){
        this.danhsach = new ArrayList<>();
    }
    
    public void themCanBo(CanBo cb){
        this.danhsach.add(cb);
    }
    
    public void inDSCanBo(){
        for (CanBo canbo : danhsach){
            System.out.println(canbo.toString());
        }
    }
    
}
