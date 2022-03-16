package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Não checada ou não verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu erro no #1");
    }

    //Excecão checada ou verificada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro no #2");
    }
}
