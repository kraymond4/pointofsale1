/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle Raymond
 */
public class Customer 
{
    private String customerId;
    
    public Customer(String id)
    {
        setCustomerId(id);
    }
    
    public final void setCustomerId(String customerId)
    {
        //needs validation
        this.customerId = customerId;
    }
    
    public final String getCustomerId()
    {
        return customerId;
    }
    
}
