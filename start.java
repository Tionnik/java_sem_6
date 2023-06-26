/*
  Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
 */

package java_sem_6;

import java.util.ArrayList;
import java.util.Scanner;

public class start {
  public static void main(String[] args) {
    
  ArrayList <Laptop> nout = new ArrayList<>();                              // Cписок ноутбуков в магазине
  nout.add ( new Laptop("honor", 4, 500, "windows", "red", "intel"));
  nout.add( new Laptop("dell", 16, 1500,"windows", "black", "amd"));
  nout.add( new Laptop("asus", 32, 1000,"linux", "black", "amd"));
  nout.add ( new Laptop("irbis", 4, 128, "windows", "grey", "intel"));
  nout.add( new Laptop("acer", 8, 500,"linux", "black", "amd"));
  nout.add( new Laptop("asus", 16, 800,"no_os", "grey", "amd"));
  nout.add ( new Laptop("lenova", 4, 1000, "no_os", "black", "intel"));
  nout.add( new Laptop("mack", 16, 1000,"ios", "gold", "arm"));
  nout.add( new Laptop("lenova", 32, 2000,"windows", "black", "intel"));

  boolean no_exit=true;
  int idCommand;  
  Scanner scan = new Scanner(System.in);

    while (no_exit) {                                                          // Меню выбора поиска
      System.out.println();
      System.out.println("Приветствуем вас в нашем магазине");            
      System.out.println();
      System.out.println("Выберете критерий поиска");
      System.out.println("[1] Минимальное кол-во ОЗУ");
      System.out.println("[2] Минимальный HDD");
      System.out.println("[3] Оперативная система");
      System.out.println("[4] Цвет");
      System.out.println("[5] Выход");
      System.out.println();
      idCommand = scan.nextInt();
      scan.nextLine();
      
      if (idCommand==1){
        System.out.println();
        System.out.println("Введите минимальное кол-во ОЗУ");
        int temp = scan.nextInt();                                            // Чтение из строки критерий поиска
        scan.nextLine();

        for (int i = 0; i < nout.size(); i++) {                               // Поиск строк удовлетворяющих условию 
          if (temp <= nout.get(i).getMenory())
            nout.get(i).shou();
            System.out.println();
        }
      no_exit=false;
      }

      if (idCommand==2){
        System.out.println();
        System.out.println("Введите минимальное кол-во HDD");
        int temp = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < nout.size(); i++) {
          if (temp <= nout.get(i).getStorage())
            nout.get(i).shou();
            System.out.println();
        }
      no_exit=false;
      }

      if (idCommand==3){
        System.out.println();
        System.out.println("Введите операционую систему");
        String temp = scan.nextLine().toLowerCase();;

        for (int i = 0; i < nout.size(); i++) {
          if (temp.equals(nout.get(i).getOperating_system()))
            nout.get(i).shou();
          }
      no_exit=false;
      }

      if (idCommand==4){
        System.out.println();
        System.out.println("Введите цвет");
        String temp = scan.nextLine().toLowerCase();;

        for (int i = 0; i < nout.size(); i++) {
          if (temp.equals(nout.get(i).getColor()))
            nout.get(i).shou();
          }
      
      }

      if (idCommand>4) no_exit=false;
 
    }
  scan.close();
  System.out.println("Приходите ещё в наш магазин");  
  }
}