package com.example.league;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.league.League;
/**
 * Servlet implementation class ListLeagueServlet
 */
@WebServlet({ "/ListLeagueServlet", "/List_league.view" })
public class ListLeagueServlet extends HttpServlet {
	private List<League> leagueList = null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListLeagueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		processRequest(request,response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//response.setContentType("text/html");
	//PrintWriter out=response.getWriter();
	//leagueList= new ArrayList<League>();
	//leagueList.add(new League("World cup","spring",2019));
	//leagueList.add(new League("summery volly","summer",2018));
	//leagueList.add(new League("winterbasket","winter",2017));
	
	//out.println("<html><head><title>List All</title></head><body><table border=1>");
	//out.println("<tr><th>title</th><th>year</th><th>season</th></tr>");
	//for(League l:leagueList)
	//{
	//	out.println("<tr><td>"+l.getTitle()+"</td>"+""+"<td>"+l.getYear()+"</td>"+""+"<td>"+l.getSeason()+"</td></tr>");
	//}
	
	//out.println("</table></body></html>");
		/*leagueList = new LinkedList<League>();
		leagueList.add( new League(2003, "Spring","Soccer Leagu") );
		 leagueList.add( new League(2003, "Summer","Summer Soccer Fest 2003") );
		 leagueList.add( new League(2003, "Fall","Fall Soccer League ") );
		 leagueList.add( new League(2004, "Spring","Soccer League (Spring ‘04)") );
		 leagueList.add( new League(2004, "Summer","The Summer of Soccer Love 2004") );
		 leagueList.add( new League(2004, "Fall","Fall Soccer League (2004)") );
		String pageTitle = "Duke’s Soccer League: List Leagues";*/
		leagueList = (List<League>)getServletContext().getAttribute("leaguelist");
		String pageTitle = "Ducks soccer league:List leagues";
		 // Specify the content type is HTML
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		
		
		//response.setContentType("text/html");
		 // Generate the HTML response
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title>" + pageTitle + "</title>");
		 out.println("</head>");
		 out.println("<body>");
		
		
		 out.println("<table border=’1’ cellpadding=’5’ cellspacing='0' width=’400’>");
		 out.println("<tr bgcolor='#CCCCFF' align='center' valign='center'height='20'>");
		 out.println("<td><h3>" + pageTitle + "</h3></td>");
		 out.println("</tr>");
		 out.println("</table>");
		 
		 out.println("<p>");
		  out.println("The set of soccer leagues are:");
		  out.println("</p>");
		 
		  out.println("<ul>");
		  Iterator items = leagueList.iterator();
		  while ( items.hasNext() ) {
		  League league = (League) items.next();
		  out.println(" <li>" + league.getTitle() + "</li>");
		  }
		  out.println("</ul>");
		 
		  out.println("</body>");
		  out.println("</html>");
	
	
	}
}
