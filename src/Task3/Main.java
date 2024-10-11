package Task3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Cerc\nAria : "+circle.Aria(3));

        Square square = new Square();
        System.out.println("Patrat\nAria : "+square.Aria(4));

        Sphere sphere = new Sphere();
        System.out.println("Sfera\nAria : "+sphere.Aria(3)+"\nVolumul : "+sphere.Volum(3));

        Cube cube = new Cube();
        System.out.println("Cub\nAria : "+cube.Aria(3)+"\nVolumul : "+ cube.Volum(4));
    }



}
