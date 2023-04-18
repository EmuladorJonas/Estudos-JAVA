import java.util.Scanner;

public class While {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("PASSWORD: ");
        int password = sc.nextInt(); //Just a simple integer password for the exercice!!!

        while(password != 2002)
        {
            System.out.println("\nINORRECT PASSWORD!!!");
            System.out.print("PASSWORD: ");
            password = sc.nextInt();
        }

        System.out.println("CORRECT PASSWORD!!!");




        sc.close();
    }
    
}
