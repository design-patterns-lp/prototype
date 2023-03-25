package prototype;

public class Jogador implements Cloneable{
    private String nome;
    private String dtNascimento;
    private Double salario;
    private Integer mesesContrato;
    private Time time;

    public Jogador(String nome, String dtNascimento, Double salario, Integer mesesContrato, Time time) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.salario = salario;
        this.mesesContrato = mesesContrato;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(Integer mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public Jogador clone() throws CloneNotSupportedException {
        Jogador jogadorClone = (Jogador) super.clone();
        jogadorClone.time = (Time) jogadorClone.time.clone();
        return jogadorClone;
    }

//    @Override
//    public String toString() {
//        return "Jogador{" +
//                "nome=" + nome + '\'' +
//                ", dtNascimento='" + dtNascimento + '\'' +
//                ", salario=" + salario + '\'' +
//                ", meses de contrato='" + mesesContrato + '\'' +
//                ", time=" + time + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", dtNascimento='" + dtNascimento + '\'' +
                ", salario=" + salario +
                ", meses de contrato=" + mesesContrato + " meses" +
                ", time=" + time +
                '}';
    }

}
