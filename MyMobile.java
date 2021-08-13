package week1.Day2;

public class MyMobile {
	boolean isTouchScreen;
	String mobModel = "OnePlus";
	char color = 'B';
	float screenSize = 6.5f;
	int memory = 64;

	public void makeCall() {
		System.out.println("Inside makeCall Method");
	}

	public void sendMsg() {
		System.out.println("Inside sendMsg Method");
	}

	private void payBills() {
		System.out.println("Inside payBills Method");
	}

	public static void main(String[] args) {
		MyMobile myMob = new MyMobile();
		myMob.makeCall();
		myMob.sendMsg();
		myMob.payBills();
		System.out.println("Mobile Features : \n" + "Brand Name of Mobile :" + myMob.mobModel + "\n"
				+ "color of the Mobile : " + myMob.color + "\n" + "is TouchScreen : " + myMob.isTouchScreen + "\n"
				+ "ScreenSize : " + myMob.screenSize + "\n" + "memory : " + myMob.memory + "GB");

	}

}
