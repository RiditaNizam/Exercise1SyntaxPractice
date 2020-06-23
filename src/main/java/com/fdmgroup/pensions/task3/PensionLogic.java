package com.fdmgroup.pensions.task3;

//Will perform our Business Logic

public class PensionLogic {
	public static boolean isPensionable(Person person, String year) {

		String dateOfBirth = person.getDateOfBirth();

		String lastFourDigitsYear = dateOfBirth.substring(dateOfBirth.length() - 4);

		int numberVersionYear = Integer.parseInt(lastFourDigitsYear);

		int ageThatYear = Integer.parseInt(year) - numberVersionYear;

		if (ageThatYear >= 65) {
			return true;
		} else {
			return false;
		}
	}
}