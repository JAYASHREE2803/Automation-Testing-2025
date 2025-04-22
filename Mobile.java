package week1.day1;

public class Mobile {
	public void makeCall() {
	    String mobileModel = "Samsung galaxy f14";
		Float mobileWeight = 25.2f;
		System.out.println("Mobile model: "+mobileModel);
		System.out.println("Mobile weight: "+mobileWeight);
		
	}
	public void sendMsg() {
		boolean isFullcharged = true;
		int mobileCost = 15000;
		System.out.println("Full charged: "+isFullcharged);
		System.out.println("Mobile Cost: "+mobileCost);
	}
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my mobile");
	}
}