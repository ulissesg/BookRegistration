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
        
        book1.name = "Harry Potter and the deathly Hallows";
        book1.description = "is a fantasy novel written by British author J. K. Rowling and the seventh and final novel of the Harry Potter series.";
        book1.value = 240.5;
        book1.isbn = "5679238567946";        
        book1.author.authorName = "J.K.Rowling";
        book1.author.authorEmail = "jkrowling@gmail.com";
        book1.author.authorCpf = "8965964184984";
        
        book2.name = "Outsider";
        book2.description = "is a horror novel by American author Stephen King, published on May 22, 2018, by Scribner.";
        book2.value = 150.9;
        book2.isbn = "8624319674298";
        book2.author.authorName = "Stephen King";
        book2.author.authorEmail= "stephenking@gmail.com";
        book2.author.authorCpf = "5619862196849";
        
        book1.showInfo();
        book1.author.showAuthorInfo();
        book2.showInfo();
        book2.author.showAuthorInfo();
        
        book1.priceAdjustment(1.5);
        book2.priceAdjustment(1.5);
        
        book1.showInfo();
        book1.author.showAuthorInfo();
        book2.showInfo();
        book2.author.showAuthorInfo();
              
    }
    
}
