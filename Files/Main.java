import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an expression to be converted: ");
        String str = sc.nextLine();
        System.out.println(Converter.convertToPostfix(str));
        
    }
}