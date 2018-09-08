import java.util.Scanner;
public class Ejer4{
public static void main(String[] args) {
//se solicita la base del triangulo y la ipotenusa
Scanner BT = new Scanner (System.in);
System.out.println(" ingrese la base del triangulo");
double BT1 = BT.nextDouble();
Scanner Hipot = new Scanner(System.in);
System.out.println("ingrese la hipotenusa");
double Hipot1 = Hipot .nextDouble();
//se encuentra el cateto faltante con la regra de raiz de a al cuadrado por c al cuadrado
double CatetoF= Math.sqrt((BT1*BT1)+(Hipot1*Hipot1));
// se calcula el area de los dos triangulos
double ATriangulo = ((CatetoF * BT1 ) /2) *2;
// se calcula el area de la mitad del circulo
double ValorP=3.1416;
double ACirculo = (ValorP * (BT1*BT1))/2;
//resultado
double AT = ACirculo + ATriangulo;
System.out.println("Area total =  "+ AT);

}
}
