package PizzaPersonalizada;

public class PizzaBase implements Pizza {
    private String nombre;
    private double precio;

    public PizzaBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return nombre;
    }

    @Override
    public double getCosto() {
        return precio;
    }
}


