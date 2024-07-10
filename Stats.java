class Stats<T extends Number> {

	T[] nums;

	Stats(T[] o) {		
		nums = o;
	}

	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i].doubleValue();
		return sum / nums.length;
	}

	boolean sameAvg(Stats<?> ob) {	// ? = Wildcard	
		if (average() == ob.average())
			return true;
		return false;
	}
}
//boolean x = sNum.sameAvg(sNum1);
//sNum = current context (Object in use)
//sNum1 = argument





























































































