package comm.example.view;

import comm.example.model.League;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ErrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req,resp);
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        List<String> errors=(List<String>)request.getAttribute("error");
        out.println("<ul><h3>please correct the bellow error(s)</h3>");
        for (String s:errors)
        {
            out.println("<li><font color='red'>"+s+"</font></li>");
        }
        out.println("</ul><br/><a href='add_league.html'>try again</a>");

    }
}
