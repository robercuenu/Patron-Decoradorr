package PizzaPersonalizada;

public class Cocina implements Observador {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("👨‍🍳 Cocina recibió notificación: " + mensaje);
    }
}
