package PizzaPersonalizada;

public class Main {
    public static void main(String[] args) {
        // Crear el sistema de notificaciones
        NotificadorPedidos notificador = new NotificadorPedidos();
        notificador.registrarObservador(new Cocina());
        notificador.registrarObservador(new Caja());

        // Crear primer pedido
        Pizza pizza1 = new ChampinonesExtra(new QuesoExtra(new PizzaBase("Pizza Clásica", 9.0)));
        Pedido pedido1 = new Pedido("Roberth", "12345678", "roberth@gmail.com", "3200000000", pizza1);
        pedido1.mostrarDetallePedido();
        notificador.notificar("Nuevo pedido: " + pedido1.getDescripcion());

        // Crear segundo pedido
        Pizza pizza2 = new PepperoniExtra(new QuesoExtra(new PizzaBase("Pizza Napolitana", 10.0)));
        Pedido pedido2 = new Pedido("Laura", "98765432", "laura@gmail.com", "3101111111", pizza2);
        pedido2.mostrarDetallePedido();
        notificador.notificar("Nuevo pedido: " + pedido2.getDescripcion());
    }
}
