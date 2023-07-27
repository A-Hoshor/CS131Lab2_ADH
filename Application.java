
public class Application {

	public static void main(String[] args) {

		Wizard wiz = new Wizard();
		wiz.setName("Gandalf");
		System.out.println(wiz.getName());
		wiz.setHealth(20);
		System.out.println(wiz.getHealth());
		wiz.setKey(2);
		System.out.println(wiz.getKey());
		wiz.lock(2);
		System.out.println(wiz.isLocked());
		wiz.unlock(2);
		System.out.println(wiz.isLocked());
		wiz.lock(1);
		System.out.println(wiz.isLocked());
		wiz.takeDamage(2);
		System.out.println(wiz.toString());
		
	}//end main

}///end class
