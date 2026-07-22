public abstract class CafeDecorator implements Cafe {
    protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public String getDescripcion() {
        return cafeDecorado.getDescripcion();
    }

    @Override
    public double costo() {
        return cafeDecorado.costo();
    }
}