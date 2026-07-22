public class CafeDescafeinado implements Cafe {
    @Override
    public String getDescripcion() {
        return "Café Descafeinado";
    }

    @Override
    public double costo() {
        return 4.00;
    }
}