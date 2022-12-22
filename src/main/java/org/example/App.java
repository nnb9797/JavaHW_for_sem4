package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // 1 способ
        //1) Вывести список на экран в перевернутом виде (без массивов)
        //Пример:
        //1 -> 2->3->4
        //Вывод:
        //4->3->2->1
        ArrayList<Integer> linkedList_task1 = new ArrayList<>();
        boolean f_1_2 = true;

        while (f_1_2 == true) {
            Scanner scanner_2 = new Scanner(System.in);
            System.out.println("Введите очередной элемент списка: ");
            int elem = scanner_2.nextInt();
            linkedList_task1.add(elem);
            System.out.println("Желаете ли продолжить ввод элементов: (Да/Нет)");
            Scanner scanner_3 = new Scanner(System.in);
            String str = scanner_3.nextLine();
            if (str.toLowerCase().equals("нет")) {
                break;
            }
        }
        System.out.println("Изначальный список: " + linkedList_task1);
        Collections.reverse(linkedList_task1);
        System.out.println("Перевёрнутый список: " + linkedList_task1);

//
//        // 2 способ
//
//        ArrayList<Integer> arrayList_task2 = new ArrayList<>();
//        boolean f = true;
//        boolean check = true; // список является знакочередующим
//
//        // заполнение списка элементами
//        while (f == true){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите очередной элемент списка: ");
//            int elem = scanner.nextInt();
//            arrayList_task2.add(elem);
//            System.out.println("Желаете ли продолжить ввод элементов: (Да/Нет)");
//            Scanner scanner_1 = new Scanner(System.in);
//            String str = scanner_1.nextLine();
//            if (str.toLowerCase().equals("нет")){
//                if (arrayList_task2.size()>=2){
//                    break;
//                } else {
//                    System.out.println("Вы ввели недостаточное количество чисел для проверки");
//                }
//            }
//        }
//
//        // проверка на знакочередующийся список
//        for (int i = 1; i < arrayList_task2.size(); i++){
//            if ((arrayList_task2.get(i-1) < 0) & (arrayList_task2.get(i) < 0) || (arrayList_task2.get(i-1) > 0) & (arrayList_task2.get(i) > 0)) {
//                System.out.println(arrayList_task2 + " Список не является знакочередующим");
//                check = false;
//                break;
//            }
//        }
//        if (check == true) {
//            System.out.println(arrayList_task2 + " Список является знакочередующим");
//        }
//    }
    }
}

