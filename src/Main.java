public class Main {
    public static void main(String[] args) {

        System.out.println("--- Pedido 1 ---");
        Cafe pedido1 = new CafeAmericano();
        pedido1 = new ExtraCremaBatida(pedido1);
        System.out.println(pedido1.getDescripcion() + " Total:" + pedido1.costo());

        System.out.println("--- Pedido 2 ---");
        Cafe pedido2 = new CafeDescafeinado();
        pedido2 = new ExtraLecheAlmendras(pedido2);
        pedido2 = new ExtraChocolate(pedido2);
        pedido2 = new ExtraCremaBatida(pedido2);
        System.out.println(pedido2.getDescripcion() + " Total: " + pedido2.costo());

        System.out.println("--- Pedido 3 ---");
        Cafe pedido3 = new CafeEspresso();
        pedido3 = new ExtraChocolate(pedido3);
        pedido3 = new ExtraChocolate(pedido3);
        System.out.println(pedido3.getDescripcion() + " Total: " + pedido3.costo());
    }
}