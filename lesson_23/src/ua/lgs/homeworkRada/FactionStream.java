package ua.lgs.homeworkRada;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import java.util.stream.Stream;


public class FactionStream {
	
private List <Deputy> faction;  

	private static final int CAPACITY = 16;

	public FactionStream() {
		super();
		faction = new ArrayList<>(CAPACITY);		
	}

	public void addDataStream(String nameOfFaction) {
		
		int height = getRandom(171,199);
		int weight = getRandom(60,110);
		String name = getRandomDeputy(getRandom(0,24));
		int age = getRandom(35,65);;
		boolean briber = setBribers();
		int bribeAmount = 0;
		if(briber == true) {
			bribeAmount = getRandom(0,100000);
		}
		String factionName = nameOfFaction;		
		faction.add(new Deputy(height, weight, name, age, briber, bribeAmount, factionName));
		
		//Option to create Stream
		Stream<Object> fraction = Stream.builder().add(new Deputy(height, weight, name, age, briber, bribeAmount, factionName)).build();
		fraction.forEach(System.out::println);

	}
	
	// Using Stream to output data to console
	public void createStream() {
		faction.stream()
		.forEach(System.out::println);
	}
	
	// Using Stream to filter data and output to console
	public void showFractionStream(String fraction) {
		faction.stream()
		.filter(name -> name.getFactionName().contains(fraction))
		.forEach(System.out::println);
	}
	
	public void showBiggestBriberStream() {
		Deputy briber = faction.stream()
				.max(Comparator.comparingInt(Deputy::getBribeAmount))
				.get();
		System.out.println(briber);
	}
	
	public void showBribersStream() {
		faction.stream()
		.filter(name -> name.isBriber()==true)
		.forEach(System.out::println);	
	}
	
	// Using Stream to remove data and output to console
	public void removeDataStream(String deputyName, String fractionName) {
		faction.removeIf(name -> (name.getName().contains(deputyName) && name.getFactionName().contains(fractionName)));
		faction.stream()
		.forEach(System.out::println);
	}

	public void removeFractionStream(String fraction) {
		faction.removeIf(name -> name.getFactionName().contains(fraction));
		faction.stream()
		.forEach(System.out::println);
	}
	

	// Auxiliary methods
	
	public static int getRandom(int min, int max) {		
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
	
	public static String getRandomDeputy(int id) {		
		String [] deputes = {"Piter", "Sophi", "Ivan", "Mykola", "Pavlo", "Marichka", "Andrew", "Polina", "Joseph", "Vasylyna", "Anna", "Adam",
							"Avrram", "Alisa", "Borys", "Bogdan", "Ulyana", "Viktor", "Kyra", "David", "Evgen", "Mariya", "Luka", "Alex", "Eva"};		
		String deputyName = deputes[id];		
		return deputyName;
	}
	
	public boolean setBribers() {
		boolean [] isBriber = {true, false};	
		return isBriber[getRandom(0, 1)];
	}
	
	public void offerBribe(String deputyName, String fraction) {
		int count = 0;
			for (Deputy deputy : faction) {
				if(deputy.getName().contains(deputyName) && deputy.getFactionName().contains(fraction) && count == 0) {
					count++;
					deputy.giveBribe();
				} 
			}
		}

}
