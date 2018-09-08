//calcular la cantidad depulgadas en metros
import java.util.Scanner;
public class Ejer7{
public static void main(String[] args) {
  Scanner MT = new Scanner(System.in);
  System.out.println("ingrese el numero de horas tabajadas");
  double CM= MT.nextDouble();
  //pulgadas que debe pedir
double PG = CM / 0.0254;
System.out.println("el total de pugadas a pedir: " + PG );
}
}
