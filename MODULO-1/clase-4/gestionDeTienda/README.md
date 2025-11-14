![Dev Senior Banner](https://i.imgur.com/YourDevSeniorLogo.png)

# Sistema de Gestión de Tienda de Tecnología

## Descripción del Ejercicio

Una tienda de tecnología local necesita modernizar su sistema de inventario. El dueño te ha contratado como desarrollador para crear una solución que le permita gestionar sus productos de forma eficiente desde la terminal.

### La Situación

TechStore es una pequeña tienda que vende productos tecnológicos como laptops, smartphones y accesorios. Actualmente, el dueño lleva el control de su inventario en cuadernos, lo que ha generado varios problemas:

- Errores en el cálculo de valores totales del inventario
- Dificultad para aplicar descuentos rápidamente
- Tiempo perdido al buscar información de productos
- Imposibilidad de conocer el valor real de su negocio

### El Reto

Debes desarrollar un **Sistema de Gestión de Tienda en Java** que permita:

1. **Registrar productos** con su nombre, precio y cantidad en inventario
2. **Mostrar el inventario completo** con todos los productos registrados
3. **Calcular el valor total del inventario** sumando todos los productos
4. **Aplicar descuentos** a productos específicos de forma automática
5. **Interfaz de menú interactiva** para que el dueño pueda navegar fácilmente

### Requisitos Técnicos

Tu solución debe cumplir con los siguientes requisitos:

#### 1. Estructura de Datos
- Usar variables estáticas para almacenar hasta 3 productos
- Cada producto debe tener: nombre (String), precio (double) y cantidad (double)
- Mantener un contador de productos registrados

#### 2. Funcionalidades Principales

**Menú Principal:**
```
Sistema de Gestión de Tienda
1. Registrar un producto
2. Mostrar el inventario
3. Calcular el valor del inventario
4. Aplicar descuento a un producto
5. Salir
```

**Registrar Producto:**
- Solicitar nombre, precio y cantidad
- Almacenar en la siguiente posición disponible (máximo 3 productos)
- Mostrar resumen del producto registrado con su valor total

**Mostrar Inventario:**
- Listar todos los productos registrados
- Mostrar para cada uno: nombre, precio, cantidad y valor total

**Calcular Valor del Inventario:**
- Sumar el valor total de todos los productos
- Mostrar el valor total del inventario
- Calcular y mostrar el valor promedio por producto

**Aplicar Descuento:**
- Seleccionar el número de producto (1, 2 o 3)
- Ingresar el porcentaje de descuento
- Calcular y actualizar el nuevo precio
- Mostrar: precio original, descuento aplicado y precio final

#### 3. Métodos Requeridos

Tu código debe incluir métodos modulares para cada operación:

- `mostrarMenu()` - Muestra las opciones del menú
- `registrarProducto(Scanner)` - Registra un nuevo producto
- `mostrarProducto()` - Muestra el inventario completo
- `calcularInventarioTotal()` - Calcula el valor total del inventario
- `aplicarDescuento(Scanner)` - Aplica descuento a un producto
- `calcularValorProducto(double, double)` - Calcula precio × cantidad
- `obtenerNombreProducto(int)` - Retorna el nombre según posición
- `obtenerPrecioProducto(int)` - Retorna el precio según posición
- `obtenerCantidadProducto(int)` - Retorna la cantidad según posición
- `actualizarPrecioProducto(int, double)` - Actualiza el precio de un producto
- Métodos auxiliares para operaciones matemáticas básicas

#### 4. Validaciones y Buenas Prácticas

- Validar que la opción del menú sea válida
- Manejar correctamente el Scanner para evitar errores de entrada
- Usar modificadores de acceso apropiados (public static)
- Código limpio y bien comentado
- Nombres de variables descriptivos

### Ejemplo de Ejecución

```
Sistema de Gestión de Tienda
1. Registrar un producto
2. Mostrar el inventario
3. Calcular el valor del inventario
4. Aplicar descuento a un producto
5. Salir
Seleccione una opción: 1

Registrar un producto
Ingresa el nombre del producto: Laptop HP
Ingresa el precio del producto: 1500
Ingresa la cantidad en inventario: 5

Producto registrado exitosamente
Nombre: Laptop HP
Precio unitario: 1500.0
Cantidad: 5.0
Valor total: 7500.0
```

### Estructura del Proyecto

```
gestionDeTienda/
├── src/
│   └── gestionDeTienda.java
├── bin/
│   └── gestionDeTienda.class
└── README.md
```

### Compilación y Ejecución

```bash
# Compilar
javac -d bin src/gestionDeTienda.java

# Ejecutar
java -cp bin gestionDeTienda
```

### Conceptos de Java Practicados

- Variables estáticas
- Métodos estáticos
- Estructuras de control (if-else, switch, do-while, for)
- Entrada de datos con Scanner
- Operaciones aritméticas básicas
- Modularización de código
- Paso de parámetros a métodos
- Tipos de datos primitivos

### Entregables

1. Código fuente en `src/gestionDeTienda.java`
2. Código compilado en `bin/gestionDeTienda.class`
3. Documentación en README.md (este archivo)
4. Screenshots de ejecución del programa

### Criterios de Evaluación

- **Funcionalidad (40%)**: El programa cumple con todos los requisitos
- **Código limpio (25%)**: Estructura clara, nombres descriptivos, comentarios útiles
- **Modularización (20%)**: Uso apropiado de métodos
- **Manejo de errores (15%)**: Validaciones y control de entradas incorrectas

---

## Autor

**Dev Senior - Tutorías Java**
Corte 5 - Grupo 2
Módulo 1 - Clase 4

---

## Tecnologías Utilizadas

- Java SE
- Scanner para entrada de datos
- Estructuras de control básicas
- Programación procedural con métodos estáticos

---

## Licencia

Este proyecto es parte del material educativo de Dev Senior.

---

**Desarrollado con fines educativos - Dev Senior 2025**
