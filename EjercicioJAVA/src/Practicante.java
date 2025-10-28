public class Practicante {
protected String nombre;
protected String universidad;
protected int horas;
public Practicante(String nombre, String universidad, int horas) {
    this.nombre = nombre;
    this.universidad = universidad;
    this.horas = horas;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getUniversidad() {
    return universidad;
}
public void setUniversidad(String universidad) {
    this.universidad = universidad;
}
public int getHoras() {
    return horas;
}
public void setHoras(int horas) {
    this.horas = horas;
}
@Override
public String toString() {
    return "Practicante [nombre=" + nombre + ", universidad=" + universidad + ", horas=" + horas + "]";
}


}
