import java.sql.SQLOutput;
import java.util.Scanner;

public class Tsak1 {
    public static void main(String[] args) {
        System.out.println("输入体重(kg)");
        Scanner scan = new Scanner(System.in);
        int weight = scan.nextInt();
        System.out.println("输入身高(m)");
        double height = scan.nextDouble();
        double bmi = weight / height /height;
        if (bmi < 18.5){
            System.out.println("过轻");
        }else if (bmi < 25){
            System.out.println("正常");
        }else if (bmi < 28){
            System.out.println("过重");
        }else if (bmi < 32){
            System.out.println("肥胖");
        }else {
            System.out.println("过度肥胖");
        }
    }
}
