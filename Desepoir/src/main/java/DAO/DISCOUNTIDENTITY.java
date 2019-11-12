package DAO;

public class DISCOUNTIDENTITY {
    public String lettre;
    public float taux;
    public DISCOUNTIDENTITY(String a ,float b){
        lettre=a;
        taux=b;
       
    }
    
    public String getDiscount_code(){
        return lettre;
    }
    
    public float gettaux(){
        return taux;
        
    }
}
