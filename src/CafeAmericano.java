public class CafeAmericano implements Cafe {
    @Override
    public String getDescripcion() {
        return "Café Americano";
    }

    @Override
    public double costo() {
        return 3.50;
    }
}