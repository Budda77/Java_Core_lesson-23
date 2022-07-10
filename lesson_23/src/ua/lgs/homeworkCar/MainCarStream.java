/*
 * LOGOS It Academy home work 23
 * Task 2
 * 
 * */

package ua.lgs.homeworkCar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * This program demonstrates how to use Stream and Lambda expressions to sort data.
 * @author Oleksandr
 * 
 * */

public class MainCarStream {

	public static void main(String[] args) {
	
		List <Car> cars = new ArrayList<>();
		cars.add(new Car("Opel", 1985));
		cars.add(new Car("Ford", 2012));
		cars.add(new Car("BMW", 1977));
		cars.add(new Car("Hyundai", 2021));
		cars.add(new Car("Nissan", 2022));	
		cars.add(new Car("BMW", 1994));
		cars.add(new Car("Fiat", 2000));
		cars.add(new Car("Opel", 1999));
		cars.add(new Car("Nissan", 2001));
		cars.add(new Car("Peugeot", 1997));
		cars.add(new Car("MAN", 1996));
		cars.add(new Car("Kia", 2014));
		cars.add(new Car("Fiat", 1965));
		cars.add(new Car("Kia", 1989));
		cars.add(new Car("BMW", 2020));
		cars.add(new Car("Ford", 1999));
		cars.add(new Car("Peugeot", 2014));
		cars.add(new Car("Audi", 2003));
		cars.add(new Car("Kia", 1997));
		cars.add(new Car("Ford", 2020));
		cars.add(new Car("Hyundai", 1995));
		cars.add(new Car("Ford", 1987));
		cars.add(new Car("BMW", 2007));
		cars.add(new Car("Opel", 1991));
		cars.add(new Car("Nissan", 1988));
		cars.add(new Car("Fiat", 2018));
		cars.add(new Car("Peugeot", 2018));
		cars.add(new Car("MAN", 2022));
		cars.add(new Car("Kia", 2007));
		cars.add(new Car("Opel", 1998));
		cars.add(new Car("Ford", 2001));
		cars.add(new Car("Audi", 2017));
		cars.add(new Car("MAN", 2019));
		cars.add(new Car("Opel", 1983));
		
		System.out.println("Before sort:");
		cars.forEach(System.out::println);
		
		System.out.println("\nAfter sort by model:");
		cars.sort((o1, o2) -> o1.getModel().compareTo(o2.getModel()));
		cars.forEach(System.out::println);
		
		System.out.println("\nAfter sort by years:");
		cars.sort((o1, o2) -> o1.getYearOfIssue() - o2.getYearOfIssue());
		cars.forEach(System.out::println);
		
		System.out.println("\nSort by years in reverse order:");
		Comparator<Car> comparator = (o1, o2) -> o1.getYearOfIssue() - o2.getYearOfIssue();
		cars.sort(comparator.reversed());
		cars.forEach(System.out::println);
		
		System.out.println("\nAfter sort 2 by model and year:");
		cars.sort((o1,o2) ->{
			if(o1.getModel().equals(o2.getModel()))
				return o1.getYearOfIssue()- o2.getYearOfIssue();
			return o1.getModel().compareTo(o2.getModel());
		});
		cars.forEach(System.out::println);
	}

}
