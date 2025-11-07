package PizzaPersonalizada;

public class Caja implements Observador {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("💵 Caja recibió notificación: " + mensaje);
    }
}
