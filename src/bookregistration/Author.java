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
    private String authorName;
    private String authorEmail;
    private String authorCpf;
    
    public void showAuthorInfo(){
        if (this.verifyAuthor() == true){
            System.out.println("Author Name: " + this.authorName + "\n"
            + "Author Email: " + this.authorEmail + "\n"
            + "Author CPF: " + this.authorCpf + "\n");
        }
        else{
            System.err.println("there`s no author");
        }
        
    }
    
     public boolean verifyAuthor (){
        if (this.authorName == null && this.authorEmail == null 
                && this.authorCpf == null){
            return false;
        }
        return true;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getAuthorCpf() {
        return authorCpf;
    }

    public void setAuthorCpf(String authorCpf) {
        this.authorCpf = authorCpf;
    }
}
