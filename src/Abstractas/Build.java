package Abstractas;

/**
 *
 * @author AA
 */
public abstract class Build {
    private String _buildingType;
    private int _buildingFloor;
    private String _elevator;
    private String _costumer;
    private String _enterprise;
    private String _architect;
    
    
    public Build(){
    }
    
    
    public Build(String buildingType, int buildingFloor, String elevator, String costumer, String enterprise, String architect){
        this._buildingType = buildingType;
        this._buildingFloor = buildingFloor;
        this._elevator = elevator;
        this._costumer = costumer;
        this._enterprise = enterprise;
        this._architect = architect;
    }
    
    
    public abstract String Date();
    
    
    public String GetBuildingType(){
        return _buildingType;
    }
    public void SetBuildingType(String buildingType){
        this._buildingType = buildingType;
    }
    
    public int GetBuildingFloor(){
        return _buildingFloor;
    }
    public void SetBuildingFloor(int buildingFloor){
        this._buildingFloor = buildingFloor;
    }
    
    public String GetElevator(){
        return _elevator;
    }
    public void SetElevator(String elevator){
        this._elevator = elevator;
    }
    
    public String GetCostumer(){
        return _costumer;
    }
    public void SetCostumer(String costumer){
        this._costumer = costumer;
    }
    
    public String GetEnterprise(){
        return _enterprise;
    }
    public void SetEnterprise(String enterprise){
        this._enterprise = enterprise;
    }
    
    public String GetArchitect(){
        return _architect;
    }
    public void SetArchitect(String architect){
        this._architect = architect;
    }
}
