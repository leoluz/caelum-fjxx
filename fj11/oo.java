class Funcionario {

    String nome;
    String departamento;
    double salario;
    Data dataEntrada = new Data();
    String rg;
    boolean trabalhaNaEmpresa;

    void bonifica (double aumento) {
        this.salario += aumento;
    }

    void demite () {
        this.trabalhaNaEmpresa = false;
    }

    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Data de Entrada: "+ this.dataEntrada.mostraData());
        System.out.println("RG: " + this.rg);
        System.out.println("Trabalha na Empresa? " + this.trabalhaNaEmpresa);
    }
}

class Data {
    int dia;
    int mes;
    int ano;

    String mostraData() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}

class FuncionarioTest {

    public static void main (String[] args) {
        comparacaoDeObjetosTest();
        mostraFuncionarioTest();
    }

    static void comparacaoDeObjetosTest() {
        Funcionario f1 = new Funcionario();
        f1.nome = "Leo";

        Funcionario f2 = new Funcionario();
        f2.nome = "Leo";

        f2 = f1;
        
        if (f1 == f2) {
            System.out.println("Iguais");
        }
        else {
            System.out.println("Diferentes");
        }
    }

    static void mostraFuncionarioTest() {

        Funcionario f = new Funcionario();
        f.nome = "Alessandra";
        f.dataEntrada.dia = 13;
        f.dataEntrada.mes = 10;
        f.dataEntrada.ano = 1978;
        f.salario = 50000;
        f.mostra();
    }
}
