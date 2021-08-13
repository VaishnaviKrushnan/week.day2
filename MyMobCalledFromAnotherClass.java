package week1.Day2;

public class MyMobCalledFromAnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile myMobObj = new MyMobile();
		myMobObj.makeCall();
		myMobObj.sendMsg();
		
		System.out.println("Mobile Features : \n" + "Brand Name of Mobile :" + myMobObj.mobModel + "\n"
				+ "color of the Mobile : " + myMobObj.color + "\n" + "is TouchScreen : " + myMobObj.isTouchScreen + "\n"
				+ "ScreenSize : " + myMobObj.screenSize + "\n" + "memory : " + myMobObj.memory + "GB");


	}

}
