package pratice_java;

public class InstanceInitializeBlock {

	public InstanceInitializeBlock() {
		System.out.println("Inside Constructor");
	}

	{
		System.out.println("Instance Initializer Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceInitializeBlock ib = new InstanceInitializeBlock();

	}

}
