public class CafeEspresso implements Cafe {
    @Override
    public String getDescripcion() {
        return "Café Espresso";
    }

    @Override
    public double costo() {
        return 5.00;
    }
}