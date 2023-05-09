package inner_class;

public class Inner_out_class {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass(10);
        OuterClass.InnerClass inner = outer.new InnerClass(20);

        outer.printOuterVar();
        inner.printInnerVar();
        inner.printOuterVarFromInner();
		

	}

}


