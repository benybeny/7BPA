import javax.swing.JOptionPane;
public class Ejer2Circulocopia{
public static void main(String[] args) {
double Radio = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese el radio del la circunferencia "));
double PI= 3.1416;
double Area = (Radio * Radio) * PI ;
JOptionPane.showMessageDialog(null, "Area del triangulo  es "+ Area);
}
}
