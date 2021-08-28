package functionalinterface;

@FunctionalInterface
public interface CustomeFI {

void boo();

default void foo() {
	System.out.println("oink");
};

default void foo1() {
	System.out.println("oink");
};
	
	
}
