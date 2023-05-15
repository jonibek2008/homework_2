public class Iphone extends Phone{
    private String color;
    private double display;

    public Iphone(String color, double display) {
        this.color = color;
        this.display = display;
    }

    @Override
    public void print() {
        System.out.println("Color: " + color +
                "\nDisplay: " + display);
    }
}
