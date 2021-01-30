import java.util.Scanner;

public class Task3 {
    public void nizhuan(){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        char str[] = new char[str1.length()];
        for (int i = str1.length() - 1;i >= 0;i--){
            str[i] = str1.charAt(str1.length() - i - 1);
        }
        String str2 = "";
        for (int i = 0;i <= str1.length() - 1;i++){
            str2 = str2 + str[i];
        }
        System.out.println(str2);
    }
}
