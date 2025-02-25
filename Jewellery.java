/** C23727729 Khalid Roble**/
import java.io.*;
/**1.	Create Superclass Jewellery.  */
public class Jewellery implements Serializable
{
    /** 1.1	Create standard operations. */
    private double price;
    private int quantity;
    private String name;
    private String brand;
    private String colour;
    private boolean measure_clarity;

    public Jewellery()
    {
        this.price= 0.0;
        this.quantity= 0;
        this.name = "";
        this.brand = "";
        this.colour= "";
        this.measure_clarity = false;

    }

    public Jewellery(double price,int quantity, String name,String brand, String colour)
    {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.brand = brand;
        this.colour = colour;
        this.measure_clarity = false;
    }

    public Jewellery(double price,int quantity, String name,String brand, String colour, boolean measure_clarity)
    {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.brand = brand;
        this.colour = colour;
        this.measure_clarity = measure_clarity;
    }

    public double getPrice()
    {
        return this.price;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public String getName()
    {
        return this.name;
    }

    public String getBrand()
    {
        return this.brand;
    }

    public String getColour()
    {
        return this.colour;
    }

    public boolean getMeasure()
    {
        return this.measure_clarity;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }
    
    /**public void stock()
    {
        if(quantity==0)
        {
            
            System.out.println("Sorry there is no more stocks left from that particular item");
        }
        else
        {
            
            System.out.println("Your items/'s is successfully bought");
        }
    } */
    

    public String toString()
    {
        String sentence;

        sentence ="The name is: " +this.name+ "\n\n" +
        "The brand is: "+this.brand+ "\n\n" +
        "The Colour is: "+this.colour+ "\n\n" +
        "The Price is: "+this.price+ " $"+"\n\n" +
        "The Quantity: "+ this.quantity+ "\n\n"; 
        if( this.price > 1000.0) 
        {
            sentence = sentence + "The measurement is VVS"+ "\n\n";
            measure_clarity = true;
        }
        else{
                sentence = sentence + "The measurement is VS"+ "\n\n";
                
            }
        return sentence;

    }
}