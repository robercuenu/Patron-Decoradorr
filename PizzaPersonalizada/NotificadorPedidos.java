package PizzaPersonalizada;

import java.util.ArrayList;
import java.util.List;

public class NotificadorPedidos {
    private List<Observador> observadores = new ArrayList<>();

    public void registrarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void eliminarObservador(Observador obs) {
        observadores.remove(obs);
    }

    public void notificar(String mensaje) {
        for (Observador obs : observadores) {
            obs.actualizar(mensaje);
        }
    }
}
