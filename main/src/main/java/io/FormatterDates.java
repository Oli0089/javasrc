package io;

import java.time.LocalDate;

/** Demonstrate some usage patterns and format-code examples 
 * of the Formatter class.
 */
// tag::main[]
public class FormatterDates {
	public static void main(String[] args) {

		// Format number as dates e.g., 2020-06-28
		System.out.printf("%4d-%02d-%2d%n", 2020, 6, 28);

		// Format fields directly from a Date object: multiple fields from "1$"
		// (hard-coded formatting for Date not advisable; see I18N chapter)
		LocalDate today = LocalDate.now();
		// Might print e.g., July 4, 2020:
		System.out.printf("Today is %1$tB %1$td, %1$tY%n", today);
	}
}
// end::main[]
