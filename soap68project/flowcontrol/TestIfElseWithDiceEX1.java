package tw.soap68.soap68project.flowcontrol;

public class TestIfElseWithDiceEX1 {

	public static void main(String[] args) {
		int dicenumber = (int) (Math.random() * 6 + 1);
		/*0.0<=隨機數字<1.0,因骰子的數字不會有0及小數點,且是1~6,
		所以我們將(int)0.0*6+1<=隨機數字*6+1<1.0*6+1,使其強制成為只有整數且範圍在1~6:1<=隨機數字<7
		其中*"6"是只給的範圍個數,+"1"是指範圍位置
		*/
		
		System.out.println("dicenumber:" + dicenumber);
		
		int yourluckynumber = 5;
		
		if (yourluckynumber == dicenumber) {
			System.out.println("You Win!");
		} else {
			System.out.println("Try Again!");
		}
		System.out.println("Finished");
		
		int lottorynumber=(int)(Math.random()*42+1);
		System.out.println("lottorynumber:"+lottorynumber);
		
		int yourlottorynumber=37;
		
		if(yourlottorynumber==lottorynumber){
			System.out.println("Congragulatin!!");
		}
		else
		{
			System.out.println("Never Give Up!");
			}
		System.out.println("Have Fun!");
	}

}
