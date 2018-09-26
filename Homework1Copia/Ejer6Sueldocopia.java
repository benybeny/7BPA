import javax.swing.JOptionPane;
public class Ejer6Sueldocopia{
  public static void main(String[] args) {
  int HT=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de horas trabajadas "));
  double PH=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el pago por hora  "));
//sueldo semanal
double SS= HT*PH;
System.out.println("El sueldo semanal es: " + SS);

  JOptionPane.showMessageDialog(null, "el suedo demanal  de "  + HT + " horas de trabajo es   " + SS, "calcular sueldo ", JOptionPane.WARNING_MESSAGE);

  }
}
