public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObject("Iphone"), createObject("Samsung"), createObject("Xiaomi")};
        for (Printable printable: printables) {
           printable.print();
        }
    }

    public static Printable createObject(String classname){
        switch (classname){
            case "Iphone":
                return new Iphone("Pink", 6.06);
            case "Samsung":
                return new Samsung(17000, "Samsung Exynos 9611 Octa");
            case "Xiaomi":
                return new Xiaomi("Mi 6X",32);
        }
        return null;
    }
}