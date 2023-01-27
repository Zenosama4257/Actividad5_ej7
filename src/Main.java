import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Estudiante [] Alumnos = new Estudiante[5];
        Alumnos [0] = new Estudiante("Marcelo" , 15 , 167);
        Alumnos [1] = new Estudiante("Javier" , 19 , 167);
        Alumnos [2] = new Estudiante("Expedito" , 16 , 176);
        Alumnos [3] = new Estudiante("Luciano" , 18 , 188);
        Alumnos [4] = new Estudiante("Efren" , 20 , 185);

        System.out.println("Esto es antes de ordenar");
        for (int i = 0 ; i < Alumnos.length ; i++ ){
            System.out.println(Alumnos[i].toString());
        }

        Arrays.sort(Alumnos);

        System.out.println("Esto es después de ordenar");
        for (int i = 0 ; i < Alumnos.length ; i++ ){
            System.out.println(Alumnos[i].toString());
        }



    }
}