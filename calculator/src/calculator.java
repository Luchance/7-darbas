import java.util.Scanner;
import java.lang.Math;
5
class calculator {

    public static void main(String[] args) {

        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");


        x = scanner.nextDouble();
        System.out.print("Enter second number:");
        y = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, s (suma), p (kelimas 2 laipsniu), l (1 skaitmens kelimas antro skaiciaus laipsniu), c (cos), n (sin), t(tg), g(ctg), r (procentai), k (liekana5)): ");
        char operator = scanner.next().charAt(0);
        double radian = Math.toRadians(x + y);
        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
                output = x + y;
                break;

            case '-':
                output = x - y;
                break;

            case '*':
                output = x * y;
                break;

            case '/':
                output = x / y;
                break;

            case 's':   // x+y saknis
                output = Math.sqrt(x+y);
                break;

            case 'p':   // x+y kelimas 2 laipsniu
                output = Math.pow(x+y, 2);
                break;

            case 'l':   //x kelimas y laipsniu
                output = Math.pow(x, y);
                break;

            case 'c':    //cos
                output = Math.cos(radian);
                break;

            case 'n':   //sin
                output = Math.sin(radian);
                break;

            case 't':   //tg
                output = Math.tan(radian);
                break;

            case 'g':   //ctg
                output = 1.0 / Math.tan(radian);
                break;

            case 'r':   //procentai
                output = 100 / x * y;
                break;

            case 'k':   //liekana
                output =x % y;
                break;

// ismes errora jei ivesit operatori kurio nera:

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(x+" "+operator+" "+y+": "+output);
    }
}