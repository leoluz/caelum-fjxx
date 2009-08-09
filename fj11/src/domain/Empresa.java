package domain;

class Empresa {
    
    private static int identificador;
    private Funcionario[] funcionarios;
    private String cnpj;

    public Empresa(int maxFuncionarios) {
        this.funcionarios = new Funcionario[maxFuncionarios];
    }

    public String getCnpj() {
        return this.cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public int getCapacidadeMaximaDeFuncionarios() {
        return funcionarios.length;
    }
    public int getTotalDeFuncionarios() {
        return identificador;
    }

    public void addFuncionario(Funcionario f) {
        this.funcionarios[++identificador] = f;
    }
    public Funcionario getFuncionario(int identificador) {
        return this.funcionarios[identificador];
    }
}
