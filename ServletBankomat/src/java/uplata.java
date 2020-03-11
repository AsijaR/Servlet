import java.io.*;import java.util.ArrayList; 
 import javax.servlet.*; import javax.servlet.http.*; 
 
public class uplata extends HttpServlet 
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
	//String sifra=request.getParameter("sifra"); 
        String novac=request.getParameter("uplata");
        int uplata=Integer.parseInt(novac);
            listaKorisnika.forEach(korisnik->{ 
            if(uplata>0)
            {
          try {  
                out.println("<html>");       
                out.println("<head>"); 
                out.println("<title>Bankomat</title>");  
                out.println("</head>"); 
                out.println("<body>");   
                out.println("<h1>Dobrodosli " + korisnik.getIme()+" "+korisnik.getPrezime()+ "</h1>");  
                out.println("<br/>");  
               //int p= korisnik.Uplata(uplata);
             //   out.println("<h1>Vase trenutno stanje je " + korisnik.setStanje()+" dinara "+ "</h1>");  
               // out.println("<a href=\"index.html\">jedan!</a>"); 
              
               out.println("</body>");  
                out.println("</html>");  
                
            }
            finally{
              /*String pare=request.getParameter("uplata");
                 int a=Integer.parseInt(pare);
                 korisnik.Uplata(a);
               */
                    out.close();}}
            else
                {
                out.println("<html>");       
                out.println("<head>"); 
                out.println("<title>Pocetna</title>");  
                out.println("</head>"); 
                out.println("<body>");   
                out.println("<a href=\"index.html\">Molimo vas pokusajte ponovo!</a>");  
                out.println("</body>");  
                out.println("</html>"); 
                }
            });
            }
            
          
           
        } 
         
	