package FilRouge.Model;

public class MPackaging {

    private int id_package;
    private int id_mesure;
    private String name_mesure;
    private String kind_package;
    private String description_package;
    private float quantity;

    public MPackaging() {
    }

    public int getId_package() {
        return id_package;
    }

    public void setId_package(int id_package) {
        this.id_package = id_package;
    }

    public int getId_mesure() {
        return id_mesure;
    }

    public void setId_mesure(int id_mesure) {
        this.id_mesure = id_mesure;
    }

    public String getName_mesure() {
        return name_mesure;
    }

    public void setName_mesure(String name_mesure) {
        this.name_mesure = name_mesure;
    }

    public String getKind_package() {
        return kind_package;
    }

    public void setKind_package(String kind_package) {
        this.kind_package = kind_package;
    }

    public String getDescription_package() {
        return description_package;
    }

    public void setDescription_package(String description_package) {
        this.description_package = description_package;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Packaging " + "id_package=" + id_package + ", id_mesure=" + id_mesure + ", name_mesure=" + name_mesure + ", kind_package=" + kind_package + ", description_package=" + description_package + ", quantity=" + quantity + '}';
    }
    
    
       
    

}
