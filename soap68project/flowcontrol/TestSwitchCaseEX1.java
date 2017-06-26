package tw.soap68.soap68project.flowcontrol;

public class TestSwitchCaseEX1 {

	public static void main(String[] args) {
		byte level = 127;
		switch (level) {
		default:
			System.out.println("Cure Herbs");
		case 25:
			System.out.println("Machine Gun");
		case 20:
			System.out.println("Pistal");
		case 15:
			System.out.println("Oak");
		case 10:
			System.out.println("Sword");
		case 5:
			System.out.println("Stick");
		case 1:
			System.out.println("hand");
			break;

		}
		System.out.println("fight");
	}

}
