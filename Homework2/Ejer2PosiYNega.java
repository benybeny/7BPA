import java.util.Scanner;
public class Ejer2PosiYNega{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
System.out.println("**numeros negativos y positivos***");
System.out.println("ingrese un numero");
int Num=input.nextInt();
System.out.println("-----------------------------------");
if (Num>=0 ) {
  System.out.println(Num+" este numero es positivo");
}else {
  System.out.println(Num+" este numero es negativo");
}

  }
}
