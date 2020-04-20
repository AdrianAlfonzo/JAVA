package Clases;
import Abstractas.Build;
import Interfaces.DrawBuilding;
import Interfaces.DrawTerrain;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author AA
 */
public class Building extends Build implements DrawBuilding, DrawTerrain{
    private double _area;
    private double _height;
    private double _perimeter;
    private double _scale;
    private double _base;
    
    
    public Building(double area, double height, double perimeter, double scale, String buildingType, int buildingFloor, String costumer, String architect){
        super(buildingType, buildingFloor, costumer, costumer, architect, architect);
        this._area = area;
        this._perimeter = perimeter;
        this._height = height;
        this._scale = scale;
    }
    
    
    @Override
    public String Date() {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MMM/dd");
        return dateFormat.format(today);
    }

    @Override
    public  double PerimeterBuilding(double aSide, double bSide, double cSide, double dSide){
       return (aSide*bSide) + (bSide*cSide) + (cSide*dSide) + (dSide*aSide);
    }

    @Override
    public  double ScaleBuilding(double scale){
      return Math.round(((scale*10)*100)/100);
    }

    @Override
    public  double HeightBuilding(double aSide, double bSide){
       return Math.round(((aSide/bSide)*100)/100);
    }

    @Override
    public  double AreaBuilding(double base, double height){
        return Math.round(((base*height)*100)/100);
    }

    
    public double GetArea(){
        return _area;
    }
    public void SetArea(double area){
        this._area = area;
    }

    public double GetHeight(){
        return _height;
    }
    public void SetHeight(double height){
        this._height = height;
    }
    
    public double GetPerimeter(){
        return _perimeter;
    }
    public void SetPerimeter(double perimeter){
        this._perimeter = perimeter;
    }

    public double GetScale(){
        return _scale;
    }
    public void SetScale(double scale){
        this._scale = scale;
    }

    public double GetBase(){
        return _base;
    }
    public void SetBase(double base){
        this._base = base;
    }
}
