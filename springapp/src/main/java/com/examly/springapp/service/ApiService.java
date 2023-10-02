import com.example.springapp.model.Laptop;
import java.util.*;
public class ApiService {
    private List<Laptop> laptops=new ArrayList<>();
    
    public boolean addLaptop(Laptop laptop){
       return laptops.add(laptop);
    }
    public Laptop getLaptopById(int laptopId){
        for(Laptop laptop:laptops){
            if(laptop.getLaptopId()==laptopId){
                return laptop;
            }
        }
        return null;
    }
    public List<Laptop>getAllLaptops(){
        return laptops;
    }
    public boolean removeLaptopById(int laptopId){
        for(Laptop laptop:laptops){
            if(laptop.getLaptopId()==laptopId){
                return laptop.remove(laptop);
            }
        }
        return false;
    }
}