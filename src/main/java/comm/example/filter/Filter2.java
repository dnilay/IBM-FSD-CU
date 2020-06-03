package comm.example.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filter2 implements Filter {
    Logger logger=Logger.getLogger("comm.example.filter.Filter2.class");
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        logger.log(Level.INFO,"within filter2");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
