public class Vestibular {
    private String matricula;
    private double nota;

    public Vestibular(String matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
