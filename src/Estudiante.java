public class Estudiante implements  Comparable <Estudiante>{
    protected String Nombre;
    protected int Edad;
    protected int Altura;

    public Estudiante (String Nom, int Ed , int Alt){
        Nombre=Nom;
        Edad=Ed;
        Altura=Alt;
    }

    public double getAltura() {
        return Altura;
    }

    public int getEdad() {
        return Edad;
    }

    @Override
    public int compareTo(Estudiante o) {
        if (o.getAltura() > this.getAltura()){
            return 1;
        } else if (o.getAltura() < this.getAltura()) {
            return -1;
        }

        else {
            if (o.getEdad() > this.getEdad()){
                return 1;
            } else if (o.getEdad() < this.getEdad()) {
                return -1;
            }
            else {
                return 0;
            }
        }


    }

    @Override
    public String toString() {
        return Nombre + " - Edad " + Edad + " - Altura " + Altura ;
    }


}
