package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.User;
import modelo.ModelUser;

/**
 * Servlet implementation class ServletUser
 */
@WebServlet("/ServletUser")
public class ServletUser extends HttpServlet {
	
	ModelUser mu = new ModelUser();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUser() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String tipo=request.getParameter("tipo"); 
    	if(tipo.equals("listar"))	listar(request,response);
    	else if (tipo.equals("registrar")) registrar(request, response);
    }
    
    private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<User> info=new ModelUser().listar(); request.setAttribute("data", info); request.getRequestDispatcher("listarUser.jsp").forward(
    	request, response);
    }
    
    private void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    	
    	User u = new User();
    	
    	String name_user, lastname, login, password, email, cellphone;
    	
    	name_user = request.getParameter("txt_user");
    	lastname = request.getParameter("txt_lastname");
    	login = request.getParameter("txt_login");
    	password = request.getParameter("txt_password");
    	email = request.getParameter("txt_email");
    	cellphone = request.getParameter("txt_cellphone");
    	
    	u.setName_user(name_user);
    	u.setLastname(lastname);
    	u.setLogin(login);
    	u.setPassword(password);
    	u.setEmail(email);
    	u.setCellphone(Integer.parseInt(cellphone));
    	
    	int estado = mu.registrarUser(u);
    	
    	if (estado!=-1) {
    		listar(request, response);
    	} else {
    		response.sendRedirect("error.html");
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
