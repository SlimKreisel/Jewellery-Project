/** C23727729 Khalid Roble**/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.io.EOFException;

public class DriverClass
{
    ArrayList<Jewellery>ice;

    public DriverClass()
    {
        ice = new ArrayList<Jewellery>();
        Scanner kreisel = new Scanner(System.in);
        if(readFile())
        {
            System.out.println("\n There is a list with the products");
        }
        else{
            System.out.println("\n There is no list with the products");
        }
        kreisel.nextLine();
        
        mainMenu();
        
    }

    public void testJewellery()
    {
        Necklace f = new Necklace(1000.0,7, "Flawless","carter", "Gold","circle","chain", 120.0);
        Necklace m = new Necklace(100.0,10, "Iceless","Hong", "Silver","square","matinee", 65.0);
        Necklace g = new Necklace(948.0, 3, "Silver Bang","Kreisel", "silver-golld","oval","choker", 529.0);
        ice.add(f);
        ice.add(m);
        ice.add(g);

        Ring k = new Ring(1100.0,15, "Bling","Fernado", "diamond","Engagament","chain", 35.0);
        Ring e = new Ring(18976.0,712, "Ringo","Quill", "Red-diamond","Wedding","chain", 14.0);
        Ring q = new Ring(16.0,22, "Marlo-Exclusive","Splack", "Yellow-diamond","Wedding","chain", 21.0);
        ice.add(k);
        ice.add(e);
        ice.add(q);
    }

    public void customerMenu() /**4	Customer Menu */
    {
        
        System.out.println("............MENU OF CUSTOMER...........");
        System.out.println("1. DISPLAY ALL NECKLACES..");
        System.out.println("2. DISPLAY ALL RINGS..");
        System.out.println("3. BUY NECKLACES..");
        System.out.println("4. BUY RINGS..");
        System.out.println("5. CLEANING JEWELLERY SERVICS..");
        System.out.println("6. EXIT CUSTOMER MENU.");
        System.out.println(" ");
        System.out.println("WHICH NUMBER FROM THE MENU DO YOU LIKE TO PRESS ?");
    }

    public void customerDisplayNeck() /**4.2	Display all Necklace for sale */
    {
       
        Necklace n;
        for(Jewellery mk: ice)
        {
            if(mk instanceof Necklace)
            {
                if( mk!=null)
                {   
                    n = (Necklace) mk;
                    System.out.println(mk.toString());

                }
                else
                {

                    System.out.println("there is no Necklace' items");
                }
            }

        }
    }

    public void customerDisplayRing() /**4.3	Display all Ring for for sale */
    {
       
        Ring r;

        for(Jewellery search: ice)
        {
            if(search instanceof Ring)
            {
                if( search!=null)
                {   
                    r = (Ring) search;
                    System.out.println(search.toString());

                }
                else
                {

                    System.out.println("there is no Necklace' items");
                }
            }

        }
    }

    public void buyNecklace() /**4.4	Buy Necklace */
    {
        System.out.println("\f");
        Necklace buyNeck;
        String name = "";
        String brand = "";
        String colour = "";
        String shapeNeck = "";
        String typeNeck = "";
        double sizeNeck = 0.0;
        int quantity = 0;
        boolean found = false;
        Scanner kreisel = new Scanner(System.in);
        /**4.1	Check if there no items before program started */
        if(ice.isEmpty())
        {
            System.out.println("There is no Necklace item in here");
            System.out.println("Sorry");
        }
        else
        {
            /**4.4.1	Input detail of item */
            System.out.println("Give me the name of the Necklace");
            name = kreisel.nextLine();
            System.out.println("Give me the brand name of the Necklace");
            brand = kreisel.nextLine();
            System.out.println("Give me the colour of the Necklace");
            colour = kreisel.nextLine();
            System.out.println("Give me the shape of the Necklace");
            shapeNeck = kreisel.nextLine();
            System.out.println("Give me the type of the Necklace");
            typeNeck = kreisel.nextLine();

            for(Jewellery buy: ice)
            {
                if(buy instanceof Necklace)
                {
                    buyNeck = (Necklace) buy;
                    /**4.4.1.1.1	Check if such item exist */
                    if(buyNeck.getName().equalsIgnoreCase(name) && buyNeck.getBrand().equalsIgnoreCase(brand)&& buyNeck.getColour().equalsIgnoreCase(colour) && buyNeck.getShapeOfNeck().equalsIgnoreCase(shapeNeck) && buyNeck.getTypeOfNeck().equalsIgnoreCase(typeNeck))
                    {
                        found = true;
                        System.out.println("Perfect");
                        /**4.4.2	Ask for quantity */
                        System.out.println("How many do you want ?");
                        quantity = kreisel.nextInt();
                        kreisel.nextLine();
                        if(buyNeck.getQuantity() < quantity) /**4.4.2.1.1	Check if such quantity is in stock */
                        {
                            System.out.println("WE DO NOT HAVE THAT MUCH IN STOCK! SORRY : ( ");
                        }
                        else
                        {
                            buyNeck.setQuantity(buyNeck.getQuantity() - quantity); /**4.4.4	Update stock level */
                            System.out.println("Your Transaction is successful"); /**4.4.3	Inform customer if their transaction was successful or not */
                        }
                    }

                }
            }
        }

        if (!found)
            System.out.println("that kind of Necklace does exist");

    }

    public void buyRing() /**4.5	 Buy Ring */
    {
        System.out.println("\f");
        Ring buyRing;
        String name = "";
        String brand = "";
        String colour = "";
        String shapeRing = "";
        String typeRing = "";
        double sizeRing = 0.0;
        int quantity = 0;
        boolean found = false;
        Scanner kreisel = new Scanner(System.in);
        if(ice.isEmpty())
        {
            System.out.println("There is no Ring item in here");
            System.out.println("Sorry");
        }
        else
        {
            /**4.5.1	Input details of item */
            System.out.println("Give me the name of the Ring");
            name = kreisel.nextLine();
            System.out.println("Give me the brand name of the Ring");
            brand = kreisel.nextLine();
            System.out.println("Give me the colour of the Ring");
            colour = kreisel.nextLine();
            System.out.println("Give me the shape of the Ring");
            shapeRing = kreisel.nextLine();
            System.out.println("Give me the type of the Ring");
            typeRing = kreisel.nextLine();
            for(Jewellery buy: ice)
            {
                if(buy instanceof Ring)
                {
                    buyRing = (Ring) buy;
                    /**4.5.1.1.1	Check if such item is in stock */
                    if(buyRing.getName().equalsIgnoreCase(name) && buyRing.getBrand().equalsIgnoreCase(brand) && buyRing.getColour().equalsIgnoreCase(colour)  && buyRing.getShapeOfRing().equalsIgnoreCase(shapeRing) && buyRing.getTypeOfRing().equalsIgnoreCase(typeRing))
                    {
                        found = true;
                        System.out.println("Perfect");
                        /**4.5.2	Ask for quantity. */
                        System.out.println("How many do you want ?");
                        quantity = kreisel.nextInt();
                        kreisel.nextLine();
                        if(buyRing.getQuantity() < quantity) /**4.5.2.1.1	Check if such quantity is in stock */
                        {
                            System.out.println("WE DO NOT HAVE THAT MUCH IN STOCK! SORRY : ( ");
                        }
                        else
                        {
                            buyRing.setQuantity(buyRing.getQuantity() - quantity); /**4.5.4	Update stock level */
                            System.out.println("Your Transaction is successful"); /**4.5.3	Inform customer if such quantity is in stock */
                            break;
                        }
                    }

                }
            }
        }
        if (!found)
            System.out.println("that kind of Ring does exist");
    }

    public void cleaningService() /**4.6	 Cleaning Service for Jewellery */
    {
        System.out.println("\f");
        String answer = "";
        String[] menuRing = {"Gemstone Revival Treatment", "Precious Metal Renewal", "Engraving Restoration Package"};
        Double[] priceRing = {250.00, 500.99, 150.12};

        String[] menuNeck = {"Delciate Chain Detox", "Pearl Rejuvenation Treatment", "Antique Necklace Revival"};
        Double[] priceNeck = {120.00, 380.00, 400.99};
        int selection = 0;

        Scanner kreisel = new Scanner(System.in);

        if(ice.isEmpty()) /**4.6.1	Check if items are in stock */
        {
            System.out.println("There are no Necklace & Rings in here");
            System.out.println("Sorry");
        }
        else
        {
            System.out.println("Welcome to the Cleaning Service from Kreisel-Jeweler-529");
            System.out.println(" ");

            do
            {

                System.out.println(" Which type of item is your jewellery ");/**4.6.2	Ask user which items type they would like to get clean */
                answer = kreisel.nextLine();
                if(answer.equalsIgnoreCase("Necklace"))
                {

                    for(int i=0; i <menuNeck.length; i++) /**4.6.3	Show Menu */
                    {
                        System.out.println((i+1)+". "+menuNeck[i]+"-"+"$"+priceNeck[i]);
                    }

                    do{
                        /**4.6.4	User will have a opportunity to pick a menu option */
                        System.out.println("Enter your menu number(1-"+menuNeck.length+")");
                        selection = kreisel.nextInt();
                        kreisel.nextLine();
                    }while(selection>3 && selection<0 );

                    switch(selection){ /**4.6.5	Payment will be displayed  */
                        case 1:
                            System.out.println("Your Transaction is successful");
                            System.out.println("Your Total is: "+priceNeck[0]+" $");
                            System.out.println("Thank you very much");
                            break;

                        case 2: 
                            System.out.println("Your Transaction is successful");
                            System.out.println("Your Total is: "+priceNeck[1]+" $");
                            System.out.println("Thank you very much");
                            break; 

                        case 3: 
                            System.out.println("Your Transaction is successful");
                            System.out.println("Your Total is: "+priceNeck[2]+" $");
                            System.out.println("Thank you very much");
                            break; 

                        default: System.out.println("Invalid selection");
                            System.out.println("Item not been found");
                            return ;
                    }

                }
                else if(answer.equalsIgnoreCase("Ring"))
                {
                    for(int i=0; i <menuRing.length; i++)
                    {
                        System.out.println((i+1)+". "+menuRing[i]+"-"+"$"+priceRing[i]);
                    }

                    do{
                        System.out.println("Enter your menu number(1-"+menuRing.length+")");
                        selection = kreisel.nextInt();
                        kreisel.nextLine();
                    }while(selection>3 && selection<0 );

                    switch(selection){
                        case 1:
                            System.out.println("Your Transaction is successful");
                            System.out.println("Your Total is: "+priceRing[0]+" $");
                            System.out.println("Thank you very much");
                            break;

                        case 2: 
                            System.out.println("Your Transaction is successful");
                            System.out.println("Your Total is: "+priceRing[1]+" $");
                            System.out.println("Thank you very much");
                            break; 

                        case 3: 
                            System.out.println("Your Transaction is successful");
                            System.out.println("Your Total is: "+priceRing[2]+" $");
                            System.out.println("Thank you very much");
                            break; 

                        default: System.out.println("Invalid selection");
                            System.out.println("Item not been found");
                            return ;
                    }

                }
                else
                    System.out.println("Please only answer the question with Necklace or Ring");

            }while(!answer.equalsIgnoreCase("Necklace") && (!answer.equalsIgnoreCase("Ring"))); 

        }
    }

    public void loopMenuCustomer()
    {
        System.out.println("\f");
        int number_menu = 0;
        Scanner kreisel = new Scanner(System.in);

        do{

            customerMenu();
            number_menu = kreisel.nextInt();
            kreisel.nextLine();

            switch(number_menu)
            {
                case 1:
                    customerDisplayNeck();
                    break;

                case 2:
                    customerDisplayRing();
                    break;

                case 3:
                    buyNecklace();
                    break;

                case 4:
                    buyRing();
                    break;

                case 5:
                    cleaningService();
                    break;

                case 6:
                    /**4.7	Exit Customer menu  */
                    //(); 
                    break;

                default: 
                    System.out.println(" YOU CAN ONLY PICK A NUMBER FROM 1-6");
                    System.out.println("PLEASE BEAR IN MIND");
                    System.out.println("     ");
                    System.out.println("     ");

                    break;
            }

        }  while(number_menu!=6);
    }

    public void staffMenu()/**5	Staff Menu */
    {
        System.out.println("\f");
        System.out.println("............MENU OF STAFF...........");
        System.out.println("1. ADD A NEW TYPE OF NECKLACE TO THE STOCK..");
        System.out.println("2. ADD A NEW TYPE OF RING TO THE STOCK....");
        System.out.println("3. UPDATE THE STOCK LEVEL FOR AN EXISTING NECKLACE OR RING..");
        System.out.println("4. EXIT CUSTOMER MENU..");
        System.out.println(" ");
        System.out.println("WHICH NUMBER FROM THE MENU DO YOU LIKE TO PRESS ?");
    }

    public boolean staffPassword() /**5.1	Log in with Password */
    {
        boolean correct =false;
        int attempts = 3;
        String inputP = "";
        final String  password = "Kreisel529";
        Scanner kreisel = new Scanner(System.in);
        /**5.1.1	Check if password is correct. User got three chances */
        do{
            System.out.println("Enter the password to use this section: ");
            inputP = kreisel.nextLine();

            if(inputP.equalsIgnoreCase(password))
            {
                System.out.println("The Password is correct ");

                correct = true;
            }
            else
            {
                attempts--;
                if(attempts>0)
                {
                    System.out.println("Unfortunately the password was incorrect. You still have "+attempts+" attempts do go");
                }
                else
                {
                    System.out.println("You have reach the maximum of attempts. Unfortunately we have to log you off !! ");

                }
            }

        }while(!correct && attempts!=0 );
        return correct ;
    }

    public void staffNewTypeNeck() /**5.2	Add new type of Necklace to the stock */
    {
        System.out.println("\f");
        String name = "";
        String brand = "";
        String colour = "";
        double price =0.0;
        int quantity = 0;
        String shapeNeck = "";
        String typeNeck = "";
        double sizeNeck = 0.0;

        Necklace newNeck;

        Scanner kreisel = new Scanner(System.in);

        System.out.println("Create a new type of Necklace ");

        System.out.println("Enter the name of the Necklace ");
        name = kreisel.nextLine();

        System.out.println("Enter the name  Brand of the Necklace ");
        brand = kreisel.nextLine();

        System.out.println("Enter the colour of the Necklace ");
        colour = kreisel.nextLine();

        System.out.println("How much should that necklace cost ");
        price = kreisel.nextDouble();
        kreisel.nextLine();

        System.out.println("How many of that necklace should be available");
        quantity = kreisel.nextInt();
        kreisel.nextLine();

        System.out.println("What shape should the Necklace have");
        shapeNeck = kreisel.nextLine();

        System.out.println("Which type should the Necklace have");
        typeNeck = kreisel.nextLine();

        System.out.println("What size do you want your necklace to have");
        sizeNeck = kreisel.nextDouble();

        newNeck = new Necklace(price,quantity,name,brand,colour,shapeNeck,typeNeck,sizeNeck);
        ice.add(newNeck);
        
         System.out.println("Neccklace is created. Thank you");
    }

    public void staffNewTypeRing()/**5.3	Add new type of Rings to the stock */
    {
        System.out.println("\f");
        String name = "";
        String brand = "";
        String colour = "";
        double price =0.0;
        int quantity = 0;
        String shapeRing = "";
        String typeRing = "";
        double sizeRing = 0.0;

        Ring newRing;

        Scanner kreisel = new Scanner(System.in);

        System.out.println("Create new type of Ring ");

        System.out.println("Enter the name of the Ring ");
        name = kreisel.nextLine();

        System.out.println("Enter the name  Brand of the Ring ");
        brand = kreisel.nextLine();

        System.out.println("Enter the colour of the Ring ");
        colour = kreisel.nextLine();

        System.out.println("How much should that Ring cost ");
        price = kreisel.nextDouble();
        kreisel.nextLine();

        System.out.println("How many of that Ring should be available");
        quantity = kreisel.nextInt();
        kreisel.nextLine();

        System.out.println("What shape should the Ring have");
        shapeRing = kreisel.nextLine();

        System.out.println("Which type should the Ring have");
        typeRing = kreisel.nextLine();

        System.out.println("What size do you want your Ring to have");
        sizeRing = kreisel.nextDouble();
        //System.out.println("What measure mesurement should that Necklace have ");

        newRing = new Ring(price,quantity,name,brand,colour,shapeRing,typeRing,sizeRing);
        ice.add(newRing);
        System.out.println("Ring is created. Thank you");
    }

    public void updateStockLevel()/**5.4	Update Stock level to Necklaces or Rings */
    {
        System.out.println("\f");
        String answer = "";
        String answerType = "";
        int quantity =0;
        String name = "";
        String brand = "";
        String colour = "";
        String shapeNeck = "";
        String typeNeck = "";
        boolean neckfound = false;
        Necklace updateNeck;

        Ring updateRing;
        String shapeRing = "";
        String typeRing = "";
        boolean ringfound = false;

        Scanner kreisel = new Scanner(System.in);
        /**5.4.1	User should pick Necklace or Ring */
        System.out.println("Hello, would u wish to update a stock for a existing items ? YES or NO");
        answer = kreisel.nextLine();

        if(answer.equalsIgnoreCase("yes"))
        {
            System.out.println("Perfect");
            System.out.println("Which item type do you wish to update the stock for");
            answerType = kreisel.nextLine();
            System.out.println(" ");
            if(answerType.equalsIgnoreCase("Necklace"))
            {
                System.out.println("Great");
                System.out.println(" ");

                System.out.println("WHat is the name of the Necklace ?");
                name = kreisel.nextLine();
                System.out.println("WHat is the brand name of the Necklace ?");
                brand = kreisel.nextLine();
                System.out.println("WHat is the colour of the Necklace ?");
                colour = kreisel.nextLine();
                System.out.println("Give me the shape of the Necklace");
                shapeNeck = kreisel.nextLine();
                System.out.println("Give me the type of the Necklace");
                typeNeck = kreisel.nextLine();
                for(Jewellery update: ice)
                {
                    if(update instanceof Necklace)
                    {
                        updateNeck = (Necklace) update;
                        /**5.4.2	Check for items */
                        if(updateNeck.getName().equalsIgnoreCase(name) && updateNeck.getBrand().equalsIgnoreCase(brand) && updateNeck.getColour().equalsIgnoreCase(colour) && updateNeck.getShapeOfNeck().equalsIgnoreCase(shapeNeck) && updateNeck.getTypeOfNeck().equalsIgnoreCase(typeNeck))
                        {
                            neckfound = true;
                            System.out.println("Perfect");
                            System.out.println("How many new stock should we deliver ?");
                            quantity = kreisel.nextInt();
                            kreisel.nextLine();

                            updateNeck.setQuantity(updateNeck.getQuantity() + quantity);
                            System.out.println("The new stock is updated");

                        }

                    }
                }
                if (!neckfound)
                    System.out.println("that kind of Necklace does exist");
            }

            else if(answerType.equalsIgnoreCase("Ring"))
            {
                System.out.println("Great");
                System.out.println(" ");

                System.out.println("Give me the name of the Ring");
                name = kreisel.nextLine();
                System.out.println("Give me the brand name of the Ring");
                brand = kreisel.nextLine();
                System.out.println("Give me the colour of the Ring");
                colour = kreisel.nextLine();
                System.out.println("Give me the shape of the Ring");
                shapeRing = kreisel.nextLine();
                System.out.println("Give me the type of the Ring");
                typeRing = kreisel.nextLine();
                for(Jewellery buy: ice)
                {
                    if(buy instanceof Ring)
                    {
                        updateRing = (Ring) buy;

                        if(updateRing.getName().equalsIgnoreCase(name) && updateRing.getBrand().equalsIgnoreCase(brand) && updateRing.getColour().equalsIgnoreCase(colour)&& updateRing.getShapeOfRing().equalsIgnoreCase(shapeRing) && updateRing.getTypeOfRing().equalsIgnoreCase(typeRing))
                        {
                            ringfound = true;
                            System.out.println("Perfect");
                            System.out.println("How many new stock should we deliver ?");
                            quantity = kreisel.nextInt();
                            kreisel.nextLine();
                            updateRing.setQuantity(updateRing.getQuantity() + quantity);
                            System.out.println("The new stock is updated");
                        }

                    }
                }
                if (!ringfound)
                    System.out.println("that kind of Ring does exist");
            }

        }
        else 
        {
            System.out.println("Sorry to hear");
            System.out.println("GoodBye");

        }

    }

    public void loopMenuStaff()
    {
        System.out.println("\f");
        int number_menu = 0;
        Scanner kreisel = new Scanner(System.in);
        System.out.println("\f");
        boolean correct = staffPassword();
        if(correct)
        {

            do{
                staffMenu();
                number_menu = kreisel.nextInt();
                kreisel.nextLine();

                switch(number_menu)
                {
                    case 1:
                        staffNewTypeNeck();
                        break;

                    case 2:
                        staffNewTypeRing();
                        break;

                    case 3:
                        updateStockLevel();
                        break;

                    case 4:
                        /**5.5	Exit Staff Menu */
                        break;

                    default: 
                        System.out.println(" YOU CAN ONLY PICK A NUMBER FROM 1-4");
                        System.out.println("PLEASE BEAR IN MIND");
                        System.out.println("     ");
                        System.out.println("     ");

                        break;
                }

            }  while(number_menu!=4);
        }
        else
            System.out.println("The Password is wrong");
    }

    public void mainMenu()
    {
        System.out.println("\f");
        int number_menu = 0;
        Scanner kreisel = new Scanner(System.in);

        do{
            System.out.println(".......Welcome........");
            System.out.println("Kreisel-Jeweler-529...........");
            System.out.println("1. Customer Menu..");
            System.out.println("2. Staff Menu(password protected)....");
            System.out.println("3. EXIT System..");

            System.out.println(" ");
            System.out.println("WHICH NUMBER FROM THE MENU DO YOU LIKE TO PRESS ?");
            number_menu = kreisel.nextInt();
            kreisel.nextLine();

            switch(number_menu)
            {
                case 1:
                    loopMenuCustomer();
                    break;

                case 2:
                    loopMenuStaff();
                    break;

                case 3:
                    System.out.println("Thank you for visiting  ");
                    System.out.println("I hope you have a nice day");
                    break;

                default: 
                    System.out.println(" YOU CAN ONLY PICK A NUMBER FROM 1-3");
                    System.out.println("PLEASE BEAR IN MIND");
                    System.out.println("     ");
                    System.out.println("     ");

                    break;
            }

        }  while(number_menu!=3);
        updateFile();
    }
    
    public void updateFile()
    {
        String comma = ",";
        try{
            ObjectOutputStream oOp= new ObjectOutputStream(new FileOutputStream("Jewellery.dat"));
            
            for(Jewellery jr: ice)
            {
                oOp.writeObject(jr);
            }
        }
        catch(EOFException e)
        {
            System.out.println("\n There is a big big problem with regarding saving your file    ");
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public boolean readFile()
    {
        ObjectInputStream file;
        int index = 0;
        Jewellery i;
        try{
            file = new ObjectInputStream(new FileInputStream("Jewellery.dat"));
            i = (Jewellery) file.readObject();
            index = 1;
            while(i!=null){
                ice.add(i);
                i = (Jewellery) file.readObject();
                
            }
            file.close();
            return true;
           
        }
        catch(IOException e)
        {
            if(index>0)
            {
                return true;
                
            }
            else
            return false;
        }
        catch(ClassNotFoundException e)
        {
            return false;
        }
    }
    

    public static void main(String[]args)
    {
        System.out.println("\f");
        new DriverClass();
       
    }
    

}
