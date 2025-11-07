import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variables del vendedor
        String nombreVendedor = "";
        double salarioBase = 1400.000;
        double comisionTotal = 0.0;
        int ventasRealizadas = 0;
        double metaMensual = 2000000;
        double totalVendido = 0.0;
        boolean esSupervisor = false;
        int clientesAtendidos = 0;
        double descuentoOtorgado = 0.0;

        // bienvenida
        System.out.println("===================================");
        System.out.println(" bienvenido a tech store");
        System.out.println("===================================");
        System.out.println("  bienvenido al sistema de gestion de ventas");
        System.out.println(" ingrese su nombre");
        nombreVendedor = scanner.nextLine();

        System.out.println(" es usted supervisor (1 = Si, 2= No");
        int rolDecision = scanner.nextInt();

        esSupervisor = (rolDecision == 1) ? true : false;

        String cargo = esSupervisor ? "supervidor de ventas" : "vendedor";

        // mostrar informacion del vendedor

        System.out.println(" hola " + nombreVendedor + " bienvenido ");
        System.out.println(" cargo " + cargo);
        System.out.println(" salario base " + salarioBase);
        System.out.println(" meta mensual de ventas " + metaMensual);

        // menu principal con do while

        int opcionMenu;
        boolean sistemaActivo = true;

        do {
            System.out.println(" resumen actual ");
            System.out.println("================");
            System.out.println(" nombre del vendedor " + nombreVendedor + " (cargo)" + cargo);
            System.out.println(" total vendido " + totalVendido);
            System.out.println(" meta mensual " + metaMensual);
            System.out.println(" progreso " + (totalVendido / metaMensual));
            System.out.println(" ventas realizadas " + ventasRealizadas);
            System.out.println(" clientes atendidos " + clientesAtendidos);
            System.out.println(" comision acumulado $  " + comisionTotal);

            // menu principal de opciones

            System.out.println(" menu principal ");
            System.out.println("1. registrar una nueva venta ");
            System.out.println(" 2. ver estadisticas detalladas");
            System.out.println(" 3. calcular el salario mensual");
            System.out.println(" 4. evaluar el cumplimento de metas");
            System.out.println("5. procesar devolución");
            System.out.println(" 6. cerrar seccion ");
            System.out.println(" selecione una opcion ");

            opcionMenu = scanner.nextInt();

            while (opcionMenu < 1 || opcionMenu > 6) {
                System.out.println(" opcion invalida por favor ingrese una opcion que este en el menu ");
                opcionMenu = scanner.nextInt();
            }

            switch (opcionMenu) {
                case 1:
                    System.out.println(" registrar nueva venta ");
                    System.out.println(" ======================");
                    clientesAtendidos++;

                    System.out.println(" catalogo de productos");
                    System.out.println(" 1.  computador  de mesa - $ 2000_000 ");
                    System.out.println("2. tablet -> 1000_000");
                    System.out.println("3. monitor -> 400_000");
                    System.out.println("4. mouse inalambrico -> 300_000");
                    System.out.println(" cuantos productos diferentes comprara el cliente ");
                    int cantidadProductos = scanner.nextInt();

                    while (cantidadProductos < 1 || cantidadProductos > 4) {
                        System.out.println(" ingresa un numero valido del id del producto");
                        cantidadProductos = scanner.nextInt();
                    }

                    double totalVenta = 0.0;

                    for (int i = 1; i <= cantidadProductos; i++) {
                        System.out.println(" producto " + i + "----");
                        System.out.println("seleccione un producto (1-4)");
                        int productoSeleccionado = scanner.nextInt();

                        System.out.println("cantidad a comprar ");
                        int cantidad = scanner.nextInt();
                        double precioUnitario = 0.0;
                        String nombreProducto = "";

                        switch (productoSeleccionado) {
                            case 1:
                                precioUnitario = 2000_000;
                                nombreProducto = "computador de mesa";

                                break;
                            case 2:
                                precioUnitario = 1000_000;
                                nombreProducto = "tablet";

                                break;

                            case 3:
                                precioUnitario = 400_000;
                                nombreProducto = "monitor";
                                break;

                            case 4:
                                precioUnitario = 300_000;
                                nombreProducto = "mouse inalambrico";
                                break;

                            default:
                                precioUnitario = 0.0;
                                nombreProducto = "";
                                break;
                        }

                        double subtotal = precioUnitario * cantidad;
                        totalVenta = totalVenta + subtotal;

                        System.out.println(
                                " cantidad " + cantidad + " nombre producto " + nombreProducto + " $ " + subtotal);

                    }

                    System.out.println(" subtotal " + totalVenta);

                    // aplicar descuento a supervisor
                    System.out.println(" el cliente tiene tarjeta de fidelidad (1 = si, 2= no) ");
                    int tieneTarjeta = scanner.nextInt();

                    double descuento = 0.0;

                    if (tieneTarjeta == 1) {
                        if (totalVenta >= 100_000) {
                            descuento = totalVenta * 0.15; // 15%
                        } else if (totalVenta >= 50_000) {
                            descuento = totalVenta * 0.10; // 10%
                        } else if (totalVenta >= 35_000) {
                            descuento = totalVenta * 0.05; // 5%
                        } else {
                            System.out.println(" compra minima para decuento tiene que ser -> 35_000");
                        }
                        descuentoOtorgado = descuentoOtorgado + descuento;
                    }
                    totalVenta = totalVenta - descuento;

                    System.out.println(" total a pagar " + totalVenta);

                    System.out.println(" metodo de pago ");
                    System.out.println(" ==================");
                    System.out.println(" 1. efectivo ");
                    System.out.println("2. tarjeta de credito ");
                    System.out.println(" 3. transferencia bancaria");
                    System.out.print(" seleccione ");
                    int metodoPago = scanner.nextInt();

                    String metodoTexto = "";
                    switch (metodoPago) {
                        case 1:
                            metodoTexto = " efectivo";
                            System.out.println(" monto recibir ");
                            double montoRecibido = scanner.nextDouble();
                            double cambio = montoRecibido - totalVenta;

                            // operador ternario para validar el monto
                            String mensaje = (cambio >= 0) ? "cambio" + cambio : "monto insuficiente ";
                            System.out.println(mensaje);

                            if (cambio < 0) {
                                System.out.println(" venta cancelada");
                                break;
                            }
                            break;

                        case 2:
                            metodoTexto = " tarjeta de credito";
                            System.out.println("pago procesado correctamente ");
                            break;

                        case 3:
                            metodoTexto = " transferencia bancaria";
                            System.out.println(" tranferencia confirmada ");
                            break;

                        default:
                            metodoTexto = " metodo no valido ";
                            System.out.println(" metodo de pago no valido venta cancelada");

                            break;
                    }

                    // calcular comision del vendedor
                    if (metodoPago >= 1 && metodoPago <= 3) {
                        // calcular comision
                        double comision = 0.0;
                        if (totalVenta >= 100_000) {
                            comision = totalVenta * 0.08; // 8%
                        } else if (totalVenta >= 50_000) {
                            comision = totalVenta * 0.05; // 5%
                        } else {
                            comision = totalVenta * 0.03; // 3%
                        }

                        // bonus por ser supervisor
                        comision = esSupervisor ? comision * 1.2 : comision;

                        comisionTotal = comisionTotal + comision;
                        totalVendido = totalVendido + totalVenta;
                        ventasRealizadas++;
                        System.out.println(" venta registrada exitosamente ");
                        System.out.println("ticket " + ventasRealizadas);
                        System.out.println(" monto " + totalVenta);
                        System.out.println(" metodo " + metodoTexto);
                        System.out.println(" comision" + comision);
                    }
                    break;

                case 2:
                    // estadisticas detalladas
                    System.out.println(" ===========================");
                    System.out.println(" estadistica detallada ");
                    System.out.println(" ===========================");

                    System.out.println("nombre del vendedor " + nombreVendedor);
                    System.out.println(" cargo " + cargo);
                    System.out.println("salario base " + salarioBase);
                    System.out.println("--- rendimiento ---");
                    System.out.println(" ventas realizadas " + ventasRealizadas);
                    System.out.println(" clientes atendidos" + clientesAtendidos);
                    System.out.println(" total vendido " + totalVendido);
                    System.out.println(" meta mensual " + metaMensual);

                    double porcentajeMeta = (totalVendido / metaMensual) * 100;

                    System.out.println(" cumplimiento " + porcentajeMeta + "%");

                    System.out.println("comsiones ");
                    System.out.println("comision acumulada " + comisionTotal);

                    // promedio de venta
                    double promedioVenta = (ventasRealizadas > 0) ? totalVendido / ventasRealizadas : 0;
                    System.out.println(" promedio de venta " + promedioVenta);
                    System.out.println(" descuentos otorgados " + descuentoOtorgado);

                    // calificacion al vendedor
                    if (totalVendido >= metaMensual * 1.5) {
                        System.out.println(" superaste la meta en 150% ");

                    } else if (totalVendido >= metaMensual) {
                        System.out.println("cumpliste la meta ");
                    } else if (totalVendido >= metaMensual * 0.7) {
                        System.out.println("buena trabajo estas cerca a la meta ");

                    } else {
                        System.out.println(" no cumpliste la meta ");

                    }
                    break;

                case 3:
                    // calculamos el salario mensual
                    System.out.println(" =============================");
                    System.out.println("salario mensual ");
                    System.out.println(" =============================");
                    System.out.println("salario base " + salarioBase);
                    System.out.println(" comisiones totales " + comisionTotal);

                    // calculamos bonificacion
                    double bonificacion = 0.0;
                    if (totalVendido >= metaMensual) {
                        if (totalVendido >= metaMensual * 2) {
                            bonificacion = 100_000;
                            System.out.println(" bonificacion por exelencia");
                        } else if (totalVendido >= metaMensual * 1.5) {
                            bonificacion = 75_000;
                            System.out.println(" bonificacion de destacado ");
                        } else {
                            bonificacion = 50_000;
                            System.out.println(" bonificacion por cumplir la meta ");
                        }

                    } else {
                        System.out.println(" sin bonificacion ");
                    }
                    double salarioTotal = salarioBase + comisionTotal + bonificacion;
                    double deduciones = salarioTotal * 0.12;
                    double salarioNeto = salarioTotal - deduciones;

                    System.out.println(" bonificacion " + bonificacion);
                    System.out.println(" salario bruto " + salarioTotal);
                    System.out.println(" salario neto " + salarioNeto);

                    break;

                case 4:
                    // EVALUAR CUMPLIMIENTO
                    System.out.println("===========================");
                    System.out.println(" cumplimiento ");
                    System.out.println("===========================");

                    double faltante = metaMensual - totalVendido;
                    double porcentaje = (totalVendido / metaMensual) * 100;

                    System.out.println(" analisis de meta ");
                    System.out.println("Meta mensual " + metaMensual);
                    System.out.println(" total vendido " + totalVendido);

                    if (totalVendido >= metaMensual) {
                        double excendete = totalVendido - metaMensual;
                        System.out.println(" meta cumplida ");
                        System.out.println(" excendete " + excendete);
                        System.out.println(" porcentaje " + porcentaje);

                    } else {
                        System.out.println(" meta pendiente ");
                        System.out.println(" faltante " + faltante);
                        System.out.println(" porcentaje actual " + porcentaje);

                        // calcular ventas necesarias con operador ternario
                        double promedioActual = (ventasRealizadas > 0) ? totalVendido / ventasRealizadas : 0;
                        int ventasNecesarias = (promedioActual > 0) ? (int) (faltante / promedioActual) + 1 : 0;

                        System.out.println(" proyeccion ");
                        System.out.println(" promedio por venta " + promedioActual);
                        System.out.println(" ventas adicionales " + ventasNecesarias);

                    }
                    // mensaje motivacional
                    int nivelMotivacion = (int) (porcentaje / 25);
                    switch (nivelMotivacion) {
                        case 0:
                            System.out.println(" ¡VAMOS!! tiene tiempo para mejorar ");
                            break;
                        case 1:
                            System.out.println(" buen ritmo sigue asi y alcanzaras tus metas ");
                            break;

                        case 2:
                            System.out.println("excelente progreso  estas muy cerca");
                            break;
                        case 3:
                            System.out.println(" INCREIBLEEEEEEEEEEEE ya cumpliste la meta ");
                            break;

                        default:
                            System.out.println(" SUPER BIEN tienes un rendimiento excepcional ");
                            break;
                    }

                    break;

                case 5:
                    System.out.println(" proceso de devolucion ");

                    if (ventasRealizadas == 0) {
                        System.out.println(" no se puede hacer la devolucion por que no hay ventas");
                    } else {

                        System.out.println("ingrese el monto que te tenemos que devolver ");
                        double montoDevolucion = scanner.nextDouble();

                        // while

                        while (montoDevolucion <= 0 || montoDevolucion > totalVendido) {
                            System.out.println(" monto invalido ");
                            montoDevolucion = scanner.nextDouble();

                        }

                        System.out.println(" motivo de devolucion ");
                        System.out.println("1. producto defectuoso ");
                        System.out.println(" 2. no cumple las expectativa");
                        System.out.println("3. compra duplicada ");
                        System.out.println(" 4. cambio de opinion ");
                        System.out.println(" seleccione el motivo ");
                        int motivoDevolucion = scanner.nextInt();

                        String textoMotivo = "";
                        boolean devolucionAprobada = false;

                        switch (motivoDevolucion) {
                            case 1:
                                textoMotivo = "producto defectuoso ";
                                devolucionAprobada = true;
                                System.out.println(" devolucion aprobada ");
                                break;

                            case 2:
                                textoMotivo = " no cumple las expectativa";
                                devolucionAprobada = true;
                                System.out.println(" devolucion aprobada ");
                                break;

                            case 3:
                                textoMotivo = "compra duplicada";
                                devolucionAprobada = true;
                                System.out.println(" devolucion aprobada ");
                                break;

                            case 4:
                                textoMotivo = "cambio de opinion ";
                                if (esSupervisor) {
                                    devolucionAprobada = true;
                                    System.out.println(" devolucion aprobada ");
                                } else {
                                    System.out.println(" se quiere autorizacion de supervisor ");
                                    System.out.println(" supervisor aprueba (1. si, 2. no )");
                                    int autorizacion = scanner.nextInt();

                                    devolucionAprobada = (autorizacion == 1) ? true : false;
                                }
                                break;
                            default:
                                textoMotivo = "motivo no especificado ";
                                devolucionAprobada = false;

                        }
                    }

                    case 6: 
                    /* TAREA */
                    break;
                default:
                    break;
            }

        } while (sistemaActivo);
    }
}
