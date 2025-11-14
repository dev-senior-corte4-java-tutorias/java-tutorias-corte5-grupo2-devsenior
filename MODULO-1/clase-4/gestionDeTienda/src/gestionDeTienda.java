import java.util.Scanner;

public class gestionDeTienda {
    static String producto1 = "";
    static double precio1 = 0, cantidad1 = 0;

    // producto 2
    static String producto2 = "";
    static double precio2 = 0, cantidad2 = 0;

    // producto 3

    static String producto3 = "";
    static double precio3 = 0, cantidad3 = 0;

    static int totalProductos = 0;

    /*
     * public -> modificador de acceso
     * Static -> que pertenece a la clase
     * void -> que no retorna nada
     * main -> el nombre
     * ()-> lo que recibe
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    registrarProducto(scanner);
                    break;
                case 2: 
                mostrarProducto();
                break;

                case 3:

                calcularInventarioTotal();

                break;

                case 4:
                aplicarDescuento(scanner);
                break;

                case 5:

                System.out.println(" saliendo del sistema...............");
                break;
                default:
                System.out.println(" opcion invalida");
                    break;
            }
        } while (opcion !=5);
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println(" sistema de gestion de tienda");
        System.out.println(" 1. registrar un producto");
        System.out.println("2. mostrar el inventario ");
        System.out.println(" 3. calcular el valor del inventario ");
        System.out.println("4. aplicar descuento a un producto ");
        System.out.println(" 5. salir");
        System.out.println(" seleccione una opcion ");

    }

    // metodo para registrar un producto
    public static void registrarProducto(Scanner scanner) {
        System.out.println(" registrar un producto ");
        System.out.println(" ingresa el nombre del producto");
        String nombre = scanner.nextLine();

        System.out.println(" ingresa el precio del producto");
        double precio = scanner.nextDouble();

        System.out.println(" ingresa la cantidad  en inventario");
        double cantidad = scanner.nextDouble();

        scanner.nextLine();

        // guardar segun el numero del producto

        if (totalProductos == 0) {
            producto1 = nombre;
            precio1 = precio;
            cantidad1 = cantidad;
            totalProductos++;
        } else if (totalProductos == 1) {
            producto2 = nombre;
            precio2 = precio;
            cantidad2 = cantidad;
            totalProductos++;

        }

        else if (totalProductos == 2) {
            producto3 = nombre;
            precio3 = precio;
            cantidad3 = cantidad;
            totalProductos++;
        }

        double valorTotal = calcularValorProducto(precio, cantidad);
        mostrarResumenProducto(nombre, precio, cantidad, valorTotal);

    }

    public static void mostrarResumenProducto(String nombre, double precio, double cantidad, double valorTotal) {
        System.out.println(" producto registrado exitosamente ");
        System.out.println(" nombre " + nombre);
        System.out.println(" precio unitario " + precio);
        System.out.println(" cantidad " + cantidad);
        System.out.println(" valor total " + valorTotal);
    }

    public static double calcularValorProducto(double precio, double cantidad) {
        return precio * cantidad;
    }

    // mostrar producto
    public static void mostrarProducto() {
        System.out.println(" inventario de los productos");
        for (int i = 1; i <= totalProductos; i++) {
            String nombre = obtenerNombreProducto(i);
            double precio = obtenerPrecioProducto(i);
            double cantidad = obtenerCantidadProducto(i);
            double valorTotal = calcularValorProducto(precio, cantidad);


        }

    }

    public static String obtenerNombreProducto(int posicion) {
        if (posicion == 1) {
            return producto1;
        } else if (posicion == 2) {
            return producto2;
        }

        else {
            return producto3;
        }

    }

    public static double obtenerPrecioProducto(int posicion) {
        if (posicion == 1) {
            return precio1;
        } else if (posicion == 2) {
            return precio2;
        } else if (posicion == 3) {
            return precio3;
        }

        return 0;
    }

    // obtener la cantidad del producto
    public static double obtenerCantidadProducto(int posicion) {
        if (posicion == 1) {
            return cantidad1;
        } else if (posicion == 2) {
            return cantidad2;
        }

        else if (posicion == 3) {
            return cantidad3;
        }

        return 0;
    }

    // imprimir detalle del producto
    public static void imprimerDetalleDelProducto(int numero, String nombre, double precio, double cantidad,
            double valorTotal) {
        System.out.println(" producto " + numero + "-----");
        System.out.println(" nombre " + nombre);
        System.out.println(" precio " + precio);
        System.out.println(" cantidad " + cantidad);
        System.out.println(" valor total " + valorTotal);

    }

    public static void calcularInventarioTotal() {
        System.out.println(" valor total del inventario ");
        double sumaTotal = 0;
        double sumaCantidades = 0;

        for (int i = 1; i <= totalProductos; i++) {
            double precio = obtenerPrecioProducto(i);
            double cantidad = obtenerCantidadProducto(i);
            double valorProducto = calcularValorProducto(precio, cantidad);
            sumaTotal = sumaValores(sumaCantidades, cantidad);
        }
        mostrarValorTotal(sumaTotal);

        calcularPromedioValor(sumaTotal, sumaCantidades);
    }

    public static double sumaValores(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public static void mostrarValorTotal(double total) {
        System.out.println(" el valor total del inventario " + total);
    }

    private static void calcularPromedioValor(double total, double cantidadProductos) {
        if (cantidadProductos > 0) {
            System.out.println(" hola " + total + " cantidad" + cantidadProductos);
            double promedio = dividirValores(total, cantidadProductos);

            System.out.println(" el valor promedio por producto es: " + promedio);
        }
    }

    public static double dividirValores(double dividendo, double divisor) {
        return dividendo / divisor;
    }

    // aplicar descuento

    public static void aplicarDescuento(Scanner scanner) {
        System.out.println(" aplicar descuento ");
        System.out.println(" ingresa el numero del producto (1- " + totalProductos + "): ");
        int numeroProducto = scanner.nextInt();

        System.out.println(" ingrese el porcentaje de descuento ");
        double porcentajeDescuento = scanner.nextDouble();

        scanner.nextLine();

        double precioOriginal = obtenerPrecioProducto(numeroProducto);
        double descuento = calcularDescuento(precioOriginal, porcentajeDescuento);

        double precioFinal = restarValores(precioOriginal, descuento);

        actualizarPrecioProducto(numeroProducto, precioFinal);

        mostrarResultadoDescuento(precioOriginal, descuento, precioFinal);
    }

    public static double calcularDescuento(double precio, double porcentaje) {
        return multiplicarValores(precio, porcentaje) / 100;
    }

    public static double multiplicarValores(double precio, double porcentaje) {
        return precio * porcentaje;
    }

    // metodo para restar valores

    public static double restarValores(double valor1, double valor2) {
        return valor1 - valor2;
    }

    // metodo para actualizar el pecio de un producto

    public static void actualizarPrecioProducto(int posicion, double nuevoPrecio) {
        if (posicion == 1) {
            precio1 = nuevoPrecio;
        } else if (posicion == 2) {
            precio2 = nuevoPrecio;
        }

        else if (posicion == 3) {
            precio3 = nuevoPrecio;
        }
    }

    // mostrar Resultado Descuento 
    public static void mostrarResultadoDescuento(double precioOriginal, double descuento, double precioFinal){
        System.out.println(" descuenton aplicado con exito ");
        System.out.println(" precio original "+ precioOriginal);
        System.out.println(" descuento "+ descuento);
        System.out.println(" precio final "+ precioFinal);
    }
}
