package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class PositionDAO {

    public void addPosition(Position position) throws SQLException {
        String sql = "INSERT INTO Cargos (position_name, position_desc) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, position.getName());
            stmt.setString(2, position.getDesc());
            stmt.executeUpdate();
        }
    }

    public List<Position> searchPositionByName(String positionName) throws SQLException {
        String sql = "SELECT * FROM positions WHERE positionName LIKE ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + positionName + "%");
            ResultSet rs = stmt.executeQuery();

            List<Cargo> positions = new ArrayList<>();
            while (rs.next()) {
                Position position = new Position();
                position.setId(rs.getInt("id"));
                position.setNome(rs.getString("positionName"));
                position.setDescricao(rs.getString("positionDesc"));
                position.add(position);
            }
            return positions;
        }

    }

    public void updatePosition(Position position) throws SQLException {
        String sql = "UPDATE positions SET positionName = ?, positionDesc = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, position.getNome());
            stmt.setString(2, position.getDescricao());
            stmt.setInt(3, position.getId());
            stmt.executeUpdate();
        }
    }

    public void deletePosition(int id) throws SQLException {
        String sql = "DELETE FROM Positions WHERE id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
