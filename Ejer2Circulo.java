import java.util.Scanner;
public class Ejer2Circulo{
public static void main(String[] args) {
Scanner Radio = new Scanner(System.in);
System.out.println("ingrese al radio del circulo");
double Radio1= Radio .nextDouble();
double PI= 3.1416;
double Area = (Radio1 * Radio1) * PI ;

System.out.println("El area del circulo es : "  + Area);

}

}
