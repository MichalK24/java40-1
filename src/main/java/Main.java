/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;
class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));
      Scanner scanner = new Scanner(System.in);
      int wybor = 0;

      while(wybor != 3) {
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wyświetl studenta");
        System.out.println("3. Wyjście");

        wybor = scanner.nextInt();
        switch(wybor) {
          case 1: {
            System.out.println("Podaj imię");
            String imie = scanner.next();
            System.out.println("Podaj wiek");
            int wiek = scanner.nextInt();
            s.addStudent(new Student(imie, wiek));
            break;
          }
          case 2: {
            var students = s.getStudents();
            for(Student current : students) {
              System.out.println(current.toString());
            }
            break;
          }
          case 3: {
            System.out.println("Wyjście");
            break;
          }
          default: {
            System.out.println("Niepoprawny wybór");
            break;
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}