public class ExtraLecheAlmendras extends CafeDecorator {
    public ExtraLecheAlmendras(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorado.getDescripcion() + ", Leche de Almendras";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 2.00;
    }
}