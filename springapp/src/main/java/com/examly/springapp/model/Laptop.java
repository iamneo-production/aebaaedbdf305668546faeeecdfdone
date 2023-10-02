public class Laptop{
    private int laptopId;
    private String laptopBrand;
    private int laptopPrice;
    public Laptop(){

    }
    public Laptop(int laptopId,String laptopBrand,int laptopPrice){
        this.laptopId=laptopId;
        this.laptopBrand=laptopBrand;
        this.laptopPrice=laptopPrice;
    }
    public int getLaptopId(){
        return laptopId;
    }
    public void setLaptopId(int laptopId){
        this.laptopId=laptopId;
    }
    public String getLaptopBrand(String laptopBrand){
        this.laptopBrand=laptopBrand;
    }
}