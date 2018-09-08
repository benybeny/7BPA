//conversion de galon a litros
import java.util.Scanner;
public class Ejer5{
  public static void main(String[] args) {
    //solicitar el numeros de litros y el presio
    Scanner Ga=new Scanner(System.in);
    System.out.println("ingrese el numero de litros por dia");
    double NGalones=Ga.nextDouble();
    Scanner Pre=new Scanner(System.in);
    System.out.println("ingrese el precio por galon");
    double Precio= Pre.nextDouble();
 //calcular el numero de galones
    double TG = NGalones / 3.785 ;
    //calcular las ganancias
    double GN =TG* Precio;
System.out.println( "las ganancias por dia : " + GN);



  }
}
