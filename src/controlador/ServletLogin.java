package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.User;
import modelo.ModelUser;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	
	ModelUser mu = new ModelUser();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	
    	String login = request.getParameter("txtlogin");
    	String password = request.getParameter("txtpass");
    	User u = mu.iniciarSesion(login, password);

    	if(u == null){
    		request.setAttribute("msj", "Usuario o Clave incorrecto");
    		request.getRequestDispatcher("admin.jsp").forward(request, response);
    	} else if (u.getRole_id() == 2) {
    		request.setAttribute("msj", "Bienvenido administrador: " + u.getName_user() + " !");
    		request.getRequestDispatcher("admin.jsp").forward(request, response);
    	}
    	else{
    		String mensaje = "Bienvenido " + u.getName_user();
    		
    		request.setAttribute("mensaje", mensaje);
    		request.getRequestDispatcher("menu.jsp").forward(request, response);
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
