import javax.swing.*;
public class courseimp{
  public static void main(String[] args) {
    course curso1 = new course();
    //curso1.courseName = "ingles";
    curso1.setCourseName("ingles");
    curso1.addstudent("luis");
    curso1.addstudent("maria");
    curso1.addstudent("lucero");

    String [] studentsDeIngles = curso1.getStudent();
      String students="";
    for (int i=0; i < curso1.getNumberOfStudent(); i++){
      students += studentsDeIngles[i]+"\n";
    }
JOptionPane.showMessageDialog(null, students);
      course curso2 = new course();
    curso2.setCourseName("math");
    curso2.addstudent("brandom");
    curso2.addstudent("angel");
    curso2.addstudent("steven");

    JOptionPane.showMessageDialog(null,curso1.getCourseName());
  }
}
