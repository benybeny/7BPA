import javax.swing.JOptionPane;
public class Ejer4copia{
public static void main(String[] args) {
//se solicita la base del triangulo y la ipotenusa
double BT= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la base del triangulo"));
double Hipot = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la hipotenusa"));
//se encuentra el cateto faltante con la regra de raiz de a al cuadrado por c al cuadrado
double CatetoF= Math.sqrt((BT*BT)+(Hipot*Hipot));
// se calcula el area de los dos triangulos
double ATriangulo = ((CatetoF * BT ) /2) *2;
// se calcula el area de la mitad del circulo
double ValorP=3.1416;
double ACirculo = (ValorP * (BT*BT))/2;
//resultado
double AT = ACirculo + ATriangulo;
JOptionPane.showMessageDialog(null,"area total: " +AT);


}
}
