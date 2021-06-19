public class Triangle {

    //Triangle properties
    private double height = 0;
    private double base = 0;
    private double sideLengthOne = 0;
    private double sideLengthTwo = 0;
    private double sideLengthThree = 0;

    //Triangle constructor
    public Triangle(double height, double base, double sideLengthOne, double sideLengthTwo, double sideLengthThree){
        this.height = height;
        this.base = base;
        this.sideLengthOne = sideLengthOne;
        this.sideLengthTwo = sideLengthTwo;
        this.sideLengthThree = sideLengthThree;
    }

    //Triangle functionality
    public double GetArea(){
        return (base * height) /2;
    }
}
