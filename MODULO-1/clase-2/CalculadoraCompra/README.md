# Calculadora de Compra

![Caratula Tutorias Dev Senior](../caratulas%20tutorias%20dev%20senior.png)

## Descripcion

Este programa es una **calculadora de compra interactiva** desarrollada en Java que simula un sistema de procesamiento de pagos con funcionalidades avanzadas. El sistema permite calcular el precio final de una compra considerando multiples factores comerciales.

### Funcionalidades principales:

- **Entrada de datos del cliente**: Captura nombre, edad, estado VIP y detalles de la compra
- **Calculo de subtotal**: Multiplica el precio del producto por la cantidad
- **Sistema de descuentos**: Aplica 10% de descuento a clientes VIP mayores de 18 anos
- **Calculo de IVA**: Aplica el 19% de impuesto sobre el total
- **Sistema de puntos**: Acumula puntos de fidelidad basados en la compra
- **Envio gratuito**: Se otorga si la compra supera $50,000 o si el cliente es VIP
- **Simulacion de cuotas**: Divide el pago en 3 cuotas y calcula el residuo
- **Conversiones de tipo**: Demuestra casteo implicito (int a double) y explicito (double a int)

### Conceptos de Java utilizados:

- Constantes (`final`)
- Tipos de datos primitivos (int, double, boolean, char)
- Operadores aritmeticos (+, -, *, /, %)
- Operadores de asignacion compuesta (+=, -=, *=, /=, %=)
- Operadores logicos (&&, ||, !)
- Operadores de incremento/decremento (++, --)
- Entrada de datos con `Scanner`
- Casteo de tipos implicito y explicito

### Ejemplo de ejecucion:

El programa solicita los siguientes datos:
- Nombre del cliente
- Edad
- Estado VIP (true/false)
- Precio del producto
- Cantidad de productos

Luego procesa la compra calculando descuentos, impuestos y beneficios adicionales, mostrando un resumen completo al final.

---

**Moneda**: COP (Pesos Colombianos)
**Lenguaje**: Java
**Nivel**: Principiante - Intermedio
