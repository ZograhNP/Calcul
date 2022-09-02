import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);

        System.out.println("Enter num.1: ");
        int num1 = scaner.nextInt();

        System.out.println("Enter num.2: ");
        int num2 = scaner.nextInt();

        System.out.println("Ennter symb.: ");
        String symv = scaner.next();

        int res;

        switch (symv){
            case"+":
                res = num1 + num2;
                System.out.println(res);
                break;
            case"-":
                res = num1 - num2;
                System.out.println(res);
                break;
            case"*":
                res = num1 * num2;
                System.out.println(res);
                break;
            case"%":
                res = num1 % num2;
                System.out.println(res);
                break;
            case"/":
                if(num2 == 0){
                    System.out.println("Error");
                    break;
                } else {
                    res = num1 / num2;
                    System.out.println(res);
                    break;
                }
        }
    }
}