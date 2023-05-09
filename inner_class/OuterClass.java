package inner_class;

public class OuterClass {
	 private int outerVar;

	    public OuterClass(int value) {
	        outerVar = value;
	    }

	    public void printOuterVar() {
	        System.out.println("Outer var: " + outerVar);
	    } 


public class InnerClass {
	private int innerVar;

    public InnerClass(int value) {
        innerVar = value;
    }

    public void printInnerVar() {
        System.out.println("Inner var: " + innerVar);
    }

    public void printOuterVarFromInner() {
        System.out.println("Outer var from inner class: " + outerVar);
    }

}
}
