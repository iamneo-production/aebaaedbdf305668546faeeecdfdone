import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptops")
public class LaptopController {

    @PostMapping("/")
    public boolean createLaptop() {
        // Implement logic to create a laptop and return true or false based on success.
        return laptops.add(laptop);
       // or false
    }

    @GetMapping("/")
    public List<Laptop> getAllLaptops() {
        // Implement logic to retrieve a list of laptops and return them.
        return laptops;
        // You may need to import the Laptop class and implement the logic.
     // Return a list of laptops or null if not implemented yet.
    }

    @GetMapping("/{laptopId}")
    public Laptop getLaptopById(@PathVariable int laptopId) {
        // Implement logic to retrieve a laptop by its ID and return it.
        // You may need to import the Laptop class and implement the logic.
       // Return a laptop or null if not implemented yet.
       for(Laptop laptop:laptops){
        if(laptop.getLaptopId()==laptopId){
            return laptop;
        }
    }
    return null;
    }
}