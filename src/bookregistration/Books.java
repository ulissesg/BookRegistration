/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookregistration;

/**
 *
 * @author ulisses
 */
public class Books {
    String name;
    String description;
    double value;
    String isbn;
    Author author = new Author();
    
    public void showInfo(){
        System.out.println("Name: " + this.name + "\n"
        + "Description: " + this.description + "\n"
        + "Value: " + this.value + "\n"
        + "ISBN: " + this.isbn);
    }
    
    public void priceAdjustment (double adjustment){
        this.value += this.value * adjustment;
    }   
}
