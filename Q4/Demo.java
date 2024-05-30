package Q4;

public class Demo {

	public static void main(String[] args) {
		CarAirBag fAirbag = new FrontAirBag();
		CarAirBag sAirbag = new SideAirBag();
		
		new Nissan(fAirbag).assembleLight();
		new Nissan(fAirbag).assembleMotionSensor();
		new Nissan(sAirbag).assembleMotionSensor();

		new Toyota(fAirbag).assembleLight();
		new Toyota(fAirbag).assembleMotionSensor();
		new Toyota(sAirbag).assembleLight();
		new Toyota(sAirbag).assembleMotionSensor();
	}
}
