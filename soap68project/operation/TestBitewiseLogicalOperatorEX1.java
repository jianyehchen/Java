package tw.soap68.soap68project.operation;

public class TestBitewiseLogicalOperatorEX1 {

	public static void main(String[] args) {
		int x = 2, y = 3;
		// 以下皆以2進位來看,(10進位2=2進位00000010,10進位3＝2進位00000011）
		System.out.println("~" + x + "=" + (~x));// 取補數+1
		System.out.println(x + "&" + y + "=" + (x & y));// 取相同之數值
		System.out.println(x + "|" + y + "=" + (x | y));// 數值都取
		System.out.println(x + "^" + y + "=" + (x ^ y));// 取非相同數值
	}

}
