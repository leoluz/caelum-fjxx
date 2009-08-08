class EmpresaTest {

    static Funcionario f1;
    static Funcionario f2;
    static Empresa e;

    public static void main (String[] args) {
        f1 = new Funcionario("Leonardo");
        f2 = new Funcionario("Alessandra");
        e = new Empresa(100);

        e.addFuncionario(f1);
        e.addFuncionario(f2);

        mostra();
    }

    static void mostra() {
        System.out.println("Capacidade de funcionarios: " + e.getCapacidadeMaximaDeFuncionarios());
        System.out.println("Total de funcionarios: " + e.getTotalDeFuncionarios());
    }
}       
