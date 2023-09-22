import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

//        Paciente paciente = new Paciente(1,
//                                      "João",
//                                     "14102004",
//                                     "M",
//                                   "Rua A",
//                                     "Cidade X",
//                                    12345678901L,
//                                       "UBS Centro");
//
//        System.out.println(paciente.getDtNasc());


        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = null;

        connection = databaseConnection.StartConnection(connection);

        System.out.println("Connection opened: " + connection);
    }
}
