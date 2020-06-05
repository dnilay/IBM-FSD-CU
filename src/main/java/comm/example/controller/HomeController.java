package comm.example.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    private String home()
    {
        return "index";
    }
}
