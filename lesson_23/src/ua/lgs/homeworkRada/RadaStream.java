package ua.lgs.homeworkRada;


public class RadaStream {
private static RadaStream instance;
	
	FactionStream faction = new FactionStream();
	public String mainRada;	
	private RadaStream(String mainRada) {
		this.mainRada = mainRada;
	}
	
	public static RadaStream getInstance(String mainRada) {
		if(instance == null) {
			instance = new RadaStream(mainRada);
		}
		return instance;
	}
	
	public void createStream() {		
		faction.createStream();	
	}
	public void addDataStream(String nameOfFaction) {		
		faction.addDataStream(nameOfFaction);	
	}
	
	public void showBiggestBriberStream()  {
		faction.showBiggestBriberStream();
	}
	
	public void removeDeputyStream(String deputyName, String fractionName) {		
		faction.removeDataStream(deputyName, fractionName);	
	}
	
	public void removeFractionStream(String fraction) {		
		faction.removeFractionStream(fraction);	
	}
	
	public void showFractionStream(String fraction) {		
		faction.showFractionStream(fraction);	
	}
	
	public void showBribersStream() {
		faction.showBribersStream();		
	}
	

	public void giveBribe(String name, String fraction) {
		faction.offerBribe(name, fraction);
	}
}
