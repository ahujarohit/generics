class Gen1<T>  {
	T a;

	public Gen1() {
	}

	public Gen1(T a) {
		this.a = a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getA() {
		return a;
	}

	public void showType() {
		System.out.println("Type of T is : " + a.getClass().getName());
	}

	public static void main(String args[]) {
		Gen1<Integer> obj = new Gen1<Integer>();
		obj.setA(10);
		System.out.println("Value : " + obj.getA());
		obj.showType();  // Type of T is : java.lang.Integer

		Gen1<String> obj1 = new Gen1<>();
		obj1.setA("Welcome");
		System.out.println("Value : " + obj1.getA());
		obj1.showType(); // Type of T is : java.lang.String
		//ERROR		Gen1<int> obj2 = new Gen1<int>();
	}
}



































