package creationaldesignpatternAbstract;

public class ProfessionAbstractFactory implements AbstractFactory {
	
	
	public Profession getProfession(String typeOfProfession) {
		if (typeOfProfession == null) {
			return null;
		}
		
		if (typeOfProfession.equalsIgnoreCase("Doctor")) {
			return new Doctor();
		}
		
		else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
			return new Engineer();
		}
		
		return null;
	}

}
