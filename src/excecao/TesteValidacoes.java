package excecao;

import excecao.personalizadaA.NumeroForaIntervaloException;
import excecao.personalizadaA.StringVaziaException;
import excecao.personalizadaA.Validar;

public class TesteValidacoes {

    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Ana", -7, true);

            Validar.aluno(aluno);
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }
}
