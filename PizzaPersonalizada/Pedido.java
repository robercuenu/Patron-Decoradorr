package PizzaPersonalizada;

public class Pedido {
    private String nombreCliente;
    private String identificacion;
    private String correo;
    private String telefono;
    private Pizza pizza;

    public Pedido(String nombreCliente, String identificacion, String correo, String telefono, Pizza pizza) {
        this.nombreCliente = nombreCliente;
        this.identificacion = identificacion;
        this.correo = correo;
        this.telefono = telefono;
        this.pizza = pizza;
    }

    public void mostrarPedido() {
        System.out.println("🧾 Pedido para: " + nombreCliente);
        System.out.println("🪪 Identificación: " + identificacion);
        System.out.println("📧 Correo: " + correo);
        System.out.println("📞 Teléfono: " + telefono);
        System.out.println("🍕 Descripción: " + pizza.getDescripcion());
        System.out.println("💰 Total a pagar: $" + pizza.getCosto());
        System.out.println("--------------------------------------");
    }
}
