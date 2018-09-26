import javax.swing.JOptionPane;
public class Ejer8Volumencopia{
 public static void main(String[] args) {
double A=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la altura de la alverca "));
double L=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese lo largo de la  alverca "));
double N=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la anchura de la alverca"));
double CM=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el costo por metro "));
  double V= (A * L * N);
  double PG=V* CM;
JOptionPane.showMessageDialog(null,"el pago a realizar por " + V +" metros cubicos es de : "+ PG,"pago por consumo de agua en metros cubicos",JOptionPane.WARNING_MESSAGE);
}
}
