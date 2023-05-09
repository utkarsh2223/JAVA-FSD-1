package PracticeExcer8;

public class String_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello, world!";

        // Convert string to StringBuffer
        StringBuffer sb = new StringBuffer(str);

        // Convert string to StringBuilder
        StringBuilder sbuilder = new StringBuilder(str);

        // Print out the original string and the converted StringBuffer and StringBuilder
        System.out.println("Original string: " + str);
        System.out.println("StringBuffer: " + sb.toString());
        System.out.println("StringBuilder: " + sbuilder.toString());

	}

}
