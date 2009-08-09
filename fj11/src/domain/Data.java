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
