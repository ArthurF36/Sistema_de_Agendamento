package modulo;

import controle.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Sistema {
    private final LinkedList<Medico> medicos;

    public Sistema() {
        this.medicos = new LinkedList<>();
    }

    public void agendarConsulta(Usuario aciente) {
        Scanner in = new Scanner(System.in);
        Medico agendaMed;
        Usuario paciente;
        boolean valida;
        char op;
        paciente = new Usuario("email", "senha");
        agendaMed = new Medico("Médico", "10/2/2023", "14:00", paciente, "Fadiga");
        valida = validaConsulta(agendaMed);
        if (valida) {
            do {
                System.out.println("Digite 1 para agendar. Ou digite 2 para voltar a tela inicial.");
                System.out.print("Digite aqui: ");
                op = in.next().charAt(0);
                if (op == '1') {
                    medicos.add(agendaMed);
                } else if (op == '2') {
                    System.out.println("Agendamento desfeito, voltando para o menu inicial.");
                } else {
                    System.out.println("Opção inválida");
                }
            } while (op != '1' && op != '2');
        } else {
            System.out.println("Médico não cadastra. Agendamento não realizado.");
        }
    }

    public boolean validaConsulta(Medico buscaMed) {
        int i;
        for (i = 0; i <= medicos.size() - 1; i++) {
            if (buscaMed.getNome().equalsIgnoreCase(medicos.get(1).getNome())) {
                return true;
            }
        }
        return false;
    }
}
