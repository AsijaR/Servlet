 
import java.io.*; import javax.servlet.*; import javax.servlet.http.*; 
 
public class DrugiServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)     throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8"); 
        PrintWriter izlaz = response.getWriter(); 
        try 
        {
            izlaz.println("<html>"); 
            izlaz.println("<head>"); 
            izlaz.println("<title>Servlet drugiServlet</title>");
            izlaz.println("</head>");       
            izlaz.println("<body>");     
            izlaz.println("<h1>Molimo vas unesite PIN kod kartice</h1>");   
            izlaz.println("<form action=\"treciServlet\" method=\"get\">");    
            izlaz.println("Unesite ime: <input type=\"text\" name=\"sifra\">");  
            izlaz.println("<input type=\"submit\" value=\"Pozovi treci   servlet\">");
            izlaz.println("</form>");       
            izlaz.println("</body>");    
            izlaz.println("</html>");   
        }
        finally {izlaz.close();}
    }
} 