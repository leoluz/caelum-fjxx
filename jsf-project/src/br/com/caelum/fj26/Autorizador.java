package br.com.caelum.fj26;

import javax.el.ELResolver;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.com.caelum.fj26.bb.LoginHandler;

public class Autorizador implements PhaseListener {
	
	public static final String loginPage = "/olajsf.jsp";

	public void afterPhase(PhaseEvent event) {
		FacesContext fc = event.getFacesContext();
		
		//Verifica se é pagina de login
		if (fc.getViewRoot().getViewId().equals(loginPage)) {
			return;
		}
		
		//obtem uma referencia para o autenticador na sessão
		ELResolver elr = fc.getApplication().getELResolver();
		LoginHandler login = (LoginHandler) elr.getValue(fc.getELContext(), null, "autenticador");
		
		if (login == null || !login.isLogado()) {
			System.out.println("Não está logado...");
			
			NavigationHandler nav = fc.getApplication().getNavigationHandler();
			nav.handleNavigation(fc, null, "login");
			
			//renderiza a pagina
			fc.renderResponse();
		}
	}

	public void beforePhase(PhaseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}
}
