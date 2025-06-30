// Definimos la clase Producto
public class Producto {

    // Atributos privados del producto
    private String nombre;     // Almacena el nombre del producto
    private double precio;     // Almacena el precio del producto
    private int cantidad;      // Almacena cuántas unidades hay en inventario

    // Constructor de la clase Producto: se ejecuta al crear un objeto
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;       // Asigna el nombre pasado como parámetro
        this.precio = precio;       // Asigna el precio pasado como parámetro
        this.cantidad = cantidad;   // Asigna la cantidad pasada como parámetro
    }

    // Método para mostrar toda la información del producto
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);               // Muestra el nombre
        System.out.println("Precio: $" + precio);              // Muestra el precio
        System.out.println("Cantidad en inventario: " + cantidad +"\n"); // Muestra cantidad
    }

    // Método para cambiar el precio del producto
    public void cambiarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;  // Asigna un nuevo precio
    }

    // Método para agregar más unidades al inventario
    public void agregarStock(int cantidad) {
        this.cantidad += cantidad;  // Suma las unidades al inventario actual
    }

    // Método para realizar una venta
    public void vender(int unidades) {
        if (unidades <= cantidad) {         // Verifica si hay suficiente inventario
            cantidad -= unidades;           // Resta las unidades vendidas
            System.out.println("Venta realizada.");
        } else {
            System.out.println("No hay suficiente inventario."); // Muestra error si no hay suficientes
        }
    }
}
