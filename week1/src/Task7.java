import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        ys jisuan = new ys(a,b,c,d);
        jisuan.add();
        jisuan.reduce();
        jisuan.multiply();
    }
}
class ys{
    int a,b,c,d;
    public ys(int a,int b,int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public void add() {
        int x = a + c;
        int y = b + d;
        String answer = x + "+" + y + "i";
        System.out.println("两复数相加的结果为：" + answer);
    }
    public void reduce(){
        int x = a - c;
        int y = b - d;
        String answer = x + "+" + y + "i";
        System.out.println("两复数相减的结果为：" + answer);
    }
    public void multiply(){
        int x = a * c - b * d;
        int y = a * d + c * b;
        String answer = x + "+" + y + "i";
        System.out.println("两复数相乘的结果为：" + answer);
    }
}
