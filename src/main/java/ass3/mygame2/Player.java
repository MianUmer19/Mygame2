package ass3.mygame2;


import java.util.ArrayList;


/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    
    private ArrayList<Item> playerItem;
    
    public Player()
    {
        playerItem = new ArrayList();
    }
    
    /**
    * Write a description of class Player here.
    *
    * @author  Umer and Sarmad 
    * @version #1
    * @date 27-09
        * @see (a version number or a date)
    */
    
       public void dropAllItems()
    {
        playerItem = new ArrayList();
        System.out.println("Oh man you emptied your basket");
    }
    
    public void addItemInventory(Item item){
        playerItem.add(item);
        System.out.println(item.getDescription() + " was taken ");
        //System.out.println(item.getDescription() + " was removed from the room"); // add extra information to inform user that the item has been taken
    }

    public void removeItemInventory(Item item){
        playerItem.remove(item);
        System.out.println(item.getName() + " was removed from your inventory");
    }
    
    public Item getPlayerItem(String stringItem){
        Item itemToReturn = null;
        for(Item item: playerItem){
            if(item.getName().contains(stringItem)){
                itemToReturn = item;
            }
        }
        return itemToReturn;
    }
    
    public String printAllInventory(){
         String returnString = "Items:";
        for(Item item : playerItem){
            returnString += " " + item.getName();           
        }
        return returnString;
    }

    
}
    