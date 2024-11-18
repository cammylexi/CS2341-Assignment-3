public class Product {
    private String id;
    private String name;
    private String category;
    private String price;

    public Product(String id, String name, String category,String price){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;

    }
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public String getPrice(){
        return price;

    }

}

