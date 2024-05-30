package Q4;

public class Toyota implements Car{

	CarAirBag carAirBag;
	private String type;
	
	
	@Override
	public void assembleLight() {
		System.out.println("assemblying for toyota");

		System.out.println("Assemble lights to "+type);
	}

	public Toyota(CarAirBag carAirBag) {

		this.carAirBag = carAirBag;
		type = carAirBag.deploy();
	}

	@Override
	public void assembleMotionSensor() {
		System.out.println("assemblying for toyota");

		System.out.println("Assemble Sensor to "+type);		
	}

}
