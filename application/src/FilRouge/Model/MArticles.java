package FilRouge.Model;
import java.sql.Date;

public class MArticles {

    private int id;
    private String name;
    private String brand;
    private String provider;
    private String status_article;
    private String type;
    String origin;
    private int id_user;

    @Override
    public String toString() {
        return "MArticles{" + "id=" + id + ", name=" + name + ", brand=" + brand + ", provider=" + provider + ", status_article=" + status_article + ", type=" + type + ", origin=" + origin + ", id_user=" + id_user + ", creation_date=" + creation_date + '}';
    }
    private Date creation_date; 
    
       
    public MArticles() {
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

 
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
     public String getOrigin() {
        return origin;
    }
    public MArticles(String origin) {
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

  
   
}
