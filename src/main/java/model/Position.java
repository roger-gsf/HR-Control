package model;

public class Position {

    private int positionId;
    private String positionName;
    private String positionDesc;

    public int getPositionId() {
        return positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public String getPositionDesc() {
        return positionDesc;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void setPositionDesc(String positionDesc) {
        this.positionDesc = positionDesc;
    }    
}
