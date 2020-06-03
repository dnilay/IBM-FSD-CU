package comm.example.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filter1 implements Filter {
    Logger logger=Logger.getLogger("comm.example.filter.Filter1.class");
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
       // System.currentTimeMillis();
        logger.log(Level.INFO,"within filter 1");
        logger.log(Level.INFO,req.getRemoteAddr().toString());
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        String value=config.getInitParameter("a");
        logger.log(Level.INFO,value);

    }

}
