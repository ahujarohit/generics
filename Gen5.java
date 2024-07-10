class Gen5 {
	double data;
	public <T extends Number> Gen5(T obj) {
		data = obj.doubleValue();
	}
	public static void main(String args[]) {
		Gen5 obj1 = new Gen5(10);
		Gen5 obj2 = new Gen5(10l);
		Gen5 obj3 = new Gen5(10.5);
		Gen5 obj4 = new Gen5(10.6f);
	}
}
