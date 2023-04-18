import java.util.Locale; // Biblioteca de local
import java.util.Scanner; // Biblioteca do Scanner

public class ProgramOri2 {
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

        double areaX = TriangleA.area(); //Chamada da função que irá calcular a área do triangulo
        double areaY = TriangleB.area(); //Chamada da função que irá calcular a área do triangulo
        

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
