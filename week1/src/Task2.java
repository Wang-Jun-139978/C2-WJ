public class Task2 {
    public static void main(String[] args) {
        int a,b,c;
        int sum = 0;
        for (int i = 100;i < 1000;i++){
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
            if (i == a * a * a + b * b * b + c * c * c){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
