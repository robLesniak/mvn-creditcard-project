package pl.rlesniak.creditcard;

import org.junit.Assert;

import org.junit.Test;


public class CreditCardTest{
    
    @Test
    public void allowAssignLimitToCard(){
        
        CreditCard card = new CreditCard();
        
        card.assignLimit(2000.0);
        Assert.assertTrue(card.getLimit() == 2000.0);
    }
    
}