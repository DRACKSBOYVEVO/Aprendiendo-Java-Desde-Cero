public class InmutabilidadDeUnString {
    public static void main(String[] args) {
        //Un Ejemplo Simple.
        String Nombre = "Juan José ";
        String Apellidos = "Henao Gutiérrez ";

        String Nombre_Completo = Nombre + " " + Apellidos;
        System.out.println(Nombre_Completo);

        //Tambien sirve para concatenar, pero de una forma mas optima.
        //Recibe como parametro una funcion.
        //Nombre_Completo.transform()

    }
}
