
public class Complex {
	private double real;
	private double imaginary;

	//Initiates a complex number with values specified by the user for real and imaginary
	public Complex(double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	//Initiates a complex number to be used for operations with a real number and initial zero imaginary component
	public Complex(double real){
		this.real = real;
		this.imaginary = 0;
	}
	
	//Empty constructor to initialize a complex number of zero
	public Complex(){
		this.real = 0;
		this.imaginary = 0;
	}
	
	
	//The return values will be printed when testing, so the toString will need to be implemented
	public static String toString(Complex com){
		String ret = com.real + " + " + com.imaginary + "i\n";		
		return ret;
	}
	
	//Allows the user to add complex numbers to another without specifying both numbers, using one previously specified with .add
	public Complex complexAdd(Complex a){
		this.real += a.real;
		this.imaginary += a.imaginary;
		return this;
	}
	
	//Adds the real and imaginary parts of the number separately and returns another complex number of the sum
	public static Complex complexAdd(Complex a, Complex b){
		Complex value = new Complex(0,0);
		value.real = a.real + b.real;
		value.imaginary = a.imaginary + b.imaginary;
		return value;
	}
	
	//Allows the user to subtract complex numbers to another without specifying both numbers, using one previously specified with .subtract
	public Complex complexSubtract(Complex a){
		this.real = this.real - a.real;
		this.imaginary = this.imaginary - a.imaginary;
		return this;
	}
	
	//Subtracts the real and imaginary parts of the number separately and returns another complex number of the difference
		public static Complex complexSubtract(Complex a, Complex b){
			Complex value = new Complex(0,0);
			value.real = a.real - b.real;
			value.imaginary = a.imaginary - b.imaginary;
			return value;
		}
	
	
	
	
}
