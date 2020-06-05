package comm.example.controller;

import comm.example.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/listCustomer")
    public String listCustomer(Model model) {
        model.addAttribute("customers",customerService.getCustomers());
        return "customer-list";

    }
}
