package Q1;

public class Squirrel extends Pet{

	private static int TotalPoint = 0;
	private String command;

	@Override
	public void feed() {
		System.out.println("Feeding the Squirrel");
		TotalPoint += 5;
	}

	@Override
	public void clean() {
		System.out.println("Cleaning the Squirrel");		
		TotalPoint += 10;

	}

	@Override
	public void cuddle() {
		System.out.println("Cuddling the Squirrel");		
		TotalPoint += 15;

	}

	@Override
	public int getTotalPoints() {
		
		if(isCaught() == true)
		{
			TotalPoint = 0;
		}
		
		return TotalPoint;
	}
	
	public Squirrel(String command) {
		this.command = command;
	}
	
	public boolean isCaught()
	{
		try {
			if("Run5".equalsIgnoreCase(command))
			{
				throw new CaughtException(" Caught");
			} 
			return true;
		} catch (CaughtException e)
		{
			System.out.print("Did not cought");
		}
		
		return false;
		
	}

}
