package prototype;

public class Time implements Cloneable{

    private String nome;
    private String cores;
    private String mascote;

    public Time(String nome, String cores, String mascote) {
        super();
        this.nome = nome;
        this.cores = cores;
        this.mascote = mascote;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getmascote() {
        return mascote;
    }

    public void setMascote(String mascote) {
        this.mascote = mascote;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome=" + nome + '\'' +
                ", cores=" + cores + '\'' +
                ", mascote=" + mascote + '\'' +
                '}';
    }
}
