package PizzaPersonalizada;

public class Repartidor implements Observador {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("🛵 Repartidor recibió notificación: " + mensaje);
    }
}
