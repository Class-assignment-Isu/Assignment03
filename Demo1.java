import java.util.Scanner;

public class Demo1{
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        


        // String str1 = "  codekru  ";
        // // System.out.println("Before using strip fucntion: " + "====" + str1 + "=====");
 
        // String str2 = str1.strip();
        // System.out.println("After using strip fucntion: " + "====" + str2 + "=====");
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        if (name.strip() > 0) System.out.printf("Name: %s \n", name);

        System.out.print("Enter your age:");
        int age = scanner.nextInt();
    }
}