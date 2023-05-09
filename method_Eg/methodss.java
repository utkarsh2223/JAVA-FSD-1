package method_Eg;

public class methodss {

	public static void main(String[] args) {
		
		A1 a = new A1();
		a.function1();
		
		int x = 2;
		int y = 4;
		
		A2 b = new A2();
		int sum = b.function2(x, y);
		System.out.println(sum);
		
		A3 c = new A3();
		String s = c.function3();
		System.out.println(s);
		
		

	}

}
