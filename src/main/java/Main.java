import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);

      System.out.println("wybierz opcje:");
      System.out.println("1 - dodaj");
      System.out.println("2 - wypisz studentów");
      System.out.println("3 - wyjście");

      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.print("imie: ");
          String name = scanner.next();
          System.out.print("wiek: ");
          int age = scanner.nextInt();
          s.addStudent(new Student(name, age));
          break;
        case 2:
          var students = s.getStudents();
          for (Student current : students) {
            System.out.println(current.ToString());
          }
          break;
        case 3:
          System.out.println("wyjście z programu.");
          System.exit(0);
          break;
        default:
          System.out.println("błędny wybór.");
      }
    } catch (IOException e) {

    }
  }
}