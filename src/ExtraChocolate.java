public class ExtraChocolate extends CafeDecorator {
    public ExtraChocolate(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorado.getDescripcion() + ", Chocolate";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 1.75;
    }
}