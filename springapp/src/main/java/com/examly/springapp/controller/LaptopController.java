import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {

    private final ApiService apiService;

    public LaptopController(ApiService apiService) {
        this.apiService = apiService;
    }

    @PostMapping("/")
    public boolean createLaptop(@RequestBody Laptop laptop) {
        return apiService.addLaptop(laptop);
    }

    @GetMapping("/")
    public List<Laptop> getAllLaptops() {
        return apiService.getAllLaptops();
    }

    @GetMapping("/{laptopId}")
    public Laptop getLaptopById(@PathVariable int laptopId) {
        return apiService.getLaptopById(laptopId);
    }
}
