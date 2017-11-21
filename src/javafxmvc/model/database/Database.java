package javafxmvc.model.database;

import java.sql.Connection;

/**
 *
 * @author mateus_de-oliveira
 */
public interface Database {

    public Connection conectar();

    public void desconectar(Connection conn);

}
