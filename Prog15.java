class Prog7 {
	public static void main(String[] args)
	{
		short x = 2025;
		int y = 2030;
		float z = 3.9f;
		float r = 1.1f;
		System.out.println("x is "+x+" y is "+y);
		System.out.println("Addition:"+(x+y));
		System.out.println("Subtraction:"+ (x-y));
		System.out.println("Multiplication:"+x*y);
		System.out.println("Division:"+(y/x)); // as the longer size among int,short is int, it gives division in integer 
		
		System.out.println("int+float:float"+ (x+z));
		System.out.println("short/float:float"+(x/r));
		System.out.println("float/float:float"+(z/r));
		float k = z/r;
		System.out.println(k);
	}
}
