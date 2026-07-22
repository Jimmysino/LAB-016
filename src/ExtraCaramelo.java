public class ExtraCaramelo extends CafeDecorator {

    public ExtraCaramelo(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorado.getDescripcion() + ", Caramelo";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 2.50;
    }
}