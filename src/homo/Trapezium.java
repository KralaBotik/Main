package homo;

public class Trapezium {
    private double width;
    private double height;
    private static int count = 0;
    private static int aut = 1;

    public Trapezium() {
        this(0, 0);
        count++;
    }

    public Trapezium(double width, double height) {
        this.width = width;
        this.height = height;
        count++;
    }
    public Trapezium(double height){
        this(0, height);
        count++;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return (width + height) / 2.0 * height;
    }
    public double getPerimeter() {
        double side = Math.sqrt(Math.pow((width - height) / 2.0, 2) + Math.pow(height, 2));
        return width + height + 2 * side;
    }
    public static int getCount() {
        return count;
    }
    public static int getAutist() {
        return aut++;
    }
}