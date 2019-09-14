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
public class BookRegistration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Books book1 = new Books();
        Books book2 = new Books(); 
        
        book1.setName("Harry Potter and the deathly Hallows");
        book1.setDescription("is a fantasy novel written by British author J. K. Rowling and the seventh and final novel of the Harry Potter series.");
        book1.setValue(240.5);
        book1.setIsbn("5679238567946");        
        book1.author.setAuthorName("J.K.Rowling");
        book1.author.setAuthorEmail("jkrowling@gmail.com");
        book1.author.setAuthorCpf("8965964184984");
        
        book2.setName("Outsider");
        book2.setDescription("is a horror novel by American author Stephen King, published on May 22, 2018, by Scribner.");
        book2.setValue(150.9);
        book2.setIsbn("8624319674298");
        book2.author.setAuthorName("Stephen King");
        book2.author.setAuthorEmail("stephenking@gmail.com");
        book2.author.setAuthorCpf("5619862196849");
        
        book1.showInfo();
        book1.author.showAuthorInfo();
        book2.showInfo();
        book2.author.showAuthorInfo();
        
        if (!book1.priceAdjustment(31)){System.err.println("Reajust too high");}
        
        if (!book2.priceAdjustment(1.5)){System.err.println("Reajust too high");}
        
        book1.showInfo();
        book1.author.showAuthorInfo();
        book2.showInfo();
        book2.author.showAuthorInfo();
              
    }   
    
}
