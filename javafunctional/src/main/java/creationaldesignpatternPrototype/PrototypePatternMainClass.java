package creationaldesignpatternPrototype;

public class PrototypePatternMainClass {

	public static void main(String[] args) {
		
		
		ProfessionCache.loadProfessionCache();
		
		Profession docProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession);
		
		Profession engProfession = ProfessionCache.getCloneNewProfession(2);
		System.out.println(engProfession);

		
		Profession docProfession1 = ProfessionCache.getCloneNewProfession(1);
		System.out.println(docProfession1);
		
		Profession engProfession1 = ProfessionCache.getCloneNewProfession(2);
		System.out.println(engProfession1);
	}

}
