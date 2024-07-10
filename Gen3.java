class Gen3<T extends Number> {
	T num[];
	public Gen3(T num[]) {
		this.num = num;
	}
	public double average() {
		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i].doubleValue();
		}
		return sum / num.length;
	}
	public static void main(String args[]) {
		Integer num[] = { 1, 2, 3, 4, 5, 6 };
		Gen3<Integer> obj = new Gen3<Integer>(num);
		System.out.println(obj.average());

		Double num1[] = { 1.1, 2.2, 3.3, 4.4, 5.4, 6.6 };
		Gen3<Double> obj1 = new Gen3<>(num1);
		System.out.println(obj1.average());
		
		Gen3<String> obj1 = new Gen3<String>(num1);
		
	}
}






