package comm.example.controller;
import comm.example.model.League;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AddLeagueServlet extends HttpServlet {
    private String title;
    private String year;
    private String season;
    private List<String> errors;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req, resp);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int intYear=0;
        errors=new ArrayList<String>();
        response.setContentType("text/html");
        year=request.getParameter("year").toString();
        season=request.getParameter("season");
        title=request.getParameter("title");
        try {
            intYear=Integer.parseInt(year);
        }
        catch (Exception e)
        {
            errors.add("year field must be numeric");
        }
        if((intYear<2020) ||(intYear>2021))
        {
            errors.add("year must be between 2020-2021");
        }
        if(title.length()<=0)
        {
            errors.add("title field can not be blank");
        }
        if (season.equals("UNKNOWN"))
        {
            errors.add("select a valid season");
        }
        if (!errors.isEmpty())
        {
            request.setAttribute("error",errors);
            RequestDispatcher view=request.getRequestDispatcher("add_league.html");
            view.forward(request,response);
        }
        else {

            League league=new League(intYear,season,title);
            request.setAttribute("l",league);
            RequestDispatcher view=request.getRequestDispatcher("success.view");
            view.forward(request,response);

        }


    }
}
