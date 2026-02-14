import java.util.*;

class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("choose operation");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Result = "+(a + b));
            break;

            case 2: 
                System.out.println("Result = "+(a - b));
            break;

            case 3: 
                System.out.println("Result = "+(a * b));
            break;

            case 4: 
                 if(b != 0) {
                    System.out.println("Result = "+(a / b));
                 } else {
                    System.out.println("cannot divide by zero");
                 }
                 break;
            
           default:
                   System.out.println("inavalid choice");
        }
        sc.close();
    }
}