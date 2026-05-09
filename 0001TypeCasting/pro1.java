class Demo{
	public static void main(String [] args){
		System.out.println("Implicit Casting");
		byte byteVar = 42;
		System.out.println(byteVar);

		short shortVar = byteVar;
		System.out.println(shortVar);

		int intVar = shortVar ;
		System.out.println(intVar);

		long longVar = intVar;
		System.out.println(longVar);

		float floatVar = longVar;
		System.out.println(floatVar);

		double doubleVar = floatVar;
		System.out.println(doubleVar);
	}
}
