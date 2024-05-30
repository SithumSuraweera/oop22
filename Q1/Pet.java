package Q1;

public abstract class Pet implements PointAllocator{
	private int points;
	
	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return points;
	}

	@Override
	public void setPoints(int points) {
		// TODO Auto-generated method stub
		this.points = points;
		
	}
	
	public abstract void feed();
	
	public abstract void clean();
	
	public abstract void cuddle();
	
	public abstract int getTotalPoints();
	
}
