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
        if(sub2.contains(sub1))System.out.println("\033[31mInvalid subject");
        if(sub2.contains(sub1)) break quiz;
        if(!sub2.startsWith("SE-")) System.out.println("\033[31mInvalid subject");
        if(!sub2.startsWith("SE-")) break quiz;

        System.out.print("Enter your marks 2 :");
        double marks2 = scanner.nextDouble();
        if(marks2 <0|| marks2 > 100) System.out.println("\033[31mInvalid marks");
        if(marks2 <0|| marks2 > 100) break quiz;

        scanner.nextLine();

        System.out.print("Enter your subject 3 : ");
        String sub3 = scanner.nextLine();
        if(sub3.contains(sub1))System.out.println("\033[31mInvalid subject");
        if(sub3.contains(sub1)) break quiz;
        if(sub3.contains(sub2))System.out.println("\033[31mInvalid subject");
        if(sub3.contains(sub2)) break quiz;
        if(!sub3.startsWith("SE-")) System.out.println("\033[31mInvalid subject");
        if(!sub3.startsWith("SE-")) break quiz;

        System.out.print("Enter your marks 3 :");
        double marks3 = scanner.nextDouble();
        if(marks3 <0|| marks3 > 100) System.out.println("\033[31mInvalid marks");
        if(marks3 <0|| marks3 > 100) break quiz;

        scanner.nextLine();

        double total;
        double avg;
        total= marks1 + marks2 + marks3 ;
        avg = total/3;

        String status;
        if(avg>75)status="\033[34;1mDistinguished Pass\033[0m\t";
        else if(avg>=65)status="\033[32;1mCredit Pass\033[0m\t\t\t\t\t\t\t";
        else if(avg >=55)status="\033[33;1mPass \033[0m\t\t\t\t\t\t\t\t";
        else status= "\033[31;1mFail\033[0m\t\t\t\t\t\t\t\t"; 

        

        System.out.println("+----------------------------------------+");
        System.out.println();
        System.out.println(name.toUpperCase());
        System.out.println(status);



    }
}}