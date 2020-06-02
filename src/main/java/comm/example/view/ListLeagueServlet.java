package comm.example.view;

import comm.example.model.League;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ListLeagueServlet", urlPatterns = {"/list_league.view"})
public class ListLeagueServlet extends HttpServlet {
    List<League> list=null;
    @Override
    public void init(ServletConfig config) throws ServletException {
        ServletContext context=config.getServletContext();
        list=(List<League>)context.getAttribute("leagueList");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doProcess(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doProcess(request,response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<p>list of all available league<p><br/>");
        for (League l:list)
        {
            out.println("Year: "+l.getYear()+" Season: "+l.getSeason()+" Title: "+l.getTitle()+"<br/>");
        }

    }
}
