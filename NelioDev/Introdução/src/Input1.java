import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        String x;
        double y;
        int z;

        System.out.println("Digite uma String");
        x = sc.next();

        System.out.println("Digite uma Double");
        y = sc.nextDouble();

        System.out.println("Digite uma Int");
        z = sc.nextInt();

        System.out.println("Você Digitou: " + x + "\n" +y+ "\n" +z);

        sc.close();
    }
}
