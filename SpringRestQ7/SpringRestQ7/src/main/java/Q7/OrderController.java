package Q7;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {
	
	@Autowired
	private OrderServices orderServices;
	@GetMapping("/show/{Id}")
	public Order t(@PathVariable String Id) {
		return orderServices.FindbyId(Id);
	}
	@GetMapping("/showAll")
	public List<Order> getAll() {
		return orderServices.getAll();
	}
	@PostMapping("/Place")
	public Order Place(@RequestBody Order s) {
		return orderServices.place(s);
	}
	@PutMapping("/Update")
	public Order Update(@RequestBody Order s) {
		return orderServices.update(s);
	}
	@DeleteMapping("/delete/{Id}")
	public void del(@PathVariable String Id) {
		orderServices.deleteById(Id);
	}

}