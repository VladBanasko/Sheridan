/*
 * Vladyslav Banasko
 *  ID 991528801
 * Web programming SYS 10199
 */
package oopclass3;

/**
 *
 * @author Dell
 */
public class Student {
    
   private String name;
   private int ID;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" + "name= " + name + ", ID= " + ID + '}';
    }

    
   
  
          
    
}
