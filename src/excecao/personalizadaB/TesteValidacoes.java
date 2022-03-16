package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Ana", -7, true);

            Validar.aluno(aluno);
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }

        try {
            Validar.aluno(null);
        } catch (StringVaziaException e) {
            e.printStackTrace();
        } catch (NumeroForaIntervaloException e) {
            e.printStackTrace();
        }

        System.out.println("Fim :)");
    }
}
