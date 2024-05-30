package Q2;

public class DemoApp {

	public static void main(String[] args) {
		TCalculation<Integer> ob1 = 
		new TCalculation<Integer>();
		
		TCalculation<Double> ob2 = 
		new TCalculation<Double>();
		
		ob1.append(10);
		ob1.append(20);
		ob1.append(30);
		
		System.out.println(ob1.average());
		
		
		ob2.append(10.5);
		ob2.append(20.34);
		ob2.append(30.99);
		
		System.out.println(ob2.average());

	}
}
