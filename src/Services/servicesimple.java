package Services;
import Class.simple;
import Connection.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 *
 * @author HP
 */
public class servicesimple implements Iservice <simple>{
    
    
    Connection cnx = MyConnection.getInstance().getCnx();
	private static servicesimple instance;
        private Statement st;
        private ResultSet rs;
        public simple userInfos;

    MyConnection cnn= new MyConnection();
    private final Connection cn;    
    public servicesimple() {
        cn = MyConnection.getInstance().getCnx();
    }
    
    @Override
    public void Ajouter(simple t)
    {
        String requete="INSERT INTO simple(username, password, mail, date_n)"
               + "VALUES (?,?,?,?)";
        try {
            PreparedStatement pst = 
                    new MyConnection().cn.prepareStatement(requete);
            pst.setString(1, t.getUsername());
            
            pst.setString(2,  t.getPassword());
            pst.setString(3, t.getMail());
            pst.setDate(4, (Date) t.getDate_n());
            pst.executeUpdate();
            System.out.println("Utilisateur ajoutee !");

            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void Supprimer(simple t)
    {
        String requete = "DELETE FROM simple WHERE id_user=?";
        try {
            PreparedStatement pst = 
                    new MyConnection().cn.prepareStatement(requete);
            pst.setInt(1, t.getId_user());
            pst.executeUpdate();
            System.out.println("Utilisateur Supprimé !");
        } catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void Modifier(simple t) 
    {
        String requete = "UPDATE simple SET password=?, mail=?, date_n=? WHERE username=?";
        try {
            PreparedStatement pst = 
                    new MyConnection().cn.prepareStatement(requete);
            pst.setString(4, t.getUsername());
            pst.setString(2, t.getMail());
            pst.setDate(3, (Date) t.getDate_n());
            pst.setString(1, t.getPassword());
            pst.executeUpdate();
            System.out.println("utilisateur Modfié !");
        } catch(SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
     public  boolean  login(String username, String password){
	  boolean test = false ; 
        try {
            String requete = "SELECT * FROM Simple WHERE username =? AND password =? ";
            PreparedStatement pst   = new MyConnection().cn.prepareStatement(requete);
            pst.setString(1, username);
            pst.setString(2,password);
          
            ResultSet rs = pst.executeQuery();
           
               while (rs.next()) {
               test=true ; 

       }  
   
        } catch (SQLException ex) {
            // System.out.println("fin"); 
            Logger.getLogger(servicesimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;}
     

 


 

  
@Override
    public List<simple> TrieParUsername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<simple> recherche(String Xusername) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<simple> afficher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<simple> userListe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}