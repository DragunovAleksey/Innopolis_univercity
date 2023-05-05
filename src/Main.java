// В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0,за ничью — 1.
// Известно количество очков, полученных командой за игру.
// Определить словесный результат игры (выигрыш, проигрыш или ничья).



// import java.util.Scanner;
// public class Main
// {
//            public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            boolean isExit = false;
//            System.out.println("Введите счёт игры:");
//     while (!isExit) {
//         if (sc.hasNextInt()) {
//             int count = sc.nextInt();
//                 switch (count) {
//                            case 0:
//                                           System.out.println("Проигрыш!");
//                                           System.out.println("Введите счёт игры:");
//                                       break;
//                                       case 1:
//                                           System.out.println("Ничья!");
//                                           System.out.println("Введите счёт игры:");
//                                       break;
//                                       case 3:
//                                           System.out.println("Победа!");
//                                           System.out.println("Введите счёт игры:");
//                                       break;
//                                       default:
//                         System.out.println("Числовое значение счёта неверно!");
//                         System.out.println("Введите счёт игры:");
//                     break;
//                           }
//            } else if (sc.hasNextLine()){
//         String count = sc.nextLine();
//         if (isExit = count.equals("EXIT")) {
//             System.out.println("Программа завершена.");
//         } else {
//             System.out.println("Укажите числовое значение!");
// }
// }
// }
// }
// }

//======================================================================================================================

// Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?

// import java.util.Scanner;
// public class Main
// {
//     public static void main(String[] args) {
//         boolean isExit = false;
//         while (!isExit) {
//                           System.out.println("Введите радиус круга:");
//                           Scanner sc = new Scanner(System.in);
//                           if (sc.hasNextDouble()) {
//                           double radius = sc.nextDouble();
//                           System.out.println("Введите сторону квадрата:");
//                           if (sc.hasNextDouble()) {
//                           double side = sc.nextDouble();
//                           double circleS = Math.PI * Math.pow(radius,2);
//                double squareS = Math.pow(side,2);
//                System.out.println("Площадь круга: " + circleS);
//                System.out.println("Площадь квадрата: " + squareS);
//            if (circleS > squareS) {
//                System.out.println("Площадь круга больше площади квадрата \n");
//            } else {
//                if (circleS < squareS) {
//                System.out.println("Площадь квадрата больше площади круга \n");
//            } else {
//                System.out.println("Площади квадрата и круга равны \n");
// }
// }
// } else if (sc.hasNextLine()){
//     String side = sc.nextLine();
//     System.out.println("Введено не число!");
// }
// }else if (sc.hasNextLine()){
//     String radius = sc.nextLine();
//     if (isExit = radius.equals("EXIT")) {
//     System.out.println("Программа завершена");
// } else {
//     System.out.println("Введено не число!");
// }
// }
// }
// }
// }

//======================================================================================================================

// 3.Дано двузначное число. Определить: остаток от деления десятков на единицы,результат деления единиц на десятки

// import java.util.Scanner;
// public class Main
// {
// public static void main(String[] args) {
//      boolean isExit = false;
//         while (!isExit) {
//                           System.out.println("Введите двузначное число:");
//                           Scanner sc = new Scanner(System.in);
//                           if (sc.hasNextInt()) {
//                           int num = sc.nextInt();
//                           if (9 < num && num < 100) {
//                               double units = num%10;
//                               double decimals = num/10;
//                               if (Double.isNaN(decimals%units)) {
//                                   System.out.println("Остаток от деления десятков на единицы = 0");
//                               } else {
//                               System.out.println("Остаток от деления десятков на единицы = " + (decimals%units));
//                                }
//                               System.out.println("Результат деления единиц на десятки = " + (units/decimals));
//                           } else {
//                               System.out.println("Число не двузначное!");
//                           }
//                           } else if (sc.hasNextLine()) {
//                                   String num = sc.nextLine();
//             if (isExit = num.equals("EXIT")) {
//             System.out.println("Программа завершена");
//         } else {
//             System.out.println("Введено не число!");
// }
// }
// }
// }
// }

//======================================================================================================================

// 4.Даны три вещественных числа a, b, c.
// Проверить:1. выполняется ли неравенство a < b < c;2. выполняется ли неравенство b > a > c.

// import java.util.Scanner;
// public class Main
// {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Введите \"a\"");
// double a = sc.nextDouble();
// System.out.println("Введите \"b\"");
// double b = sc.nextDouble();
// System.out.println("Введите \"c\"");
// double c = sc.nextDouble();
// if (a<b&&b<c) {
//     System.out.println("Неравенство a < b < c выполняется");
// } else {
//     System.out.println("Неравенство a < b < c не выполняется");
// }
// if (b>a&&a>c) {
//     System.out.println("Неравенство b > a > c выполняется");
// } else {
//     System.out.println("Неравенство b > a > c не выполняется");
// }
// }
// }

//======================================================================================================================

// 5.Даны два числа. Если квадратный корень из второго числа меньше первогочисла, то увеличить второе число в пять раз.

// import java.util.Scanner;
// public class Main
// {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Введите \"a\"");
// double a = sc.nextDouble();
// System.out.println("Введите \"b\"");
// double b = sc.nextDouble();
// if (Math.sqrt(b)<a) {
//     System.out.printf("Квадратный корень из %f меньше %f \n",b,a);
//     b*=5;
//     System.out.printf("Поэтому увеличиваем b в пять раз => %f \n",b);
// } else {
//     System.out.println("Квадратный корень из b = " + Math.sqrt(b) + " и он больше a = " + a);
// }
// }
// }