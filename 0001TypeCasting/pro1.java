class Demo{
	Demo(){
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
class Memo extends Demo{
	Memo(){
		System.out.println();

		System.out.println("Explicit Casting");
		double doubleVar = 42.0d;
		System.out.println(doubleVar);
			
		float floatVar = (float) doubleVar;
		System.out.println(floatVar);
			
		long longVar = (long)floatVar;
		System.out.println(longVar);

		int intVar = (int)longVar;
		System.out.println(intVar);

		short shortVar = (short)doubleVar;
		System.out.println(shortVar);

		byte byteVar = (byte)shortVar;
		System.out.println(byteVar);
		
	}
}
class Temo{
	public static void main(String [] args){
		Memo obj = new Memo();
	}
}
