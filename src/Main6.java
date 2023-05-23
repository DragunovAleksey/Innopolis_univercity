//1.Составить программу вывода любого числа любое заданное число раз.

// import java.util.Scanner;
// public class Main6
// {
// 	public static void main(String[] args) {
// 		System.out.println("Введите число и количество повторений");
// 		Scanner sc = new Scanner(System.in);
// 		int number = sc.nextInt();
// 		int repeat = sc.nextInt();
// 		repeatNum(number, repeat);
// 	}
// 	public static void repeatNum(int number, int repeat) {
// 	    for (int i = repeat; i > 0; i--) {
// 	        System.out.print(number);
// 	    }
// 	}
// }

//==============================================================================

//2.Напечатать числа следующим образом:
// 25 25.5 24.8
// 26 26.5 25.8
// ...
// 35 35.5 34.8


// public class Main6
// {
// 	public static void main(String[] args) {
// 	    for (int i = 25;i < 36; i++) {
// 		System.out.println(i + " " + (i + 0.5) + " " + (i - 0.2) );
	
// 	}
	
// 	}
// }

//==============================================================================

//3.Напечатать таблицу соответствия между весом
//в фунтах и весом в килограммах для значений 1, 2, ..., 10 фунтов 
//(1 фунт = 453 г).

// public class Main6
// {
// 	public static void main(String[] args) {
// 	    int j = 453;
// 	    for (int i = 1;i < 11555; i++) {
// 		System.out.println(i + "  " + j );
// 		j = j + 453;
	
// 	}
	
// 	}
// }

//==============================================================================

//4.Вычислить сумму 1+1/2+1/3+...+1/n.

// import java.util.Scanner;
//  public class Main6
// {
// 	public static void main(String[] args) {
// 	boolean exit = false;
// 	while (!exit) {
// 	System.out.println("Для расчета суммы 1+1/2+1/3+...+1/n \nВведите последний знаменатель");
//     Scanner sc = new Scanner(System.in);
    
//     if (sc.hasNextInt()) {
// 	    int num = sc.nextInt();
// 	if (num > 2) {
//         double sum = 1.0;
//         for (int i = 2; i <= num; i++){
//         sum += (double)1/i;
// }
//     System.out.printf("Сумма последовательности равна %.2f\n\n",sum);
// }   else {System.out.println("Значение должно быть больше 3-х!");
// }
// }   else {
//     if (sc.hasNextLine()) {
//         String num = sc.nextLine();
//     if (exit = num.equals("exit")) {
//         System.out.println("Программа завершена.");
// }   else {
//         System.out.println("Введённое значение не является целым числом!\n");
// }
// }
// }
// }
// }
// }
