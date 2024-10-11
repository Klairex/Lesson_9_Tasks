package Task2;

public class Main {
    public static void main(String[] args) {
        Paralelogram paralelogram= new Paralelogram();
        System.out.println("Dreptungi cu lungimea 4 si latimea 2");
        System.out.println("Perimetru : "+paralelogram.calcularePerimetru(4,2)+"\nAria : "+paralelogram.calculareArea(4,2));
        System.out.println();
        System.out.println("Patrat cu latura 5");
        System.out.println("Perimetru : "+paralelogram.calcularePerimetru(5)+"\nAria : "+paralelogram.calculareArea(5));

    }

}
