package com.example.springapp.service;
import com.example.springapp.model.Laptop;
import java.util.*;
public class ApiService {
    private List<Laptop> laptops;
    public ApiService(){
        laptops=new ArrayList<>();
    }
    public void addLaptop(Laptop laptop){
        laptops.add(laptop);
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
    public void removeLaptopById(int laptopId){
        laptops.removeIf(laptop->laptop.getLaptopId()==laptopId);
    }
}