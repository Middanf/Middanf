package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Empleado;
import entidad.User;
import modelo.ModelEmpleado;

/**
 * Servlet implementation class ServletEmpleado
 */
@WebServlet("/ServletEmpleado")
public class ServletEmpleado extends HttpServlet {
	
	ModelEmpleado m = new ModelEmpleado();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	String name_user, lastname, login, password, email, cellphone, create_at;
    	
    	name_user = request.getParameter("txt_name_user");
    	lastname = request.getParameter("txt_lastname");
    	login = request.getParameter("txtlogin");
    	password = request.getParameter("txtpass");
    	email = request.getParameter("txt_email");
    	cellphone = request.getParameter("txt_cellphone");
    	
    	User u = new User();
    	
    	u.setName_user(name_user);
    	u.setLastname(lastname);
    	u.setLogin(login);
    	u.setPassword(password);
    	u.setEmail(email);
    	u.setCellphone(Integer.parseInt(cellphone));
    	
    	
    	//Empleado e = m.iniciarSesion(login, clave);
    	
    	/*if(e == null){
    		request.setAttribute("msj", "Usuario o Clave incorrecto");
    		request.getRequestDispatcher("registro.jsp").forward(request, response);
    	}
    	else{
    		String mensaje = "Bienvenido " + e.getNombre();
    		
    		request.setAttribute("mensaje", mensaje);
    		request.getRequestDispatcher("menu.jsp").forward(request, response);
    	}*/
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
