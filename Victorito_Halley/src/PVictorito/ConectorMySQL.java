package PVictorito;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectorMySQL {
    public Connection Conectar(){
        Connection conet=null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conet=DriverManager.getConnection("jdbc:mysql://localhost/registro","root","");
        }catch (Exception e){
            
        }
        
        return conet;
    }
    
}
