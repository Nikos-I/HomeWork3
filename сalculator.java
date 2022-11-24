// Реализовать простой калькулятор

package Seminar1.HomeWork3;

import java.util.Scanner;

public class сalculator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// Ввод используя Scanner
		
		System.out.print("Введите первое число: ");
		int a = sc.nextInt();
		System.out.print("Введите второе число: ");
		int b = sc.nextInt();

		// selecting the operand for the calculations
		System.out.print(
			"Введите операцию (+, -, *, /, %): ");
		char op = sc.next().charAt(0);
		sc.close();
		solve(a, b, op);
	}

	public static int solve(int a, int b, char op)
	{
		int ans = 0;
		switch (op) {
			case '+':
				ans = a + b;
				break;
			case '-':
				ans = a - b;
				break;
			case '*':
				ans = a * b;
				break;
				case '/':
				ans = a / b;
				break;
				case '%':
				ans = a % b;
				break;
		}
		// Печать результата
		System.out.println("Результат: " + ans);
		return ans;
	}
}

