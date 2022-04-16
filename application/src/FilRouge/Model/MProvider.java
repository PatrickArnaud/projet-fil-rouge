package FilRouge.Model;

import static FilRouge.Model.MArticles.cnx;
import java.sql.ResultSet;
import java.sql.Statement;

public class MProvider {

    int provider_id;
    int provider_id_contact;
    String provider_name;
    String provider_adress;

    public int getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(int provider_id) {
        this.provider_id = provider_id;
    }

    public int getProvider_id_contact() {
        return provider_id_contact;
    }

    public void setProvider_id_contact(int provider_id_contact) {
        this.provider_id_contact = provider_id_contact;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }
   
    public String getProvider_adress() {
        return provider_adress;
    }

    public void setProvider_adress(String provider_adress) {
        this.provider_adress = provider_adress;
    }

    @Override
    public String toString() {
        return "MProvider{" + "provider_id=" + provider_id + ", provider_id_contact=" + provider_id_contact + ", provider_name=" + provider_name + ", provider_adress=" + provider_adress + '}';
    }

    public MProvider() {
    }

    
    
  
   

    static public MProvider getAProviderById(int id) {
        MProvider pro = new MProvider();

        try {
            String query = "SELECT  id_supplier, address_supplier , name_supplier, id_contact FROM nesti_supplier WHERE id_supplier ='" + id + "'";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                pro.setProvider_id(resultSet.getInt(1));
                pro.setProvider_adress(resultSet.getString(2));
                pro.setProvider_name(resultSet.getString(3));
                pro.setProvider_id_contact(resultSet.getInt(4));
            }
            System.out.println(pro.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return pro;
        }

    }

}
