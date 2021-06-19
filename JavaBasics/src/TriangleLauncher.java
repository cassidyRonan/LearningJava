public class TriangleLauncher {

    public static void main(String[] args)
    {
        Triangle triOne = new Triangle(8,15,15,8,17);
        Triangle triTwo = new Triangle(2.598,3,3,3,3);

        System.out.println("Triangle One Area: " + triOne.GetArea());
        System.out.println("Triangle Two Area: " + triTwo.GetArea());
    }
}
