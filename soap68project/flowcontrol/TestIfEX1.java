package tw.soap68.soap68project.flowcontrol;

public class TestIfEX1 {

	public static void main(String[] args) {
		int degree = 32;

		if (degree >= 30) {
			System.out.println("It's hot.");
		}
		System.out.println("Keep writing java");

		int prize = 100;//若其質不符合以下設定之條件,則不會顯示
		if (prize <= 50) {
			System.out.println("It's cheap");
		}
		System.out.println("I'd like to buy it.");
	}

}
