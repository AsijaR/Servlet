 
 
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*;
public class PrviServlet extends HttpServlet 
{
    protected void doGet(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter izlaz = response.getWriter();
        try
        {
            izlaz.println("<html>");
            izlaz.println("<head>");
            izlaz.println("<title>Servlet prviServlet</title>"); 
            izlaz.println("</head>");
            izlaz.println("<body>"); 
            izlaz.println("<h1>Ovo je rezultat prvog!</h1>");  
            izlaz.println("</body>");  
            izlaz.println("</html>");  
        }
        finally {         }    
        response.sendRedirect("drugiServlet");   
    }
} 