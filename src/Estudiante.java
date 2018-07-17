public class Estudiante {
    private boolean isTurnOn = false
    private String nivel;
    private int Grado;
    private String estudiante;
    private long uniqueID;


    public boolean isTurnOn() {
        return this.isTurnOn;
    }

    public String getNivel() {
        return this.nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int grado) {
        Grado = grado;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
    }

}
