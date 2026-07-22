public class ExtraCremaBatida extends CafeDecorator {
    public ExtraCremaBatida(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorado.getDescripcion() + ", Crema Batida";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 2.50;
    }
}