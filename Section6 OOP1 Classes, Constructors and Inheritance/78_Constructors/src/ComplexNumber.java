public class ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double real, double imaginary){
        this.real +=real;
        this.imaginary+=imaginary;
    }

    public void add(ComplexNumber addition) {
        this.real += addition.getReal();
        this.imaginary += addition.getImaginary();
    }
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber subtraction) {

        this.real -= subtraction.getReal();
        this.imaginary -= subtraction.getImaginary();
    }

}
