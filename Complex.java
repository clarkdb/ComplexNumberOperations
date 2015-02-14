
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
	
	//Allows the user to add complex numbers without specifying both numbers, using one previously specified with .add
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
	
	//Allows the user to subtract complex numbers without specifying both numbers, using one previously specified with .subtract
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
		
	//Allows the user to multiply complex numbers without specifying both numbers, using one previously specified with .multiply
	public Complex complexMultiply(Complex a){
		Complex newNum = new Complex(0,0);
		newNum.real = (this.real*a.real) - (this.imaginary*a.imaginary);
		newNum.imaginary = (this.real*a.imaginary) + (this.imaginary*a.real);
		return newNum;
	}
		
	//Multiplies two complex numbers given both numbers and returns a new complex number
	public static Complex complexMultiply(Complex a, Complex b){
		Complex value = new Complex(0,0);
		value.real = (a.real*b.real) - (a.imaginary*b.imaginary);
		value.imaginary = (a.real*b.imaginary) + (a.imaginary*b.real);
		return value;
	}
	
	//Divides complex numbers with only one specified to allow for .divide
	public Complex complexDivide(Complex a){
		Complex newNum = new Complex(0,0);
		newNum.real = this.real;
		newNum.real = 0 - this.imaginary;
		return simplify(complexMultiply(newNum,this),complexMultiply(newNum,a));
		
	}
	
	//Divides complex numbers after specifying both numbers being divided
	public Complex complexDivide(Complex a, Complex b){
		Complex newNum = new Complex(0,0);
		newNum.real = a.real;
		newNum.real = 0 - a.imaginary;
		return simplify(complexMultiply(newNum,a),complexMultiply(newNum,b));
		
	}
	
	//Simplifies the remainder after multiplication by 1 with the conjugate and remainder of the original complex number
	public Complex simplify(Complex conj, Complex rem){
		Complex value = new Complex(0,0);
		value.real = rem.real/conj.real;
		value.imaginary = rem.imaginary/conj.real;
		return value;
	}
	
	
}
