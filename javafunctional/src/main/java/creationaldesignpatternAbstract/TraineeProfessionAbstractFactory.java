package creationaldesignpatternAbstract;

public class TraineeProfessionAbstractFactory implements AbstractFactory{
	
	
	public Profession getProfession(String typeOfProfession) {
		if (typeOfProfession == null) {
			return null;
		}
		
		if (typeOfProfession.equalsIgnoreCase("Doctor")) {
			return new TraineeDoctor();
		}
		
		else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
			return new TraineeEngineer();
		}
		
		return null;
	}

}
