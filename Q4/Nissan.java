package Q4;

public class Nissan implements Car{

	CarAirBag carAirBag;
	private String type;
	
	
	@Override
	public void assembleLight() {
		System.out.println("assemblying for Nissan");
		System.out.println("Assemble lights to "+type);
	}

	public Nissan(CarAirBag carAirBag) {

		this.carAirBag = carAirBag;
		type = carAirBag.deploy();
	}

	@Override
	public void assembleMotionSensor() {
		System.out.println("assemblying for Nissan");
		System.out.println("Assemble Sensor to "+type);		
	}

}
