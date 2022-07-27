import java.util.Scanner;
class Calculation{

    public void calculation(int a ,int b,char c){
        switch(c){
            case '+' : System.out.println("\n"+a+" + "+ b+" = "+(a+b));
            break;
            case '-':System.out.println("\n"+a+" - "+ b+" = "+(a-b));
            break;
            case 'x':System.out.println("\n"+a+" x "+ b+" = "+(a*b));
            break;
            case '/':System.out.println("\n"+a+" / "+ b+" = "+(a/b));
            break;
            default: System.out.println("\n"+"Number is not valid.");
        }
    }
}
public class Main {
    char ch;
    int num1,num2;
    public static void main(String args[]){
        Main calc = new Main();
        Calculation obj = new Calculation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t-----Welcome to Simple Calculator----- ");
        System.out.print("\n\nChoose an operator ( + , - , x , / ): ");
        calc.ch = scanner.next().charAt(0);
        System.out.print("Enter 1st number : ");
        calc.num1 = scanner.nextInt();
        System.out.print("\nEnter 2nd number : ");  
        calc.num2 = scanner.nextInt();
        obj.calculation(calc.num1,calc.num2,calc.ch);

    }
}
