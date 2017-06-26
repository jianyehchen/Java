package tw.soap68.soap68project.operation;

public class TestTypeCastEX1 {

	public static void main(String[] args) {
		byte b1=1,b2=127,b3;
		//b3=b1+b2會出現compiler error,因其已超出其位元組(
		b3=(byte)(b1+b2);//注意,此出若超出範圍則會重新循環
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		System.out.println("b3="+b3);

	}

}
