/** C23727729 Khalid Roble**/
/**3	Create Subclass Ring */
public class Ring extends Jewellery
{
    private String shapeOfRing;
    private String typeOfRing;
    private double sizeOfRing;
    /**3.1	Create standard operations. */
    public Ring()
    {
        super();
        this.shapeOfRing = "";
        this.typeOfRing = "";
        this.sizeOfRing = 0.0;
        
    }
    
    public Ring(double price,int quantity, String name,String brand, String colour, boolean measure_clarity,String shapeOfRing, String typeOfRing, double sizeOfRing)
    {
        super(price, quantity, name, brand, colour, measure_clarity);
        this.shapeOfRing = shapeOfRing;
        this.typeOfRing = typeOfRing;
        this.sizeOfRing = sizeOfRing;
    }
    
    public Ring(double price,int quantity, String name,String brand, String colour,String shapeOfRing, String typeOfRing, double sizeOfRing)
    {
        super(price, quantity, name, brand, colour);
        this.shapeOfRing = shapeOfRing;
        this.typeOfRing = typeOfRing;
        this.sizeOfRing = sizeOfRing;
    }
    
    public String getShapeOfRing()
    {
        return this.shapeOfRing;
    }
    
    public String getTypeOfRing()
    {
        return this.typeOfRing;
    } 
    
    public double getSizeOfRing()
    {
        return this.sizeOfRing;
    }
    
    public void setShapeOfRing(String shapeOfRing)
    {
        this.shapeOfRing = shapeOfRing;
    }
    
    public void setTypeOfRing(String typeOfRing)
    {
        this.typeOfRing = typeOfRing;
    }
    
      public void setSizeOfRing(double sizeOfRing)
    {
        this.sizeOfRing = sizeOfRing;
    }
    
    public String toString()
   {
       return  "-----------------------------------------------------"+ "\n"+
               "Ring: "+ "\n\n" + super.toString()+
              " The shape of the Ring is : "+this.shapeOfRing+ "\n\n"+
              " The type of the Ring is : "+this.typeOfRing+ "\n\n"+
              " The size of the Ring is : "+this.sizeOfRing+ " mm"+"\n\n";
    }
}