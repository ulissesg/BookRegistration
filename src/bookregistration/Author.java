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
public class Author {
    String authorName;
    String authorEmail;
    String authorCpf;
    
    public void showAuthorInfo(){
        System.out.println("Author Name: " + this.authorName + "\n"
        + "Author Email: " + this.authorEmail + "\n"
        + "Author CPF: " + this.authorCpf + "\n");
    }
}
