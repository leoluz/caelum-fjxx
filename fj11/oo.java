class Data {

    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String mostraData() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}

class Funcionario { 
    
    private static int identificador;
    private String nome; 
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;
    private boolean trabalhaNaEmpresa;

    public Funcionario() {
        identificador++; 
    }
    public Funcionario(String nome) {
        this();
        this.nome = nome;
        this.trabalhaNaEmpresa = true;
    }
    public static int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Data getData() {
        return this.dataEntrada;
    }
    public void setData(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public String getRg() {
        return this.rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isTrabalhaNaEmpresa() {
        return this.trabalhaNaEmpresa;
    }
    void bonifica (double aumento) {
        this.salario += aumento;
    }
    void demite () {
        this.trabalhaNaEmpresa = false;
    }
    void mostra() {
        System.out.println("Id: " + identificador);
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de Entrada: "+ this.dataEntrada.mostraData());
        System.out.println("RG: " + this.rg);
        System.out.println("Trabalha na Empresa? " + this.trabalhaNaEmpresa);
    }
}

class Empresa {

    
    private static int identificador;
    private Funcionario[] funcionarios;
    private String cnpj;

    public Empresa(int maxFuncionarios) {
        this.funcionarios = Funcionario[maxFuncionarios];
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

    public addFuncionario(Funcionario f) {
        this.funcionarios[++identificador] = f;
    }
    public getFuncionario(int identificador) {
        return this.funcionarios[identificador];
    }
}

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
