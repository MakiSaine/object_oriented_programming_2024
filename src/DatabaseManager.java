import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/historiske_gjenstander";
    private static final String USER = "brukernavn";
    private static final String PASSWORD = "passord";
    private Connection connection;

    public DatabaseManager() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertPerson(Person person) {
        String sql = "INSERT INTO personer (id, navn, telefonnummer, epost) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, person.getId());
            statement.setString(2, person.getNavn());
            statement.setString(3, person.getTelefonnummer());
            statement.setString(4, person.getEpost());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertMuseum(Museum museum) {
        String sql = "INSERT INTO museer (id, navn, sted) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, museum.getId());
            statement.setString(2, museum.getNavn());
            statement.setString(3, museum.getSted());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertFunngjenstand(Funngjenstand funn) {
        String sql = "INSERT INTO funn (id, type, koordinater, person_id, dato, arstall, museum_id, egenskaper) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, funn.getId());
            statement.setString(2, funn.getType());
            statement.setString(3, funn.getKoordinater());
            statement.setInt(4, funn.getPersonId());
            statement.setString(5, funn.getDato());
            statement.setInt(6, funn.getArstall());
            statement.setObject(7, funn.getMuseumId() == null ? null : funn.getMuseumId());
            statement.setString(8, funn.getEgenskaper());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
