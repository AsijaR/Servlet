import java.io.*;import java.util.ArrayList; 
 import javax.servlet.*; import javax.servlet.http.*; 
 
public class isplata extends HttpServlet 
{
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)     throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");    
        PrintWriter out = response.getWriter(); 
        ArrayList<Korisnik> listaKorisnika;
        listaKorisnika = new ArrayList();
        listaKorisnika.add(new Korisnik("Asija","Ramovic","8880",500));
	listaKorisnika.add(new Korisnik("Melida","Radoncic","5278",1000));
	listaKorisnika.add(new Korisnik("Milan","Petrovic","7820",500));
	String sifra=request.getParameter("sifra"); 
        String novac=request.getParameter("isplata");
        int isplata=Integer.parseInt(novac);
            listaKorisnika.forEach(korisnik->{ 
            if(isplata<=korisnik.Stanje)
            {
          try {  
                out.println("<html>");       
                out.println("<head>"); 
                out.println("<title>Bankomat</title>");  
                out.println("</head>"); 
                out.println("<body>");   
                out.println("<h1>Dobrodosli " + korisnik.getIme()+" "+korisnik.getPrezime()+ "</h1>");  
                out.println("<br/>");  
                korisnik.Isplata(isplata);
                out.println("<h1>Vase trenutno stanje je " + korisnik.getStanje()+" dinara "+ "</h1>");  
                //out.println("<a href=\"index.html\">jedan!</a>"); 
                out.println("<form action=\"uplata\" method=\"get\">"); 
                out.println("<h3>Unesite koliko novca zelite da uplatite:</h3> <input type=\"text\" name=\"uplata\">"); 
                out.println("<input type=\"submit\" value=\"Izvrsi uplatu\">");
                out.println("</form>"); 
               
                out.println("<form action=\"isplata\" method=\"get\">"); 
                out.println("<h3>Unesite koliko novca zelite da podignete:</h3> <input type=\"text\" name=\"isplata\">"); 
                out.println("<input type=\"submit\" value=\"Izvrsi isplatu\">");
                out.println("</form>"); 
               
                out.println("</body>");  
                out.println("</html>");  
                
            }
            finally{
              
                    out.close();}}
            else
                {
                out.println("<html>");       
                out.println("<head>"); 
                out.println("<title>Pocetna</title>");  
                out.println("</head>"); 
                out.println("<body>");   
                out.println("<a href=\"index.html\">Nemate trenutno dovoljno novca na racunu</a>");  
                out.println("</body>");  
                out.println("</html>"); 
                }
            });
            }
            
          
           
        } 
         
	