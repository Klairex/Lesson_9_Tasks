package Task2;

public class Paralelogram {
    int calcularePerimetru(int length,int width){
        return (length+width)*2;
    }
    int calcularePerimetru(int sideLength){
        return sideLength*4;
    }
    int calculareArea(int length,int width){
        return length*width;
    }
    int calculareArea(int sideLength){
        return sideLength*sideLength;
    }
}
