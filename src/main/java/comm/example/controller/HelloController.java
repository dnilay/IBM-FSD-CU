package comm.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/showForm")
    public String showForm()
    {
        return "showForm";
    }
    @RequestMapping(value = "/processForm1")
    public String processForm1()
    {

            return "processForm";
    }
    @RequestMapping(value = "/processForm2")
    public String processForm2(HttpServletRequest request,Model model)
    {

        model.addAttribute("name",request.getParameter("uName").toString());
        return "processForm";
    }
    @RequestMapping(value = "/processForm3")
    public String processForm3(@RequestParam("uName") String name,Model model)
    {

        model.addAttribute("name",name);
        return "processForm";
    }
}
