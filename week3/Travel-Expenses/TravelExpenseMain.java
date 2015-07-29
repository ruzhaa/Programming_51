package com.hackbulgaria.programming51.week3;

public class TravelExpenseMain {

	public static void main(String[] args) {
		Employee ivo = new Employee("Ivaylo");
	    Employee rado = new Employee("Rado");

	    Travel conf = new Travel("Sofia", "Bulgaria", 20);

	    TravelExpense dinnerRado = new TravelExpense("Dinner", rado, 50);
	    TravelExpense dinnerIvo = new TravelExpense("Dinner", ivo, 50);

	    conf.addExpense(dinnerRado);
	    conf.addExpense(dinnerIvo);

	    System.out.println(conf.totalCost()); // 120

	    Employee[] toFire = conf.mostExpensesMadeBy();

	    for(Employee employee: toFire) {
	      System.out.println(employee);
	    }


	}
}
