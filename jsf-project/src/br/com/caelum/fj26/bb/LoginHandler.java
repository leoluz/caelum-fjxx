package br.com.caelum.fj26.bb;

public class LoginHandler {

	private String login;
	private String senha;
	private boolean logado = false;
	
	public boolean isLogado() {
		return logado;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		System.out.println("mudando o login para: " + login);
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		System.out.println("uma senha: " + senha);
		this.senha = senha;
	}
	public String logar() {
		if ("caelum".equals(login) && "fj26".equals(senha)) {
			System.out.println("Login com sucesso");
			this.logado = true;
			return "sucesso";
		} else {
			System.out.println("login falhou");
			this.logado = false;
			return "erro";
		}
	}
}
