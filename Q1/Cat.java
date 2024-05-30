package Q1;

public class Cat extends Pet{

	private static int TotalPoint = 0;

	@Override
	public void feed() {
		System.out.println("Feeding the cat");
		TotalPoint += 5;
	}

	@Override
	public void clean() {
		System.out.println("Cleaning the cat");		
		TotalPoint += 10;

	}

	@Override
	public void cuddle() {
		System.out.println("Cuddling the cat");		
		TotalPoint += 15;

	}

	@Override
	public int getTotalPoints() {
		
		return TotalPoint;
	}

}
