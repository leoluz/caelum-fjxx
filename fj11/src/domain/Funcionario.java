package domain;

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
