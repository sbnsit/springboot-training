package creationaldesignpatternAbstract;

public class AbstractPatternMainClass {

	public static void main(String[] args) {
		
		
		AbstractFactory af = AbstractFactoryProducer.getProfession(false);
		
		Profession doc = af.getProfession("Doctor");
		
		doc.print();

	}

}
