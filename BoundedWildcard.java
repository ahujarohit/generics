class TwoD {			
	int x, y;
	TwoD(int a, int b) {
		x = a;
		y = b;
	}
}
class ThreeD extends TwoD {
	int z;
	ThreeD(int a, int b, int c) {
		super(a, b);
		z = c;
	}
}
class FourD extends ThreeD {
	int t;
	FourD(int a, int b, int c, int d) {
		super(a, b, c);
		t = d;
	}
}
class Coords<T extends TwoD> {		
	T[] coords;		
	Coords(T[] o) {
		coords = o;
	}
}
class BoundedWildcard {
	static void showXY(Coords<?> c) {	//TwoD, ThreeD, FourD	
		System.out.println("X Y Coordinates:");
		for (int i = 0; i < c.coords.length; i++)
		System.out.println(c.coords[i].x + " " + c.coords[i].y);
		System.out.println();
	}

	static void showXYZ(Coords<? extends ThreeD> c) {	//ThreeD, FourD
		System.out.println("X Y Z Coordinates:");
		for (int i = 0; i < c.coords.length; i++)
System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
		System.out.println();
	}

	static void showAll(Coords<? extends FourD> c) {	//FourD	
		System.out.println("X Y Z T Coordinates:");
		for (int i = 0; i < c.coords.length; i++)
System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
		System.out.println();
	}

	public static void main(String args[]) {
TwoD td[] = {
		 new TwoD(0, 0), 
		new TwoD(7, 9), 
		new TwoD(18, 4), 
		new TwoD(-1, -23)
	 };
		Coords<TwoD> tdlocs = new Coords<TwoD>(td);
		System.out.println("Contents of tdlocs.");
		showXY(tdlocs); // OK, is a TwoD		//2d,3d,4d
		// showXYZ(tdlocs); // Error, not a ThreeD		//3d,4d
		// showAll(tdlocs); // Error, not a FourD		//4d

		FourD fd[] = { 
			new FourD(1, 2, 3, 4), 
			new FourD(6, 8, 14, 8), 
			new FourD(22, 9, 4, 9),
			new FourD(3, -2, -23, 17) };
		Coords<FourD> fdlocs = new Coords<FourD>(fd);
		System.out.println("Contents of fdlocs.");
		
		showXY(fdlocs);			//2d,3d,4d
		showXYZ(fdlocs);		//3d,4d
		showAll(fdlocs);		//4d
	}
}








