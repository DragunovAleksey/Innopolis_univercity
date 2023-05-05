

//1.Составить процедуру, "рисующую" на экране горизонтальную линию из 10 символов "*".
// 2.Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа символов "*".
// import java.util.Scanner;
// public class Main5
// {
//            public static void main(String[] args) {
//            System.out.println("Введите количество звёзд в строке");
//            Scanner sc = new Scanner(System.in);
//            if (sc.hasNextInt()) {
//               int count = sc.nextInt();
//               stringStar(count);
//            } else {
//                System.out.println("Введите целое число!");
//            }
//            }
//            public static void stringStar (int count) {
//                for (int i = 1;i <= count ;i++) {
//                    System.out.print("*");
//                }
//            }
// }

//==============================================================================

// 3.Даны стороны двух треугольников. Найти сумму их периметров
// и сумму их площадей.
// (Определить процедуру для расчета периметра и площади треугольника
// по его сторонам.)
// Задача разобрана в видеоматериале.

// public class Main5
// {
//   public static void main (String[]args)
//   {
// int a = 3;
// int b = 4;
// int c = 5;
// int a1 = 3;
// int b1 = 4;
// int c1 = 5;

// int p = perimeter(a, b, c);
// int p1 = perimeter(a1, b1, c1);

// double s = square(p, a, b, c);
// double s1 = square(p, a1, b1, c1);

// System.out.println("P = " + p);
// System.out.println("P1 = " + p1);
// System.out.println("S = " + s);
// System.out.println("S1 = " + s1);

// System.out.println("Сумма периметров = " + (p + p1));
// System.out.println("Сумма площадей = " + (s + s1));
// }

// public static int perimeter(int a, int b, int c) {
//     return a + b + c;
// }
//     public static double square (int p, int a, int b, int c) {
//         int pp = p/2;
//         return Math.sqrt(pp *  (pp - a) *  (pp - b) *  (pp - c));
//     }
// }

//==============================================================================

// 4.Напечатать числа в виде следующей таблицы:
// 1 2...10
// 1 2...10
// 1 2...10
// 1 2...10

// import java.util.Scanner;
// public class Main5
// {
//            public static void main(String[] args) {
//            System.out.println("Введите количество строк");
//            Scanner sc = new Scanner(System.in);
//            if (sc.hasNextInt()) {
//               int count = sc.nextInt();
//               string1to10(count);
//            } else {
//                System.out.println("Введите целое число!");
//            }
//            }
//            public static void string1to10 (int count) {
//            if (count > 0) {
//                count--;
//                for (int j = 1; j <= 10;j++){
//                    System.out.print(j + " ");
//                }
//                System.out.println();
//                string1to10(count);
//            }
//                System.out.println();
//            }
// }

