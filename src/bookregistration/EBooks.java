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
public class EBooks extends Books {
    private String asin;
    private boolean vocabularyTips;
    private double fileSize;
    
    public EBooks(){
        this.asin = "xxxxxxxxxx";
    }
    
    @Override
    public void showInfo(){
        System.out.println("Name: " + this.getName() + "\n"
        + "Description: " + this.getDescription() + "\n"
        + "Value: " + this.getValue() + "\n"
        + "ASIN: " + this.getAsin() + "\n"
        + "ISBN - 13: " + this.getIsbn13() + "\n"
        + "ISBN - 10: " + this.getIsbn10() + "\n"
        + "Vocabulary Tips: " + this.isVocabularyTips() + "\n"
        + "File Size: " + this.getFileSize());
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public boolean isVocabularyTips() {
        return vocabularyTips;
    }

    public void setVocabularyTips(boolean vocabularyTips) {
        this.vocabularyTips = vocabularyTips;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

   
}
