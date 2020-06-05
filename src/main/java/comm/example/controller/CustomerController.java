package comm.example.controller;
import comm.example.model.Customer;
import comm.example.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId,
                                    Model theModel) {

        // get the customer from our service
        Customer theCustomer = customerService.getCustomer(theId);

        // set customer as a model attribute to pre-populate the form
        theModel.addAttribute("customer", theCustomer);

        // send over to our form
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
