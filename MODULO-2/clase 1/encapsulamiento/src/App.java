public class App {
    public static void main(String[] args) {

        System.out.println(" demostrando encapsulamiento en java ");

        System.out.println(" constructores");

        // constructor vacio
        Estudiante est1 = new Estudiante();
        System.out.println(" constructor vacio");
        System.out.println(" nombre " + est1.getName());
        System.out.println("estado " + est1.getEstado());

        // constructor con parametros
        Estudiante est2 = new Estudiante("Ana garcia", 20, 4.5);
        System.out.println(" constructor con parametros ");
        System.out.println(" nombre " + est2.getName());
        System.out.println(" edad " + est2.getEdad());
        System.out.println(" promedio " + est2.getAverage());

        // constructor completo
        Estudiante est3 = new Estudiante("jerson", 24, 3.5, "Activo", 120);
        System.out.println(" constructor completo ");
        System.out.println(" nombre " + est3.getName());
        System.out.println(" estado " + est3.getEstado());
        System.out.println(" edad " + est3.getEdad());
        System.out.println(" promedio " + est3.getAverage());
        System.out.println(" creditos aprobados " + est3.getCreditosAprobados());

        // demostracion por el setter con validaciones
        Estudiante estudiante = new Estudiante();
        System.out.println(" setters con validaciones ");
        System.out.println(" probando el setter del nombre ");
        estudiante.setName("emanuel");
        System.out.println(" nombre establecido " + estudiante.getName());

        System.out.println(" probando el setter de edad");
        estudiante.setEdad(45);
        System.out.println("edad establecida " + estudiante.getEdad());

        System.out.println(" probando el setter del promedio ");
        estudiante.setAverage(2.4);
        System.out.println(" promedio establecido " + estudiante.getAverage());

        // demostrar metodos de estado de calificacion

        System.out.println(" estado de calificacion");
        System.out.println("probando setEstado");
        estudiante.setEstado("Activo");
        System.out.println(" estado establecido para ese estudiante " + estudiante.getEstado());

        // calificaciones por promedio

        System.out.println("calificaciones por promedio ");
        Estudiante test1 = new Estudiante("test1 ", 20, 5.0);
        Estudiante test2 = new Estudiante("test2 ", 20, 4.3);
        Estudiante test3 = new Estudiante("test3 ", 20, 3.5);
        Estudiante test4 = new Estudiante("test4 ", 20, 3.8);
        Estudiante test5 = new Estudiante("test5 ", 20, 1.5);

        System.out.println(
                test1.getName() + "promedio " + test1.getAverage() + "calificacion " + test1.obtenerCalificacion());
        System.out.println(
                test2.getName() + "promedio " + test2.getAverage() + "calificacion " + test2.obtenerCalificacion());
        System.out.println(
                test3.getName() + "promedio " + test3.getAverage() + "calificacion " + test3.obtenerCalificacion());
        System.out.println(
                test4.getName() + "promedio " + test4.getAverage() + "calificacion " + test4.obtenerCalificacion());
        System.out.println(
                test5.getName() + "promedio " + test5.getAverage() + "calificacion " + test5.obtenerCalificacion());

        System.out.println("demostracion con operadores ternarios ");
        System.out.println("evaluame el estado academico de esas personas");
        System.out.println(" nombre " + test1.getName() + ": " + test1.obtenerEstadoAcademico() + "("
                + (test1.estaAprobado() ? "si " : "no") + ")");

        System.out.println(" nombre " + test2.getName() + ": " + test2.obtenerEstadoAcademico() + "("
                + (test2.estaAprobado() ? "si " : "no") + ")");

        System.out.println(" nombre " + test3.getName() + ": " + test3.obtenerEstadoAcademico() + "("
                + (test3.estaAprobado() ? "si " : "no") + ")");

        System.out.println(" nombre " + test4.getName() + ": " + test4.obtenerEstadoAcademico() + "("
                + (test4.estaAprobado() ? "si " : "no") + ")");

        System.out.println(" nombre " + test5.getName() + ": " + test5.obtenerEstadoAcademico() + "("
                + (test5.estaAprobado() ? "si " : "no") + ")");
    }

}
