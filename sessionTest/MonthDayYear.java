package org.sessionTest;

import java.util.Scanner;

public class MonthDayYear {
	private static int year;
	private static int month;
	private static int date;

	private static boolean isValidYear() {

		if (year < 10000)

			return true;
		else
			return false;

	}

	private static String getNameOftheMonth(int month) {
		switch (month) {
		case 1:
			return "This is january";

		case 2:
			return "This is feburary";
		case 3:
			return "This is march";

		case 4:
			return "This is April";

		case 5:
			return "This is may";

		case 6:
			return "This is june";

		case 7:
			return "This is july";

		case 8:
			return "This  is august";

		case 9:
			return "This is september";

		case 10:
			return "This is october";

		case 11:
			return "This is november";

		case 12:
			return "This is december";
		default:
			return "This is not a month";
		}

	}

	private static void setMonthNumber() {
		if (month <= 12) {

		} else {
			month %= 12;
			if (month == 0) {
				month += 12;
			}
		}
	}

	private static Month getMonthInfo() {
		int maxDays = 0;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 10 || month == 12) {
			maxDays = 31;
		} else if (month == 4 || month == 6 || month == 8 || month == 11) {
			maxDays = 30;
		} else if (month == 2) {
			if ((year % 4) == 0) {
				maxDays = 29;
				System.out.println("leap year");
			} else {
				maxDays = 28;
				System.out.println("non leap year");
			}

		} else {
			System.out.println("month is invalid");
		}
		setMonthNumber();
		String monthName = getNameOftheMonth(month);
		Month monthDate = new Month(month, maxDays, monthName);
		/*
		 * monthDate.setMax_no_days(maxDays); monthDate.setMonth(month);
		 * monthDate.setNameOftheMonth(printNameOftheMonth(month));
		 */
		return monthDate;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("enter the year :");
			year = sc.nextInt();
			boolean isValidYear = isValidYear();
			if (isValidYear) {
				break;
			} else {
				System.out.println("cannot take morethan 4 digit number");
			}
		}

		while (true) {
			System.out.println("enter the month :");
			month = sc.nextInt();
			if (month <= 0) {
				System.out.println("please give me valid month");
			} else {
				Month monthDate = getMonthInfo();
				System.out.println("Month name :" + monthDate.getnameOftheMonth());
				break;

			}
		}

		while (true) {
			System.out.println("enter the date");
			Month monthDate = getMonthInfo();
			int no_of_days = monthDate.getMax_no_days();
			date = sc.nextInt();
			if (date <= no_of_days) {
				System.out.println("mm-dd-yyyy : " + "" + month + "-" + date + "-" + year);
				break;
			} else {
				System.out.println("no.of dates cannot exceed: " + no_of_days);
			}
		}
		sc.close();
	}

}
