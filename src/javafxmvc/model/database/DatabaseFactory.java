package javafxmvc.model.database;

/**
 *
 * @author mateus_de-oliveira
 */
public class DatabaseFactory {
    public static Database getDatabase(String nome){
        if (nome.equals("postgresql")){
            return new DatabasePostgreSQL(); 
        }else if (nome.equals("mysql")){
            return new DatabaseMySQL();
        }
            return null;
    }
    
}
