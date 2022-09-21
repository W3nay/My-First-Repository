public class Fruits extends Plants {

    String color;

    public Fruits(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static void setColor(String color) {
        return color;
    }
}