class Gen4 {
	public static <T, V extends T> boolean isIn(T num[], V num1) {
		for (int i = 0; i < num.length; i++) {
			if (num[i].equals(num1))
				return true;
		}
		return false;
	}

	public static void main(String args[]) {
		String str[] = { "One", "Two", "Three", "Five" };
		Integer num[] = { 1, 2, 3, 5 };
		if (!isIn(str, "Four"))
			System.out.println("Four not present");
		if (isIn(str, "Three"))
			System.out.println("Three  present");
		if (!isIn(num, 4))
			System.out.println("Four not present");
		if (isIn(num, 3))
			System.out.println("Three  present");
	}
}










