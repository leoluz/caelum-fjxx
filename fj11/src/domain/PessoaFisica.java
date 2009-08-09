package domain;

class PessoaFisica {

    private String cpf;

    PessoaFisica(String cpf) {
        if (validaCpf(cpf)) {
            this.cpf = cpf;
        }
    }
    public boolean validaCpf(String cpf) {
        return true;
    }
}

