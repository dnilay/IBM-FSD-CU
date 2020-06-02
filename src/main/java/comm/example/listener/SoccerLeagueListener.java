package comm.example.listener;

import comm.example.model.League;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@WebListener()
public class SoccerLeagueListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {


    public SoccerLeagueListener() {
    }


    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context=sce.getServletContext();
        String file=context.getInitParameter("leagues-file");
        List<League> leagueList=new ArrayList<League>();
        InputStream inputStream=null;
        BufferedReader bufferedReader=null;
        try {
            inputStream=context.getResourceAsStream(file);
            bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
            String record=null;
            while ( (record = bufferedReader.readLine()) != null )
            {
                String arrRecord[]=record.split(",");
                League league=new League(Integer.parseInt(arrRecord[0]),arrRecord[1],arrRecord[2]);
                leagueList.add(league);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        context.setAttribute("leagueList",leagueList);
        context.log("leagueList added successfully");
        System.out.println("context listener is on work");


    }

    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context=sce.getServletContext();
        context.log("context destroyed");
        System.out.println("context destroyed on work.");

    }

}
