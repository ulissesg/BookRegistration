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
    private String name;
    private String description;
    private double value;
    Author author = new Author();
    
    public Books(){
        this.name = "xxxxxxxxxxxxxxxx";
        this.description = "xxxxxxxxxxxxxxxxxxx";
    }
    
    public void showInfo(){
    }
    
    public boolean priceAdjustment (double adjustment){
        if (adjustment <= 30){
            this.value += this.value * adjustment;
            return true;
        }  
        return false;
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
