package bookregistration;

/**
 *
 * @author ulisses
 */
public class PrintedBooks extends Books{
    private double height;
    private double width;
    private double depth;
    private double weight;
    private String isbn;
    
    public PrintedBooks(){
        this.isbn = "000-0-00-000000-0";
    }
    
    @Override
    public void showInfo(){
        System.out.println("Name: " + this.getName() + "\n"
        + "Description: " + this.getDescription() + "\n"
        + "Value: " + this.getValue() + "\n"
        + "ISBN: " + this.getIsbn() + "\n"
        + "Width: " + this.getWidth() + "\n"
        + "Height: " + this.getHeight() + "\n"
        + "Depth: " + this.getDepth() + "\n"
        + "Weight: " + this.getWeight());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
