import java.util.ArrayList;
import java.util.List;

public class ApiService {
    private List<Laptop> laptops = new ArrayList<>();

    public boolean addLaptop(Laptop laptop) {
        return laptops.add(laptop);
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
