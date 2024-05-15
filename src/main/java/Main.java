import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
       Scanner input = new Scanner(System.in);
      int wybor = 0;
      while (wybor != 3) {
      System.out.println("Menu");
      System.out.println("1. Dodaj studenta");
      System.out.println("2. Wyświetl wszystkich studentów");
      System.out.println("3. Zamknięcie programu");

      wybor = input.nextInt();

          switch(wybor) {
            case 1:
              System.out.print("Podaj Imie Studenta: ");
              String name = input.next();
              System.out.print("Podaj Nazwisko Studenta: ");
              String nazwisko = input.next();
              System.out.print("Podaj Wiek Studenta: ");
              int age = input.nextInt();
              s.addStudent(new Student(name, nazwisko, age));
              break;

            case 2:
              var students = s.getStudents();
              for(Student current : students) {
                System.out.println(current.ToString());
              }
              break;
            case 3:
              break;
          }
      }

    } catch (IOException e) {
    }
  }
}