package check;

import constants.Constants;

public class Check {

	private String firstName;
	private String lastName;

	public Check() {
		this.firstName="Chugun";
		this.lastName="Reika";
	}

	private void printName(final String LAST_NAME, final String FIRST_NAME) {
		System.out.println(LAST_NAME + " " + FIRST_NAME);
	}

	public static void main(String[] args) {

	 Check check = new Check();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);


		System.out.print("printNameメソッド→");
		check.printName(check.lastName, check.firstName);
		pet.introduce();
		robotPet.introduce();

}
}
