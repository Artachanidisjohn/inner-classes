
public class App {

	public static void main(String[] args) {

		Robot robot = new Robot(1);
		
		robot.start();
		

		Robot.Brain brain =robot.new Brain();
		brain.think();

		
		
		Robot.Baterry bat = new Robot.Baterry();
		bat.charge();
		
		
		
		
	}

}
