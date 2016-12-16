package restaurant;

import model.Cocinero;
import persistence.RestaurantJDBC;

import java.sql.SQLException;

public class Restaurant {

    public static void main(String[] args) {
        RestaurantJDBC gestor = new RestaurantJDBC();
        try {
            System.out.println("Estableciendo conexión con la bbdd...");
            gestor.conectar();
            System.out.println("Conectado a la bbdd restaurant");
            Cocinero a = new Cocinero("Ferran Adria", "888888888", "hombre", 56, 22, "Platos principales");
            gestor.insertCocinero(a);
            System.out.println("Cocinero dado de alta.");
            gestor.desconectar();
            System.out.println("Cerrada la conexión con la bbdd.");
        } catch (SQLException ex) {
            System.out.println("Error con la BBDD: "+ex.getMessage());
        }
    }
}
