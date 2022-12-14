package resizeable;

public abstract class Shape implements Resizeable {
    private String color = "black";
    private boolean filled = false;

    public void setShape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        return "A shape with color of"
                + getColor()
                + "and"
                + (isFilled() ? "filled" : "not filled");
    }
    public static void printShape(Shape [] shape){
        for (Shape e : shape){
            System.out.println(e.toString());
        }
    }
}
