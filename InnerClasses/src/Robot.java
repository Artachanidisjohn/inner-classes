
public class Robot {

	private int id;
	
	public Robot(int id) {
		this.id=id;
	}
	
	
	
	public class Brain{
		public void think() {
			System.out.println("robot "+id+" is thinking...");
		}
	}
	
	static class Baterry{
		public void charge() {
			System.out.println("battery charging");
		}
	}
	
	
	
	public void start() {
		System.out.println("starting robot "+id);
		
		
		Brain brain = new Brain();
		brain.think();
	
	final String name="robert";
	
	class Temp{
		public void doSomething() {
			System.out.println("ID is: "+id);
			System.out.println("my name is: "+name);
		}
	}
	
	Temp temp = new Temp();
	temp.doSomething();
	

	
	}
}
