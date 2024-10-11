package Task3;

public class Sphere extends TreeDimensionalShape{
    double pi = 3.14;
    double Aria(double raza){
        return 4*pi*raza*raza;
    }
    double Volum (double raza){
        return (4*pi*raza*raza*raza)/3;
    }
}
