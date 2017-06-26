package tw.soap68.soap68project.operation;

public class TestOperationEX3 {

	public static void main(String[] args) {
		int i = 1, j = 2, k;
		// 若以k=i+++++j;會呈現compile error,而k=i++ + ++j辨識較不易,因此以下列方式呈現,()內優先處理
		k = (i++) + (++j);
		// i++,先取i=1,++j,則取1+2=3,故k=1+3=4

		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);

	}

}
