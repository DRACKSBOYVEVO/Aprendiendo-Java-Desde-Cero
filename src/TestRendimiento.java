public class TestRendimiento {
    public static void main(String[] args) {

    String A = "A";
    String B = "B";
    String C = A;

    StringBuilder opcion = new StringBuilder(A);

    //Vamos a calcular el tiempo en milisegundos.
    long Inicio = System.currentTimeMillis();

    for(int i = 0; i < 500; i ++){ //500 iteraciones

        opcion.append(A);
        opcion.append(B);
        opcion.append("\n");
        //Hay dos metodos, uno eficiente y rapido, y uno un poco simple, pero lento.
        //Metodo rapido.
        //C = C.concat(A).concat(B).concat("\n");
        //Metodo Lento.
        //C += A + B + "\n";
    }
    /*Este metodo es muy util a la hora de concatenar grandes cantidades de string
    por que se demora muy poco en procesar los datos.*/

    long Fin = System.currentTimeMillis();
        System.out.println(Fin-Inicio); //El tiempo total en que se demora.
        System.out.println("C = " + C);
        //Se demoro 2milisegundo. 500 = 2ms
        System.out.println("Opcion = " + opcion.toString());










    }
}
