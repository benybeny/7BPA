
import javax.swing.JOptionPane;
public class GueesBirthdayJOpanel{
  public static void main(String[] args) {
    //decraracion de los set
    String set1 = " 1  3  5  7 \n" +
                  " 9 11 13 15 \n" +
                  "17 19 21 23 \n" +
                  "25 27 29 31 \n";

    String set2 = "  2  3  6  7 \n" +
                  " 10 11 14 15 \n" +
                  " 17 19 21 23 \n" +
                  " 26 27 30 31 \n";

    String set3 = " 4  5  6  7 \n" +
                  "12 13 14 15 \n" +
                  "20 21 22 23 \n" +
                  "28 29 30 31 \n";

    String set4 = " 8  9 10 11 \n" +
                  "12 13 14 15 \n" +
                  "24 25 26 27 \n" +
                  "28 29 30 31";

    String set5 = "16 17 18 19 \n" +
                  "20 21 22 23 \n" +
                  "24 25 26 27 \n" +
                  "28 29 30 31 ";

    int day=0;

int answer =
JOptionPane.showConfirmDialog(null,"is your birthday in set 1??\n "+ set1);
//guardar la respuesta en una variable

//acumular las respuesta
    if (answer == JOptionPane.YES_OPTION ) {
      day= day +1 ; //acumulador
      //day+=1 simplificado
    }
 answer = JOptionPane.showConfirmDialog(null,"is your birthday in set 2??\n"+ set2);

    if (answer == JOptionPane.YES_OPTION ) {
      day= day +2 ;
      }

 answer = JOptionPane.showConfirmDialog(null,"is your birthday in set 3??\n"+ set3);
      //guardar la respuesta en una variable
      if (answer == JOptionPane.YES_OPTION ) {
        day= day +4 ;
        }
answer = JOptionPane.showConfirmDialog(null,"is your birthday in set 4??\n"+ set4);
        if (answer == JOptionPane.YES_OPTION ) {
          day= day +8 ;
          }

answer= JOptionPane.showConfirmDialog(null,"is your birthday in set 5??\n"+ set5);
        if (answer == 1 ) {
          day= day +16 ;}

JOptionPane.showConfirmDialog(null,"\n your birthday is "+ day);

  }
}
