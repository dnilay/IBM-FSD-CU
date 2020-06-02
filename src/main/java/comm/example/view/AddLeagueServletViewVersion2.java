package comm.example.view;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class AddLeagueServletViewVersion2 extends HttpServlet {
    private String str;
    private String arrStr[];

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
        str = config.getInitParameter("season-list");
        arrStr = str.split(",");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doProcess(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        List<String> errors = (List<String>) request.getAttribute("error");
        if (errors != null) {
            out.println("<ul><h3>please correct the bellow error(s)</h3>");
            for (String s : errors) {
                out.println("<li><font color='red'>" + s + "</font></li>");
            }
            out.println("</ul><br/><a href='add_league.html'>try again</a>");

        }
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>add league page..</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "    <p><h3>This form allows you to create a new soccer league.</h3></p>\n" +
                "\n" +
                "<form action='add_league.do' method='POST'>\n" +
                "    Year: <input type='text' name='year' /> <br/><br/>");
        out.println("Season<select name='season'>");
        out.println("<option value='UNKNOWN'>Select...</option>");
        for (String s : arrStr) {
            out.println("<option value='" + s + "'>" + s + "</option>");
        }
        out.println(" </select> <br/><br/>\n" +
                "    Title: <input type='text' name='title' /> <br/><br/>\n" +
                "    <input type='submit' value='Add League' />\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }


}
