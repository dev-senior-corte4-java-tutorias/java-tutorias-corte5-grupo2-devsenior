# Encapsulamiento en Java

![Caratula Dev Senior](caratula%20dev%20senior.jpeg)

## Descripcion del Proyecto

Este proyecto es una demostracion practica del concepto de **encapsulamiento** en Java, uno de los cuatro pilares fundamentales de la Programacion Orientada a Objetos (POO).

## Objetivo

Aprender a proteger los datos de una clase mediante el uso de modificadores de acceso y controlar el acceso a los atributos a traves de metodos **getters** y **setters**.

## Conceptos Cubiertos

### 1. Modificadores de Acceso
- `private`: Acceso solo dentro de la misma clase
- `public`: Acceso desde cualquier clase
- `protected`: Acceso desde la misma clase, paquete y subclases
- `default`: Acceso solo dentro del mismo paquete

### 2. Getters y Setters
- **Getter**: Metodo para obtener el valor de un atributo privado
- **Setter**: Metodo para modificar el valor de un atributo privado con validaciones

### 3. Validaciones en Setters
El proyecto demuestra como implementar validaciones de datos:
- Validacion de nombres no vacios usando `trim()` e `isEmpty()`
- Validacion de rangos de edad (15-110 anios)
- Validacion de promedio academico (0.0 - 5.0)
- Validacion de estados permitidos usando `switch`
- Uso del operador ternario para validaciones simples

### 4. Constructores
- Constructor por defecto (sin parametros)
- Constructor con parametros parciales
- Constructor completo

## Estructura del Proyecto

```
encapsulamiento/
├── src/
│   ├── Estudiante.java    # Clase que implementa encapsulamiento
│   └── App.java           # Clase principal con demostraciones
├── caratula dev senior.jpeg
└── README.md
```

## Clase Estudiante

La clase `Estudiante` contiene los siguientes atributos encapsulados:

| Atributo | Tipo | Descripcion |
|----------|------|-------------|
| `name` | String | Nombre del estudiante |
| `edad` | int | Edad del estudiante |
| `average` | double | Promedio academico |
| `estado` | String | Estado: Activo, Inactivo, Graduado |
| `creditosAprobados` | int | Creditos academicos aprobados |

### Metodos Adicionales

- `obtenerCalificacion()`: Retorna la calificacion cualitativa segun el promedio
- `estaAprobado()`: Verifica si el estudiante esta aprobado
- `obtenerEstadoAcademico()`: Retorna "Aprobado" o "Reprobado"
- `puedeGraduarse()`: Verifica si cumple requisitos de graduacion
- `mostrarInformacion()`: Muestra toda la informacion del estudiante

## Como Ejecutar

1. Navegar a la carpeta `src/`
2. Compilar los archivos Java:
   ```bash
   javac *.java
   ```
3. Ejecutar la aplicacion:
   ```bash
   java App
   ```

## Tecnologias

- Java SE
- Programacion Orientada a Objetos

---

**DevSenior - Tutorias Java | Modulo 2 - Clase 1**
