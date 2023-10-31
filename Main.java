import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);
        String str2 = " ";

        for (int i = 0; i < n; i++){
            System.out.println( "Ввести строку: " + (i+1));
            str [i] = sc2.nextLine();
        }
        int min = str[0].length();
        for (int i = 0; i < n; i++){
            System.out.println(str[i].length());
            if (min > str[i].length()){
                min = str[i].length();
                str2 = str[i];
            }
        }
        System.out.println("Длина самой короткой строки: " + min + "\nCтрока: " + str2);
    }
}