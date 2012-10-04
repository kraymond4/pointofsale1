/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle Raymond
 */
public class Product 
{
    private String productId;
    private String productName;
    private double price;
    private DiscountStrategy discount;
    
    public Product(String id, String name, double cost, DiscountStrategy discount)
    {
        setProductId(id);
        setProductName(name);
        setPrice(cost);
        setDiscountStrategy(discount);
    }
    
    public final void setProductId(String productId)
    {
        //needs validation
        this.productId = productId;
    }
    
    public final String getProductId()
    {
        return productId;
    }
    
    public final void setProductName(String productName)
    {
        //needs validation
        this.productName = productName;
    }
    
    public final String getProductName()
    {
        return productName;
    }
    
    public final void setPrice(double price)
    {
        //needs validation
        this.price = price;
    }
    
    public final double getPrice()
    {
        return price;
    }
    
    public final void setDiscountStrategy(DiscountStrategy discount)
    {
        //needs validation
        this.discount = discount;
    }
    
    public final DiscountStrategy getDiscountStrategy()
    {
        return discount;
    }
    
}
