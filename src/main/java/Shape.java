
public class Shape {
    
    private int BrdrWidth;
    private String brdrColor;
    
    public Shape() {
        BrdrWidth = 10;
        brdrColor = "BLUE";
    }
    public Shape(int b, String c) {
        BrdrWidth = b;
        brdrColor = c;
    }
    
    public void setBrdrWidth(int b) {
        BrdrWidth = b;
    }
    public int getBrdrWidth() {
        return BrdrWidth;
    }
    
}
