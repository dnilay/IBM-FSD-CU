package comm.example.controller;

import comm.example.model.Customer;
import comm.example.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    @RequestMapping("/showFormForAdd")
    public String showFormForAdd(Model model)
    {
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }
    @RequestMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer)
    {
        customerService.createCustomer(customer);
        return "redirect:/customer/listCustomer";
    }
}
