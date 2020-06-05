package comm.example.controller;
import comm.example.model.Customer;
import comm.example.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int customerId, Model model)
    {
        model.addAttribute("customer",customerService.getCustomer(customerId));
        return "customer-form";
    }
    @RequestMapping("/updateCustomer")
    public String updateCustomer(@ModelAttribute("customer") Customer customer)
    {
        customerService.createCustomer(customer);
        return "redirect:/customer/listCustomer";
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam("customerId") int customerId)
    {
        customerService.deleteCustomer(customerId);
        return "redirect:/customer/listCustomer";
    }
}
