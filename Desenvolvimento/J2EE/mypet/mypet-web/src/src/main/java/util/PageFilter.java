package src.main.java.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PageFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httprequest = (HttpServletRequest) request;
		HttpServletResponse httpresponse = (HttpServletResponse) response;
		HttpSession session = httprequest.getSession(false);

		String loginURI = httprequest.getContextPath() + "/mypet/login.xhtml";
		String indexURI = httprequest.getContextPath() + "/mypet/index.xhtml";

		boolean loggedIn = session != null && session.getAttribute("usuarioLogado") != null;
		boolean loginRequest = httprequest.getRequestURI().equals(loginURI);

		if (loggedIn && ("/mypet/login.xhtml".equals(httprequest.getRequestURI()))) {
			httpresponse.sendRedirect(indexURI);
		} else if (loggedIn || loginRequest) {
			chain.doFilter(request, response);
		} else {
			httpresponse.sendRedirect(loginURI);
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}