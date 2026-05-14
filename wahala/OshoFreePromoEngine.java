public class OshoFreePromoEngine {
    public static int getDiscountPercentageAmount(double amount){
    
    if (amount < 5000)
        return 0;
    else if (amount < 15_000.00)
        return 10;
     else if (amount < 30_000)
        return 20;
        
     else
        return 35;
    
    
    
    }
    
   
   
    public static boolean isValidPromoCode(String promoCode) {
        switch(promoCode.toUpperCase()) {

            case "STARTER10":
            case "BIGBOY20":
            case "OSHOFREE35":
                return true;
            default:
                return false;
        }
    
    }
    
    
    public static double getFinalCartPrice(double cartTotal, String promoCode) {
        if(cartTotal < 0)
            throw new IllegalArgumentException("Invalid Amount");

        boolean isValidPromoCode = isValidPromoCode(promoCode);
        if(!isValidPromoCode)
            return cartTotal;

        int discountPercentage = getDiscountPercentageAmount(cartTotal);
        double discount = cartTotal * discountPercentage / 100;

        return cartTotal - discount;
    }
    }
