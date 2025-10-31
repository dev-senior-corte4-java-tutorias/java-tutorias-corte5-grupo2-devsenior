import java.util.Scanner;

public class CalculadoraDeCompra {
// constantes 
public static  final double IVA = 0.19;
public static final double DESCUENTO_VIP = 0.10;
public static final String MONEDA = "COP";
    public static void main(String[] args)  {
     // INGRESO DE DATOS DEL USUARIO   
    Scanner entrada = new Scanner(System.in); 
        System.out.println("================ CALCULADORA DE COMPRA =========== ");
        System.out.println(" ingrese su nombre ");
        String nombreCliente = entrada.nextLine(); 
        System.out.println( " ingrese su edad");
        int edad = entrada.nextInt();
        System.out.println("es cliente VIP (true/false)");
        boolean esVIP = entrada.nextBoolean();
        System.out.println( " ingrese el precio del producto");
        double precioProducto = entrada.nextDouble();
        System.out.println(" ingrese la cantidad de los productos");
        int cantidad = entrada.nextInt();

        System.out.println("============== proceso de compra =================");
        // operadores aritmeticos
        double subtotal = precioProducto * cantidad;
        System.out.println( " subtotal: "+ subtotal+ " "+ MONEDA);

        // operadores de asignacion compuesta
        double total =0;
        total += subtotal;
        
        // operadores logicos 
        boolean aplicaDescuento = esVIP && (edad>= 18);
        System.out.println(" aplica para el descuento"+ aplicaDescuento);
        // calculamos el descuento
        double descuento = total *DESCUENTO_VIP; 
        total -= descuento;
        System.out.println(" descuento calculado (10%)"+ descuento);

        // calcular IVA 
        double impuesto = total * IVA;
        total += impuesto;
        System.out.println( " iva (19%)"+impuesto);

        //======== CASTEO IMPLICITO ========== 
        double cantidadDouble = cantidad; // int -> double ( DE UNO PEQUEÑO A UNO MAS GRANDE)
        System.out.println( " casteo implicito");
        System.out.println( " cantidad (int)"+cantidad);
        System.out.println("cantidad (double )"+cantidadDouble);

        //============ CASTEO EXPLICITO 
        // DOUBLE A INT
        int totalSinDecimales = (int) total;
        System.out.println(" casteo explicito");
        System.out.println( " total con decimales "+total);
        System.out.println( "total sin decimales "+totalSinDecimales);
    

        // OPERADORES DE ACUMULACION
        int puntosGanados = 0;
        puntosGanados ++;
        puntosGanados += totalSinDecimales /1000;
        puntosGanados --;
        puntosGanados ++; 

        // operador logico (OR)
        boolean envioGratis = (total >= 50000) || esVIP;
        System.out.println(" calculos adicionales ");
        System.out.println( " envio gratis"+ envioGratis);
    
    // operadores de modulo y operadores aritmeticos
    int cuotas = 3;
    total *= 1;
    double valorCuota = total /cuotas; // DIVIDO EN 3
    double residuo = total % cuotas;

    // operadores de asignacion 
    int contador =100;
    contador/=2; // 50
    contador %=30; // 20
    contador *= 3; // 60

    System.out.println("valor del contador "+contador);

    // operador logico not
    boolean noEsVIP = !esVIP;
    System.out.println( " no es vip"+ noEsVIP);
    char calificacion = 'A';
    double promedio = (precioProducto +total)/2;

        System.out.println( "resumen final");
        System.out.println( " cliente"+nombreCliente);
        System.out.println( "edad "+edad+" años");
        System.out.println( " ES VIP"+esVIP);
        System.out.println(" total a pagar "+ total +" "+ MONEDA);
        System.out.println( "Puntos ganados"+puntosGanados);
        System.out.println( " calificacion "+calificacion);
        System.out.println( "\nOpción "+cuotas +" cuotas de $"+valorCuota);
        System.out.println( " residuo "+residuo);
        System.out.println( " promedio $ "+ promedio);
        System.out.println( " gracias por su compra "+ nombreCliente);
    entrada.close();
    }
}
