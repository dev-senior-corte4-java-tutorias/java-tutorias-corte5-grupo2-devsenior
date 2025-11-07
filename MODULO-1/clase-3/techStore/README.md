<div align="center">
  <img src="https://raw.githubusercontent.com/devsenior/assets/main/banner-tutorias.png" alt="Tutorias DevSenior" width="100%"/>
</div>

---

# TechStore - Sistema de Gestión de Ventas

## Contexto del Proyecto

### Situación Empresarial

**TechStore** es una cadena de tiendas de tecnología en expansión que opera en múltiples ciudades del país. La empresa se especializa en la venta de productos tecnológicos como laptops, tablets, smartphones y accesorios. Con más de 50 vendedores distribuidos en diferentes sucursales, la gerencia ha identificado problemas críticos en la gestión de ventas y el cálculo de comisiones.

### Problemática Actual

El Gerente General de TechStore, Carlos Mendoza, convocó una reunión urgente con el equipo de tecnología tras identificar las siguientes problemáticas:

1. **Gestión Manual Ineficiente**: Los vendedores registran ventas en hojas de papel, lo que genera errores de cálculo y pérdida de información.

2. **Cálculo Erróneo de Comisiones**: Las comisiones se calculan manualmente al final del mes, resultando en múltiples errores y conflictos con el personal de ventas.

3. **Falta de Seguimiento en Tiempo Real**: Los supervisores no pueden monitorear el progreso de las metas de ventas de forma inmediata.

4. **Proceso de Devoluciones Complejo**: No existe un sistema estandarizado para procesar devoluciones y ajustar las comisiones correspondientes.

5. **Motivación del Personal**: Sin estadísticas claras y actualizadas, los vendedores no tienen visibilidad de su rendimiento ni de cuánto están por ganar.

### Solicitud del Cliente

En la reunión del 15 de enero de 2025, Carlos Mendoza presentó la siguiente solicitud al equipo de desarrollo:

> *"Necesitamos urgentemente un sistema de gestión de ventas que permita a nuestros vendedores registrar sus operaciones diarias de forma rápida y confiable. El sistema debe calcular automáticamente las comisiones según nuestras políticas comerciales, mostrar el progreso hacia las metas mensuales, y gestionar devoluciones de manera profesional.*
>
> *Es fundamental que el sistema sea intuitivo, ya que muchos de nuestros vendedores no son expertos en tecnología. Debe funcionar en cualquier terminal de la tienda y proporcionar información clara sobre ganancias, rendimiento y estadísticas.*
>
> *Requerimos que esté operativo lo antes posible, ya que estamos en temporada alta de ventas y necesitamos mejorar nuestra eficiencia operativa de inmediato."*

### Requerimientos Específicos

**Funcionalidades Principales:**

1. **Registro de Ventas**
   - Catálogo de productos con precios predefinidos
   - Soporte para múltiples productos en una sola transacción
   - Sistema de descuentos por tarjeta de fidelidad (5%, 10%, 15%)
   - Múltiples métodos de pago (efectivo, tarjeta, transferencia)
   - Cálculo automático de comisiones (3%, 5%, 8% según monto)

2. **Gestión de Personal**
   - Diferenciación entre vendedores y supervisores
   - Salarios base diferentes según rol
   - Bonificaciones adicionales para supervisores (20% más en comisiones)

3. **Seguimiento de Metas**
   - Meta mensual configurable ($5,000 inicial)
   - Visualización de progreso en tiempo real
   - Bonificaciones por cumplimiento de metas ($150, $300, $500)
   - Proyecciones de ventas necesarias

4. **Sistema de Devoluciones**
   - Registro de motivos de devolución
   - Ajuste automático de comisiones y totales
   - Autorización de supervisor para casos especiales

5. **Reportes y Estadísticas**
   - Resumen de ventas y comisiones
   - Clasificación de rendimiento del vendedor
   - Cálculo de salario mensual (base + comisiones + bonificaciones - deducciones)
   - Estadísticas de clientes atendidos y descuentos otorgados

### Políticas Comerciales de TechStore

**Estructura Salarial:**
- Vendedor: $1,200 base mensual
- Supervisor: $1,800 base mensual
- Deducciones: 12% (impuestos y seguridad social)

**Sistema de Comisiones:**
- Ventas hasta $499: 3%
- Ventas de $500 a $999: 5%
- Ventas de $1,000 o más: 8%
- Supervisores reciben 20% adicional sobre su comisión

**Bonificaciones por Meta:**
- 100% de la meta: $150
- 150% de la meta: $300
- 200% de la meta: $500

**Descuentos con Tarjeta de Fidelidad:**
- Compras de $200 a $499: 5%
- Compras de $500 a $999: 10%
- Compras de $1,000 o más: 15%

## Solución Implementada

Este proyecto es la solución desarrollada para TechStore, un **sistema de gestión de ventas en consola** implementado en Java que cumple con todos los requerimientos especificados por el cliente.

### Características Técnicas

El sistema fue desarrollado utilizando conceptos fundamentales de programación en Java:

- **Variables y Tipos de Datos**: Gestión de información del vendedor, ventas y comisiones
- **Operadores**: Aritméticos, relacionales, lógicos y ternarios
- **Estructuras de Control**:
  - `if-else` y `if-else anidado` para lógica de negocio
  - `switch-case` para menús y categorización
  - `for` para procesamiento de múltiples productos
  - `while` para validación de entradas
  - `do-while` para el menú principal
- **Scanner**: Interacción con el usuario a través de consola
- **String.format()**: Formato profesional de números y estadísticas

### Estructura del Proyecto

```
techStore/
│
├── src/
│   └── App.java          # Clase principal con toda la lógica del sistema
│
├── lib/                   # Dependencias (vacío por ahora)
│
├── bin/                   # Archivos compilados (.class)
│
└── README.md             # Este archivo
```

**TechStore** - *Transformando la gestión de ventas con tecnología*
