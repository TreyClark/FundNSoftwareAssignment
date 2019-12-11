package loginwebapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 


public class RegisterServlet extends HttpServlet{
	
	private static final long serialVersionUID = 6700213979457073873L;

	public RegisterServlet() {
	}

	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 System.out.println("Hit");
		 
		 /*String userName = request.getParameter("username");
		 String password = request.getParameter("password");
		 String securityq = request.getParameter("securityq");
		 String securitya = request.getParameter("securitya");
		 
		 Bean bean = new Bean();
		 bean.setUserName(userName);
		 bean.setPassword(password); 
		 bean.setSecurityQ(securityq);
		 bean.setSecurityA(securitya);
		 
		 RegisterDataObject register = new RegisterDataObject();
		 
		
		 String userRegistered = register.registerUser(bean);
		 
		 if(userRegistered.equals("SUCCESS")){
			 
		 request.getRequestDispatcher("/Home.jsp").forward(request, response);
		 }
		 
		 else{
			 
		 request.setAttribute("errMessage", userRegistered);
		 request.getRequestDispatcher("/Register.jsp").forward(request, response);
		 }*/
	 }
}




