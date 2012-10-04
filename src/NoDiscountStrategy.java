/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kraymond4
 */
public class NoDiscountStrategy implements DiscountStrategy
{
    private final double DISCOUNT = 0.0;

    @Override
    public double calculateDiscountPrice(double price) 
    {
        return price - (price * DISCOUNT);
    }
    
    
    
    
}
