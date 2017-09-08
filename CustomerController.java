package controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import dao.CustomerDAO;
import entities.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	// need to inject dao to controller
	private CustomerDAO customerdao;
	@RequestMapping("/list")
	public String listCustomers(Model themodel) {
		// get customer from the dao
		List<Customer>thecustomers=customerdao.getCustomers();
		// add to the model
		themodel.addAttribute("customers", thecustomers);
	
		return "list-customers";
	}

}
