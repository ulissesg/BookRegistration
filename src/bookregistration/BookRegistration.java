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
        PrintedBooks book1 = new PrintedBooks();
        EBooks book2 = new EBooks(); 
        
        book1.setName("Harry Potter and the deathly Hallows");
        book1.setDescription("is a fantasy novel written by British author J. K. Rowling and the seventh and final novel of the Harry Potter series.");
        book1.setValue(240.5);
        book1.setIsbn("5679238567946"); 
        book1.setDepth(6);
        book1.setHeight(25);
        book1.setWidth(15);
        book1.setWeight(0.8);
        book1.getAuthor().setAuthorName("J.K.Rowling");
        book1.getAuthor().setAuthorEmail("jkrowling@gmail.com");
        book1.getAuthor().setAuthorCpf("8965964184984");
        
        book2.setName("Outsider");
        book2.setDescription("is a horror novel by American author Stephen King, published on May 22, 2018, by Scribner.");
        book2.setValue(150.9);
        book2.setAsin("1596259591");
        book2.setFileSize(185);
        book2.setVocabularyTips(true);
        book2.getAuthor().setAuthorName("Stephen King");
        book2.getAuthor().setAuthorEmail("stephenking@gmail.com");
        book2.getAuthor().setAuthorCpf("5619862196849");
        
        book1.showInfo();
        book1.getAuthor().showAuthorInfo();
        book2.showInfo();
        book2.getAuthor().showAuthorInfo();
        
        if (!book1.priceAdjustment(31)){System.err.println("Reajust's too high");}
        
        if (!book2.priceAdjustment(6)){System.err.println("Reajust's too high");}
        
        book1.showInfo();
        book1.getAuthor().showAuthorInfo();
        book2.showInfo();
        book2.getAuthor().showAuthorInfo();
              
    }   
    
}
