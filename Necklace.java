/** C23727729 Khalid Roble**/
/** 2	Create Subclass Necklace */
public class Necklace extends Jewellery
{
    private String shapeOfNeck;
    private String typeOfNeck;
    private double sizeOfNeck;
    /**2.1	Create standard operations. */
    public Necklace()
    {
        super();
        this.shapeOfNeck = "";
        this.typeOfNeck = "";
        this.sizeOfNeck = 0.0;
        
    }
    
    public Necklace(double price,int quantity, String name,String brand, String colour, boolean measure_clarity,String shapeOfNeck, String typeOfNeck, double sizeOfNeck)
    {
        super(price, quantity, name, brand, colour, measure_clarity);
        this.shapeOfNeck = shapeOfNeck;
        this.typeOfNeck = typeOfNeck;
        this.sizeOfNeck = sizeOfNeck;
    }
    
     public Necklace(double price,int quantity, String name,String brand, String colour,String shapeOfNeck, String typeOfNeck, double sizeOfNeck)
    {
        super(price, quantity, name, brand, colour);
        this.shapeOfNeck = shapeOfNeck;
        this.typeOfNeck = typeOfNeck;
        this.sizeOfNeck = sizeOfNeck;
        
    }
    
    public String getShapeOfNeck()
    {
        return this.shapeOfNeck;
    }
    
    public String getTypeOfNeck()
    {
        return this.typeOfNeck;
    } 
    
    public double getSizeOfNeck()
    {
        return this.sizeOfNeck;
    }
    
    public void setShapeOfNeck(String shapeOfNeck)
    {
        this.shapeOfNeck = shapeOfNeck;
    }
    
    public void setTypeOfNeck(String typeOfNeck)
    {
        this.typeOfNeck = typeOfNeck;
    }
    
      public void setSizeOfNeck(double sizeOfNeck)
    {
        this.sizeOfNeck = sizeOfNeck;
    }
    
    public String toString()
   {
       return "-----------------------------------------------------"+ "\n"+
               "Necklace: "+ "\n\n" + super.toString()+
              " The shape of the Necklace is : "+this.shapeOfNeck+ "\n\n"+
              " The type of the Necklace is : "+this.typeOfNeck+ "\n\n"+
              " The size of the Necklace is : "+this.sizeOfNeck+ " cm"+"\n\n";
    }
}