package domain.empresa;

class FuncionarioTest {

    public static void main (String[] args) {
        //comparacaoDeObjetosTest();
        mostraFuncionarioTest();
    }

    static void comparacaoDeObjetosTest() {
        Funcionario f1 = new Funcionario();
        f1.setNome("Leo");

        Funcionario f2 = new Funcionario();
        f2.setNome("Leo");

        f2 = f1;
        
        if (f1 == f2) {
            System.out.println("Iguais");
        }
        else {
            System.out.println("Diferentes");
        }
    }

    static void mostraFuncionarioTest() {

        Funcionario f = new Funcionario("Alessandra Mauricio Luz");
        f.setSalario(50000);
        f.setDepartamento("WebDesign e Conteúdo");
        f.setData(new Data(13, 10, 1978));
        f.setRg("123456789");
        f.mostra();

        Funcionario fun = new Funcionario("Leonardo Luz Almeida");
        fun.setSalario(1000);
        fun.setDepartamento("Informatica");
        fun.setData(new Data(01, 01, 2009));
        fun.setRg("55715789");
        fun.demite();
        fun.mostra();
    }
}
