import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Circle yuan = new Circle();
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        System.out.println("the area is" + yuan.getArea(radius));
        System.out.println("the perimeter is" + yuan.getPerimeter(radius));
    }

}
class Circle{
    public double getArea(int radius){
        return radius * radius * 3.14;
    }
    public double getPerimeter(int radius){
        return 2 * radius *3.14;
    }
}