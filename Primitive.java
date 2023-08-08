public class Primitive{
		
	/*
		***** Java Primitive Types Summary *** 

		Data Type - Memory Size - Range * Signedness
		
		byte - 1 byte - (-128, 127) *Signed 
		short - 2 byte - (-32768, 32767) *Signed 
		int - 4 byte - (-2147483648, 2147483647) *Signed 
		long - 8 byte - (-922372036854775808, 922372036854775807) *Unsigned
		float - 4 byte - (6 - 7 decimal digits) *Unsigned 
		double - 8 byte - (5 decimal digits) *Unsigned
		boolean - 1 byte - true or false *Unsigned 
		char - 2 byte - Single character/ASCII value *Unsigned 

	*/

	//****************************countBits****************************
	public static short countBits(int n){
		//Initialize a short for tracking the number of bits
		short numBits = 0;
		
		//While the number is greater than 0
		while(n != 0){
			//Increment numBits if the last bit of n is 1
			numBits += (x & 1);
			//Right shift n's bits 
			n >>>= 1;
		}
		//Return the number of bits 
		return numBits;
	}

	/*
	-------------------------SUMMARY---------------------------
	Time Complexity: O(n)
	Space Complexity: O(1)
	-------------------------INSIGHTS---------------------------
	Not ideal time complexity 
	Bit shifting might involve more space complexity ?
	*/

	/*
		*** Java Boxed Data Types Summary (Wrappers) *** 
		Wrapper Class - Primitive Type Analog
		
		Boolean - bool - 
		Byte - byte -  
		Character - char - 
		Float - float - 
		Integer - int - 
		Long - long - 
		Short - short - 
		Double - double - 

		//Wrapper class constants 
		Integer.SIZE
		Integer.MIN_VALUE 
		Integer.MAX_VALUE 
		Integer.BYTES
		Integer.TYPE

		//Wrapper class static methods 

		Integer.valueOf()
			- returns an Integer instance 
		Integer.parseInt()
			- parses a String into an Integer 
		Integer.toUnsignedString()
			- returns a decimal String representation of the unsigned int 
		Integer.toHexString()
			- returns a hexadecimal String representation of the int
		Integer.toOctalString()
			- returns an octadecimal String representation of the int
		Integer.toBinaryString()
			- returns a binary String representation of the int
		Integer.parseUnsignedInt()
		Integer.intValue()
		Integer.floatValue()
		Integer.doubleValue()
		Integer.hashCode()
		Integer.getInteger()
		Integer.decode()
		Integer.compare()
		Integer.compareUnsigned()
		Integer.divideUnsigned()
		Integer.remainedUnsigned()
		Integer.highestOne()
		Integer.lowestOne()
		Integer.numberOfLeadingZeroes()
		Integer.numberOfTrailingZeroes()
		Integer.bitCount()
		Integer.rotateLeft()
		Integer.rotateRight()
		Integer.reverse()
		Integer.signum()
		Integer.reverseBytes()
		Integer.sum()
		Integer.max()
		Integer.min()
		Integer.compareTo()
		

		//Various class specific methods 
		byteValue()
		shortValue()
		intValue()
		longValue()
		floatValue()
		doubleValue()
		toString()

		//String to primitive 
		parseInt()
		parseDouble()
		parseBoolean()

		*Auto Boxing - automatic conversion of primitive types to boxed (wrapper class) types 
		*Auto Unboxing - automatic conversion of boxed types to primitive types 
	*/

	
	























}