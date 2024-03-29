package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of employees:");
		int numberEmployees = scanner.nextInt();
		scanner.nextLine();

		List<Employee> employee = new ArrayList<>();

		for (int i = 0; i < numberEmployees; i++) {

			System.out.println("Employee #" + (i + 1) + " Data: ");

			System.out.print("Outsourced (y/n) ?");
			String outsource = scanner.nextLine().toLowerCase();

			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Hours: ");
			Integer hours = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Value per hour: ");
			Double valuePerHour = scanner.nextDouble();
			scanner.nextLine();

			if (outsource.charAt(0) == 'y') {

				System.out.print("Additional charge: ");
				Double additionalCharge = scanner.nextDouble();
				scanner.nextLine();

				OutsourcedEmployee outsourced = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);

				employee.add(outsourced);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);

				employee.add(emp);

			}
		}

		System.out.println("LIST OF EMPLOYEES: ");

		for (Employee empList : employee) {
			System.out.println(empList);
		}

		System.out.println("----------------");
		System.out.println("PAYMENTS:");

		for (Employee empList : employee) {
			System.out.println(empList.getName() + " - $" + empList.payment());
		}

		scanner.close();

	}

}
