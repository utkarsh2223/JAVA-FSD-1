package AccessModifiers;

public class AccessSpecifiers {

	public static void main(String[] args) {
		
		// PrivateAccess obj1 = new PrivateAccess();
		// obj1.func();
		
		ProtectedAccess obj2 = new ProtectedAccess();
		obj2.func();
		
		PublicAccess obj3 = new PublicAccess();
		obj3.func();
		
		DefaultAccess obj4 = new DefaultAccess();
		obj4.func();

	}

}
