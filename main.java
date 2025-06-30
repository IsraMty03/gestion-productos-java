// Clase principal donde se ejecuta el programa
public class Main {

    // Método main: punto de entrada del programa
    public static void main(String[] args) {

        // Se crea un objeto producto1 con valores iniciales
        Producto producto1 = new Producto("Laptop", 15000.00, 10);

        // Se crea otro objeto producto2 con otros valores
        Producto producto2 = new Producto("Mouse", 200.00, 50);

        // Se muestra la información del producto1 (Laptop)
        producto1.mostrarInformacion();

        // Se intenta vender 2 unidades de la Laptop
        producto1.vender(2);

        // Se vuelve a mostrar la información actualizada de producto1
        producto1.mostrarInformacion();

        // Se muestra la información del segundo producto (Mouse)
        producto2.mostrarInformacion();

        // Se agregan 10 unidades al stock del Mouse
        producto2.agregarStock(10);

        // Se cambia el precio del Mouse a 180
        producto2.cambiarPrecio(180.00);

        // Se muestra la información del Mouse actualizada
        producto2.mostrarInformacion();

    }
}
