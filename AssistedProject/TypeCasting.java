package AssistedProject;

public class TypeCasting {

	public static void main(String[] args) {
		// implicit type casting
		int a = 10;
		System.out.println("Value of a: " + a);
        double b = a;
        System.out.println("Implicit Type Casting - " + b);
        
        // explicit type casting
        double x = 22.25;
        System.out.println("Value of x: " + x);
        int y = (int) x;
        System.out.println("Explicit Type Casting - " + y);

	}

}
