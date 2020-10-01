public class EstructurasCondicionales {
    public static void main(String[] args) {

        int Matematicas = 5;
        int Biologia = 7;
        int Ingles = 8;
        int Espanol = 4;

        int promedio = (Matematicas+Biologia+Ingles+Espanol) / 3;

        if (promedio > 5){
            System.out.println("Aprobaste la signatura!");
        }else{
            System.out.println("Reprobaste la signatura!");
        }
    }
}
