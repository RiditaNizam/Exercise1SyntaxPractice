package com.fdmgroup.pensions.task3;

public class PensionController {

	private PensionLogic logic;
	private View view;

	public PensionController(PensionLogic logic, View view) {
		super();
		this.logic = logic;
		this.view = view;
	}

	public void handlePensions(Person[] people) {
		for (Person person : people) {
			if (logic.isPensionable(person, "2014")) {
				view.printEligible(person);
			} else {
				view.printIneligible(person);
			}
		}
	}
}