import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SCIENTIFIC CALCULATOR =====\n");
            System.out.println("1. Addition ");
            System.out.println("2. Subtraction ");
            System.out.println("3. Multiplication ");
            System.out.println("4. Division (Two Numbers)");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("----you selected Addition----");
                    System.out.print("How many numbers?\n ");
                    int n1 = sc.nextInt();
                    double sum = 0;

                    System.out.println("Enter numbers:");
                    for (int i = 0; i < n1; i++) {
                        sum += sc.nextDouble();
                    }
                    System.out.println("Result = " + sum);
                    System.out.println("******* THANK YOU FOR USING OUR CALCULATOR *******");
                    break;

                case 2: 
                    System.out.println("----you selected Subtraction----");
                    System.out.print("How many numbers?\n ");
                    int n2 = sc.nextInt();

                    System.out.println("Enter numbers:");
                    double sub = sc.nextDouble();

                    for (int i = 1; i < n2; i++) {
                        sub -= sc.nextDouble();
                    }
                    System.out.println("Result = " + sub);
                    System.out.println("******* THANK YOU FOR USING OUR CALCULATOR *******");
                    break;

                case 3: 
                    System.out.println("----you selected Multiplication----");
                    System.out.print("How many numbers?\n ");
                    int n3 = sc.nextInt();
                    double mul = 1;

                    System.out.println("Enter numbers:");
                    for (int i = 0; i < n3; i++) {
                        mul *= sc.nextDouble();
                    }
                    System.out.println("Result = " + mul);
                    System.out.println("******* THANK YOU FOR USING OUR CALCULATOR *******");
                    break;

                case 4: 
                    System.out.println("----you selected Division----");
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();

                    if (b == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        System.out.println("Result = " + (a / b));
                    }
                    System.out.println("******* THANK YOU FOR USING OUR CALCULATOR *******");
                    break;

                case 5: 
                    System.out.println("----you selected Square Root----");
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    System.out.println("Square Root = " + Math.sqrt(num));
                    System.out.println("******* THANK YOU FOR USING OUR CALCULATOR *******");
                    break;

                case 6: 
                    System.out.println("----you selected Power----");
                    System.out.print("Enter base and power:\n");
                    double base = sc.nextDouble();
                    double power = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(base, power));
                    System.out.println("******* THANK YOU FOR USING OUR CALCULATOR *******");
                    break;

                case 7:
                    System.out.println("...........Exiting Calculator............");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}