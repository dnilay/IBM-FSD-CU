package comm.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/showForm")
    public String showForm()
    {
        return "showForm";
    }
    @RequestMapping(value = "/processForm")
    public String processForm(HttpServletRequest request, Model model)
    {
            String str=request.getParameter("uName");
            model.addAttribute("name",str);
            return "processForm";
    }
}
