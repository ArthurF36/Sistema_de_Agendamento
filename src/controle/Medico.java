package controle;

public class Medico {
    private String nome;
    private String dataCons;
    private String hora;
    private Usuario paciente;
    private String sintomasPacien;

    public Medico(String nome, String dataCons, String hora, Usuario paciente, String sintomasPacin) {
        this.nome = nome;
        this.dataCons = dataCons;
        this.hora = hora;
        this.paciente = paciente;
        this.sintomasPacien = sintomasPacin;
    }

    public String getNome() {
        return nome;
    }
}
