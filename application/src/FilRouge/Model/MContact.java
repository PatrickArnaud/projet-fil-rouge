package FilRouge.Model;

import FilRouge.Controlleur.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MContact {

    private int id;
    private String firstname;
    private String lastname;
    private String telephone;

    public MContact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "MContact{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", telephone=" + telephone + '}';
    }

    static Connection cnx = DBConnect.connect();

    static public ArrayList getContacts() throws SQLException {
        ArrayList<MContact> arr = new ArrayList<>();
        MContact contact = null;
        try {

            String query = "SELECT  id_contact, name_contact , firstname_contact , tel_contact FROM nesti_contact";
            Statement smt = cnx.createStatement();
            ResultSet resultSet = smt.executeQuery(query);
            while (resultSet.next()) {
                contact = new MContact();
                contact.setId(resultSet.getInt(1));
                contact.setLastname(resultSet.getString(2));
                contact.setFirstname(resultSet.getString(3));
                contact.setTelephone(resultSet.getString(4));
                arr.add(contact);
                System.out.println(contact.toString());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return arr;
        }

    }

    static public boolean addContact(MContact contact) throws SQLException {
        boolean success = false;
        try {
            String query = "INSERT INTO nesti_contact (name_contact,firstname_contact,tel_contact) VALUES(?,?,?)";
            PreparedStatement smt = cnx.prepareStatement(query);
            smt.setString(1, contact.getLastname());
            smt.setString(2, contact.getFirstname());
            smt.setString(3, contact.getTelephone());           
            smt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return success;
    }
}
