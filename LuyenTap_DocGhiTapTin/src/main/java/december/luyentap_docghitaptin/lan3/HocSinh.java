/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan3;

/**
 *
 * @author AN515-45
 */
public class HocSinh {
    protected String id;
    protected String name;
    protected int age;

    public HocSinh(){
        
    }
    
    public HocSinh(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "- " + this.id + " - " + this.name + " - " + this.age + " tuoi";
    }
    
    
}
