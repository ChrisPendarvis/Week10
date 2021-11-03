
public class Rectangle extends Shape {
    
    private int width;
    private int height;
    
    public Rectangle(int sz) {
        super(50, "RED");
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void setHeight(int h) {
        height = h;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setBrdrWidth(int b){
        
    }
}
