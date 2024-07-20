package controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Position;
import model.PositionDAO;

public class PositionController {

    private PositionDAO positionDAO;

    public PositionController() {
        this.positionDAO = new PositionDAO();
    }

    public boolean addPosition(String positionName, String positionDesc) throws SQLException {
        if (positionName.isEmpty() || positionDesc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please, fill all the fields.");
            return false;
        } else {
            Position position = new Position();
            position.setPositionName(positionName);
            position.setPositionDesc(positionDesc);

            positionDAO.addPosition(position);
            JOptionPane.showMessageDialog(null, "Position registrated successfully!");
            return true;
        }
    }

    public List<Position> searchPositionByName(String name) throws SQLException {
        return positionDAO.searchPositionByName(name);
    }

    public void updatePosition(Position position) throws SQLException {
        positionDAO.updatePosition(position);
    }

    public void deletePosition(int positionId) throws SQLException {
        positionDAO.deletePosition(positionId);
    }
}
