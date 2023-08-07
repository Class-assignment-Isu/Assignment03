import java.util.Scanner;

public class Demo1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        quiz:{
        
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        String strippedName =name.strip();
        if(strippedName.length() <= 0) System.out.println("\033[31mInvalid name");
        if(strippedName.length() <= 0) break quiz;

        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        if(age <10 || age > 18) System.out.println("\033[31mInvalid age");
        if(age <10 || age > 18) break quiz;
        
        scanner.nextLine();

        System.out.print("Enter your subject 1 : ");
        String sub1 = scanner.nextLine();
        if(!sub1.startsWith("SE-")) System.out.println("\033[31mInvalid subject");
        if(!sub1.startsWith("SE-")) break quiz;

        System.out.print("Enter your marks 1 :");
        double marks1 = scanner.nextDouble();
        if(marks1 <0|| marks1 > 100) System.out.println("\033[31mInvalid marks");
        if(marks1 <0|| marks1 > 100) break quiz;
        
        scanner.nextLine();

        System.out.print("Enter your subject 2 : ");
        String sub2 = scanner.nextLine();
        if(sub2.substring(sub1))so
        if(!sub2.startsWith("SE-")) System.out.println("\033[31mInvalid subject");
        if(!sub2.startsWith("SE-")) break quiz;

        System.out.print("Enter your marks 2 :");
        double marks2 = scanner.nextDouble();
        if(marks2 <0|| marks2 > 100) System.out.println("\033[31mInvalid marks");
        if(marks2 <0|| marks2 > 100) break quiz;



    }
}}