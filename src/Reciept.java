/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle Raymond
 */
public class Reciept 
{
    private Customer customer;
    private final String VENDOR_NAME = "Walmartopialand";
    private LineItem[] itemsSelected = new LineItem[1];
    
    
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public String getVendor()
    {
        return VENDOR_NAME;
    }
    
    public void setItemsSelected(LineItem item)
    {
        itemsSelected[0] = item;
        
    }
    
    public void addToItemsSelected(LineItem item)
    {
        LineItem[] tempItems = new LineItem[itemsSelected.length + 1];
        System.arraycopy(itemsSelected, 0, tempItems, 0, itemsSelected.length);
        tempItems[itemsSelected.length] = item;
        itemsSelected = tempItems;
    }
    
    

}
