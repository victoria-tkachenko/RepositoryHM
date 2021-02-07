import java.sql.SQLOutput;
import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
    }
        //Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

//        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        for (int i = 0; i < myArray.length; i++) {
//           Вариант 1
//            if (myArray[i] == 1) {
//                myArray[i] = 0;
//            } else {
//                myArray[i] = 1;
//            }
//
//            Вариант 2
//            myArray[i] = myArray[i] == 1 ? 0 : 1;
//            System.out.print(myArray[i]);
//        }
//        System.out.println(" ");

        // Задание 2.   Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит
        // его значениями 1 4 7 10 13 16 19 22;

        public static void array(String[] args) {
            int[] emptyArray = new int[8];
            for (int i = 0; i < emptyArray.length; i++) {
                emptyArray[i] = i;
                System.out.print(emptyArray[i]);
            }

        }

        public static void narray(String[] args) {
            int[] arr = new int[5];
            for(int i = 0; i < 5; i++) {
                arr[i] = i;
                System.out.println("arr[" + i + "] =" +arr[i]);
            }
        }
    }

        // Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,принимающий на вход массив
        // и умножающий числа меньше 6 на 2;


        // Задание 4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;








