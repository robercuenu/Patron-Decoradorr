package PizzaPersonalizada;

public class Main {
    public static void main(String[] args) {

        // 🔸 Pedido 1
        Pizza pizza1 = new PizzaBase("Pizza Clásica", 7.0);
        pizza1 = new QuesoExtra(pizza1);
        pizza1 = new PepperoniExtra(pizza1);
        pizza1 = new ChampinonesExtra(pizza1);

        Pedido pedido1 = new Pedido(
                "Roberth Cuenu",
                "1087489234",
                "roberth@example.com",
                "3004567890",
                pizza1
        );

        // 🔸 Pedido 2
        Pizza pizza2 = new PizzaBase("Pizza Vegetariana", 8.0);
        pizza2 = new ChampinonesExtra(pizza2);
        pizza2 = new QuesoExtra(pizza2);

        Pedido pedido2 = new Pedido(
                "Laura Martínez",
                "1012345678",
                "lauram@example.com",
                "3109876543",
                pizza2
        );

        // 🔸 Pedido 3
        Pizza pizza3 = new PizzaBase("Pizza Doble Carne", 9.5);
        pizza3 = new PepperoniExtra(pizza3);
        pizza3 = new QuesoExtra(pizza3);

        Pedido pedido3 = new Pedido(
                "Carlos Rodríguez",
                "1029384756",
                "carlosr@example.com",
                "3201234567",
                pizza3
        );

        // 🔹 Mostrar los pedidos
        pedido1.mostrarPedido();
        pedido2.mostrarPedido();
        pedido3.mostrarPedido();
    }
}
