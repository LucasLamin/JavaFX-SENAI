package javafxmvc.model.database;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mateus_de-oliveira
 */
public class TextaConexao {

    public static void main(String[] args) throws SQLException {
        try (Connection connection = new DatabaseMySQL().conectar()) {
            System.out.println("Conexão aberta!");

        }
    }
}
