
package FilRouge.Controlleur;

import FilRouge.Model.MContact;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBContact {
    
     static public ArrayList getContactsFromDB() throws SQLException {
        ArrayList<MContact> arr = new ArrayList<>();
        arr = MContact.getContacts();
        return arr;
        
    }

    static public boolean addContactToDB(MContact contact) throws SQLException {
        boolean success = false;
        MContact.addContact(contact);
        return success;
    }
        

}
