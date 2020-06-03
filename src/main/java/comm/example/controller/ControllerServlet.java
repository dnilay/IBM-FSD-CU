package comm.example.controller;

import comm.example.model.Player;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ControllerServlet",urlPatterns = {"/controller.do"})
public class ControllerServlet extends HttpServlet {
    private String name;
    private String age;
    private String team;
    private List<String> errors;
    private Player player;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doProcess(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doProcess(request,response);
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        errors=new ArrayList<String>();
        name=request.getParameter("pName").toString();
        age=request.getParameter("pAge").toString();
        team=request.getParameter("pTeam").toString();
        int intAge=0;
        try {
            intAge=Integer.parseInt(age);
        }
        catch (Exception e)
        {
            errors.add("age field must be numeric.");
        }
        if (intAge<18 || intAge>45)
        {
            errors.add("age must be >=18 and <=45");
        }
        if(name.length()<8)
        {
            errors.add("name field is too short");
        }
        if(team.equals("UNKNOWN"))
        {
            errors.add("provide a valid team");
        }
        if(!errors.isEmpty())
        {
            request.setAttribute("errors",errors);
            RequestDispatcher view=request.getRequestDispatcher("add_player.jsp");
            view.forward(request,response);
        }
        else {
            request.setAttribute("player",new Player(name,intAge,team));
            RequestDispatcher view=request.getRequestDispatcher("success.jsp");
            view.forward(request,response);
        }



    }
}
