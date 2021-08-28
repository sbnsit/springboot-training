package creationaldesignpatternBuilder;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		
		// create object of required home-builder
		
		EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
		
		// create object of director that will manage your builder
		
		Director director = new Director(earthQuakeResistantBuilder);
		
		director.manageRequiredHomeConstruction();
		
		Home homeConstructed = director.getComplexObjectOfHome();
		
		System.out.println(homeConstructed);
		System.out.println(homeConstructed.floor);
		
		
		
	}

}
