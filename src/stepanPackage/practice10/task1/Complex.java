package stepanPackage.practice10.task1;

public class Complex {
    private int real;
    private int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {
        this.real = 0;
        this.image = 0;
    }

    @Override
    public String toString() {
        return "z = " + real + " + i*" + image;
    }
}
