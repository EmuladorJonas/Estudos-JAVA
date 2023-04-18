import java.util.Locale; // Biblioteca de local
import java.util.Scanner; // Biblioteca do Scanner

public class ProgramOri {
    public static void main(String[] args){

        Locale.setDefault(Locale.US); // Setando localização para US para questões de . ou ,
        Scanner sc = new Scanner(System.in);

        Triangle TriangleA = new Triangle(); //Instanciando Triangulo A
        Triangle TriangleB = new Triangle(); //Instanciando Triangulo B

        System.out.println("Enter the measures of triangle X: ");
        TriangleA.a = sc.nextDouble();
        TriangleA.b = sc.nextDouble();
        TriangleA.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        TriangleB.a = sc.nextDouble();
        TriangleB.b = sc.nextDouble();
        TriangleB.c = sc.nextDouble();

        double p = (TriangleA.a + TriangleA.b + TriangleA.c) / 2.0;
        double areaX = Math.sqrt(p * (p - TriangleA.a) * (p - TriangleA.b) * (p - TriangleA.c));

        p = (TriangleB.a + TriangleB.b + TriangleB.c) / 2.0;
        double areaY = Math.sqrt(p * (p - TriangleB.a) * (p - TriangleB.b) * (p - TriangleB.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);

        if (areaX > areaY)
        {
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
