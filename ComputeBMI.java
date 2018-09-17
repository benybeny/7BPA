import java.util.Scanner;
public class ComputeBMI{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    //palabra para las constantes  con un palabra reservada
        final double KILOGRAMS_PER_POUND = 0.4535923;
        final double  METERS_PER_INCH=0.254;

    System.out.println("Enter weight in pounds:");
    double weight=input.nextDouble();

    System.out.println("Enter weight in inches:");
    double height=input.nextDouble();

double weightInKilogams= weight*  KILOGRAMS_PER_POUND;
double heightInMeters=height * METERS_PER_INCH;

double BMI=weightInKilogams/(heightInMeters*heightInMeters);

if (BMI<18) {
  System.out.println("Peso bajo.Necesario valorar signos de nutricion ");
}else { if (BMI>=18 && BMI<=24.5) {
  System.out.println( "holaalal");

}

}




  }
}
