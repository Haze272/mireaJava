package stepanPackage.practice10.task1;

public class ConcreteFacrtory implements IComplexAbstractFactory {

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }

    @Override
    public Complex createComplex() {
        return new Complex();
    }
}
