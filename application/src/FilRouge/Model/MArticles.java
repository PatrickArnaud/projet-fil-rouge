package FilRouge.Model;

public class MArticles {
    
    private int id;
    private String name;
    private String brand;
    private String provider;
    private String status_article;

    public MArticles(int id, String name, String brand, String provider) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.provider = provider;
    }
    
      public MArticles() {
    }

    public String getStatus_article() {
        return status_article;
    }

    public void setStatus_article(String status_article) {
        this.status_article = status_article;
    }
 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        
        return "MArticles{" + "id=" + id + ", name=" + name + ", brand=" + brand + ", provider=" + provider + '}';
    }
    
    
    
   
    
}
