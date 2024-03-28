import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Calculator calculator = new Calculator();
        while(true){
            System.out.println("Advanced Calculator");
            System.out.println("1.Mbledhja(+)");
            System.out.println("2.Zbritja(-)");
            System.out.println("3.Prodhimi(*)");
            System.out.println("4.Pjestimi(/)");
            System.out.println("5.Rrenja katrore(√)");
            System.out.println("6.Memory Functions");
            System.out.println("7.Exit");
            System.out.println("Select an operation (1/2/3/4/5/6/7):");

            int choise = scanner.nextInt();
            if (choise == 7){
                System.out.println("Exiting Calucator");
                break;
            }
            double result =0.0;
            double nr1;
            double nr2;
            switch (choise){
                case 1:
                    System.out.println("enter first number");
                    nr1=scanner.nextDouble();
                    System.out.println("enter second number");
                    nr2=scanner.nextDouble();
                    result=calculator.gjejshumen(nr1,nr2);
                    break;

                case 2:
                    System.out.println("enter first number");
                    nr1=scanner.nextDouble();
                    System.out.println("enter second number");
                    nr2=scanner.nextDouble();
                    result=calculator.gjejdiferencen(nr1,nr2);
                    break;
                case 3:
                    System.out.println("enter first number");
                    nr1=scanner.nextDouble();
                    System.out.println("enter second number");
                    nr2=scanner.nextDouble();
                    result=calculator.gjejprodhimin(nr1,nr2);
                    break;
                case 4:
                    System.out.println("enter first number");
                    nr1=scanner.nextDouble();
                    System.out.println("enter second number");
                    nr2=scanner.nextDouble();
                    result=calculator.bejpjestimin(nr1,nr2);
                    break;
                case 5:
                    System.out.println("enter number");
                    nr1=scanner.nextDouble();
                    result=calculator.gjejRrenjenkatrore(nr1);
                    break;

                case 6:
                    handleMemoryFunctions(scanner,calculator);
                    continue;
                default:
                    System.out.println("Invalid choise of menu");
                    continue;
            }
            System.out.println("Result:" +result);


        }

    }

    private static void handleMemoryFunctions(Scanner scanner, Calculator calculator) {
        System.out.println("Memory Functions");
        System.out.println("1.Add to Memory (M+)");
        System.out.println("2.Clear Memory (MC)");
        System.out.println("3.Recall Memory (MR)");
        System.out.println("Select a memory functions (1/2/3)");
        int memoryChoise = scanner.nextInt(); // duhet int sepse vetem 3 numra jane tper te zgjedhur
        switch (memoryChoise){
            case 1:
                System.out.println("Enter value to add yo memory");
                double valueToAdd = scanner.nextDouble();
                calculator.addtomemory(valueToAdd);
                System.out.println("value added to memory");
                break;

            case 2:
                calculator.clearmemory();
                System.out.println("Memory cleared");
                break;
            case 3:
               double recalledVAlue = calculator.recallmemory();
                System.out.println("Value recalled from memory:"+ recalledVAlue);
                break;
            default:
                System.out.println("Invalid Choise");

        }

    }
}























