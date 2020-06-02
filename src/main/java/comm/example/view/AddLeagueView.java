package comm.example.view;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "AddLeagueViewServlet", urlPatterns = {"/add_league.view"})
public class AddLeagueView extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doProcess(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        List<String> errors=(List<String>)request.getAttribute("error");
        if(errors!=null)
        {
            out.println("<ul><h3>please correct the bellow error(s)</h3>");
            for (String s:errors)
            {
                out.println("<li><font color='red'>"+s+"</font></li>");
            }
            out.println("</ul><br/><a href='add_league.html'>try again</a>");

        }
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "    <p><h3>This form allows you to create a new soccer league.</h3></p>\n" +
                "\n" +
                "<form action='add_league.do' method='POST'>\n" +
                "    Year: <input type='text' name='year' /> <br/><br/>\n" +
                "    Season: <select name='season'>\n" +
                "    <option value='UNKNOWN'>select...</option>\n" +
                "    <option value='Spring'>Spring</option>\n" +
                "    <option value='Summer'>Summer</option>\n" +
                "    <option value='Fall'>Fall</option>\n" +
                "    <option value='Winter'>Winter</option>\n" +
                "    </select> <br/><br/>\n" +
                "    Title: <input type='text' name='title' /> <br/><br/>\n" +
                "    <input type='submit' value='Add League' />\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>\n");


    }
}
