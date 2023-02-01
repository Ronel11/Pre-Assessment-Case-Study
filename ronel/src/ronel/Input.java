/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mj;

/**
 *
 * @author dell
 */
public class Input extends Item {
    
    private String put = "Input";
    
    public Input(String name, String con, String avail) {
        super(name, con, avail);
    }
    
    public void showInfo() {
        System.out.println("\n" + this.put + "\n" + getAvail() + "\nItem: " + getName() + "\nCondition: " + getCon() + "\n");
    }
    
    public void getInput() {
        System.out.println("\n" + this.put + "\n" + getAvail() + "\nItem: " + getName() + "\nCondition: " + getCon() + "\n");
    }
}