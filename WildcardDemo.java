class WildcardDemo {
	public static void main(String args[]) {
		Integer inums[] = { 1, 2, 3, 4, 5 };	
		Stats<Integer> iob = new Stats<Integer>(inums);	//T=Integer
		double v = iob.average();
		System.out.println("iob average is " + v);

		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };		
		Stats<Double> dob = new Stats<Double>(dnums);	//T=Double
		double w = dob.average();
		System.out.println("dob average is " + w);

		Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		Stats<Float> fob = new Stats<Float>(fnums);	//T=Float
		double x = fob.average();
		System.out.println("fob average is " + x);

		System.out.print("Averages of iob and dob ");
		if (iob.sameAvg(dob))	//iob T = Integer, dob T= double
			System.out.println("are the same.");
		else
			System.out.println("differ.");

		System.out.print("Averages of iob and fob ");

		if (iob.sameAvg(fob))	//iob T = Integer, fod T = Float
			System.out.println("are the same.");
		else
			System.out.println("differ.");
	}
}















