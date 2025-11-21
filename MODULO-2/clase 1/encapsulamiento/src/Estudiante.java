public class Estudiante {

    // modificador de acceso
    /*
     * - private
     * public
     * protected
     * default
     */

    /*
     * modificador de acceso privado consiste en que todo lo que lo tenga solo se
     * pueda usar en esa clase en este caso en la clase esutidante
     *
     */

    // atributos de un estudiante
    private String name;
    private int edad;
    private double average;
    private String estado; // Activo, Inactivo, Graduado
    private int creditosAprobados;

    // constructor por defecto
    public Estudiante() {
        this.name = "sin nombre";
        this.edad = 0;
        this.average = 0.0;
        this.estado = "Inactivo";
        this.creditosAprobados = 0;
    }

    // constructo con parametros
    public Estudiante(String name, int edad, double average) {
        this.name = name;
        this.edad = edad;
        this.average = average;
        this.estado = "Activo";
        this.creditosAprobados = 0;

    }

    // constructor completo
    public Estudiante(String name, int edad, double average, String estado, int creditosAprobados) {
        this.name = name;
        this.edad = edad;
        this.average = average;
        this.estado = estado;
        this.creditosAprobados = creditosAprobados;
    }

    /*
     * getters y setters
     * 
     * GETTER: consiste en obtener todo el dato que tiene esa variable en especifico
     *
     * SETTER: editar la informacion que contiene ese atributo en especifico
     * 
     * pueden trabajar de manera independiente el uno del otro pero dependen de la
     * logica de negocio cuando son necesarios los dos para un atributo de la clase
     * 
     */

    /*
     * partes de un metodo getter:
     * - public -> modificador de acceso
     * - String -> tipo de dato del atributo que queremos traer
     * - getName() -> se coloca la palabra get al principio del nombre del metodo
     * para hacer referencia a la operacion
     * - no recibimos nada () por que solo estamos trayendo datos
     * - dentro del cuerpo de las llaves tenemos
     * un return con la variable
     *
     */

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public double getAverage() {
        return average;
    }

    public String getEstado() {
        return estado;
    }

    public int getCreditosAprobados() {
        return creditosAprobados;
    }

    /**
     * el metodo setter es el que nos permite obtener los datos
     * public -> modificador de acceso
     * void -> tipo de retorno
     * setName() el nombre
     * (String name) -> dato que recibimos para el setter
     * 
     */

    /**
     * .trim() elimina los espacios al principio y al final de la cadena de texto
     * ingresada
     * . inEmpty() revisa que no este vacio el contendio que ingreso
     */
    public void setName(String name) {
        // validaciones con if else
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println(" error: el nombre no puede estar vacio");
        }
    }

    public void setEdad(int edad) {
        // validacion
        if (edad >= 15 && edad <= 110) {
            this.edad = edad;
        }

        else {
            System.out.println(" error edad invalida debe estar entre 15 y 110 años ");
        }
    }

    public void setAverage(double average) {
        // validacion

        if (average >= 0.0 && average <= 5.0) {
            this.average = average;

            actualizarEstadoPorPromedio();
        }

        else {
            System.out.println(" error: promedio invalido");

        }

    }

    public void setEstado(String estado) {

        switch (estado) {
            case "Activo":
            case "Inactivo":
            case "Graduado":
                this.estado = estado;
                break;
            default:
                System.out.println(" error estado no valido");
                break;
        }

    }

    // actualizar creditos aprobados
    public void setCreditosAprobados(int creditosAprobados) {
        // VALIDACION CON OPERADOR TERNARIO
        this.creditosAprobados = (creditosAprobados >= 0) ? creditosAprobados : 0;
    }

    private void actualizarEstadoPorPromedio() {
        if (this.average >= 3.0) {
            this.estado = "Activo";

        } else if (this.average >= 2.0) {
            System.out.println(" advertencia: promedio bajo ");
        }

        else {
            this.estado = "Inactivo";
            System.out.println(" ¡¡¡¡¡¡¡estudiante en riesgo academico!!!!!!!! ");
        }
    }

    public String obtenerCalificacion() {
        String calificacion;
        int promedioEntero = (int) this.average;

        switch (promedioEntero) {
            case 5:
                calificacion = "excelente";
                break;
            case 4:
                calificacion = "sobresaliente";
                break;
            case 3:
                calificacion = "Aceptable";
                break;
            case 2:
                calificacion = "insuficiente";
                break;

            default:
                calificacion = "deficiente :(";

        }

        return calificacion;
    }

    public boolean estaAprobado() {
        return (this.average >= 3.0) ? true : false;
    }

    public String obtenerEstadoAcademico() {
        return (this.average >= 3.0) ? "Aprobado" : "Reprobado";
    }

    // metodo para calcular si se gradua o no
    public boolean puedeGraduarse() {
        return (this.creditosAprobados >= 160 && this.average >= 3.0) ? true : false;
    }

    /*
     * @Override
     * public String toString() {
     * return "Estudiante [name=" + name + ", edad=" + edad + ", average=" + average
     * + ", estado=" + estado
     * + ", creditosAprobados=" + creditosAprobados + "]";
     * }
     */

    public void mostrarInformacion() {
        System.out.println("============ informacion del estudiante ==================");
        System.out.println(" nombre " + this.name);
        System.out.println(" edad " + this.edad);
        System.out.println(" promedio " + this.average);
        System.out.println(" estado " + this.estado);
        System.out.println("creditos aprobados " + this.creditosAprobados);
        System.out.println(" calificacion " + obtenerCalificacion());
        System.out.println(" estado academico " + obtenerEstadoAcademico());
        System.out.println("puede graduarse " + (puedeGraduarse() ? "si" : "no"));
    }
}
