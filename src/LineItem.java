/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle Raymond
 */
public class LineItem 
{
    private Product product;
    private int quantity;
    
    
    
    
    
    
    public void setProduct(Product product)
    {
        //needs validation
        this.product = product;
    }
    
    public Product getProduct()
    {
        return product;
    }
    
    public void setQuantity(int quantity)
    {
        //needs validation, cannot be 0 or lower;
        this.quantity = quantity;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public double getSubtotal()
    {
        return (getQuantity() *  getProduct().getDiscountStrategy().calculateDiscountPrice((getProduct().getPrice())));
    }
    
    
}
