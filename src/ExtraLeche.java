public class ExtraLeche extends CafeDecorator {

    public ExtraLeche(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorado.getDescripcion() + ", Leche";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 1.50;
    }
}