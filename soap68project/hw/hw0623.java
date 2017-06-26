package tw.soap68.soap68project.hw;

public class hw0623 {

	public static void main(String[] args) {
		float d1 = 32f;
		byte index = 1;// (byte) (Math.random() * 2 + 1);
		if (index == 1) {
			System.out.println("C=" + d1 + " F=" + (d1 * 9 / 5 + 32));
		} else if (index == 2) {
			System.out.println("F=" + d1 + " C=" + ((d1 - 32) * 5 / 9));
		}

	}

}
