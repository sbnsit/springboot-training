package collectionsgenerics;



class Container<T> {
	T values;

	public Container(T values) {
		this.values = values;
	}
	
	public void show() {
		System.out.println(values.getClass().getName());
	}
	
	
}



public class GenericDemo {
	
	public static void main(String[] args) {
		
		Container<Integer> xyz = new Container<>(8);
		xyz.show();
		
	}

}
