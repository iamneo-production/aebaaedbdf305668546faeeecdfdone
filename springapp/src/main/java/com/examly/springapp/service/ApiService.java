import java.util.ArrayList;
import java.util.List;

public class ApiService {
    private List<Laptop> laptops = new ArrayList<>();

    public boolean addLaptop(Laptop laptop) {
        
            // Add logic to validate and save the laptop data
            if (laptop != null) {
                // Assuming a successful addition, you can add the laptop to your data store
                laptops.add(laptop);
                return true; // Laptop added successfully
            }
            return false; // Laptop addition failed due to invalid input (e.g., null laptop object)
        
    }

    public Laptop getLaptopById(int laptopId) {
        for (Laptop laptop : laptops) {
            if (laptop.getLaptopId() == laptopId) {
                return laptop;
            }
        }
        return null; // Laptop not found
    }

    public List<Laptop> getAllLaptops() {
        return laptops;
    }

    public boolean removeLaptopById(int laptopId) {
        for (Laptop laptop : laptops) {
            if (laptop.getLaptopId() == laptopId) {
                return laptops.remove(laptop);
            }
        }
        return false; // Laptop not found for removal
    }
}
