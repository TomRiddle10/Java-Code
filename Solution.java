class TravelAgenics{
    private int regno;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    TravelAgenics(int regno,String agencyName, String packageType, int price,boolean flight){
        this.regno=regno;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.flightFacility=flight;
    }

    int getregNo(){
        return this.regno;
    }
    void setregno(int r){
        this.regno=r;
    }

    String getagencyName(){
        return this.agencyName;
    }
    void setagencyName(String a){
        this.agencyName=a;
    }

    String getpackageType(){
        return this.packageType;
    }
    void setpackageType(String p){
        this.agencyName=p;
    }

    int getPrice(){
        return this.price;
    }
    void setprice(int pp){
        this.price=pp;
    }

    boolean isFlight(){
        return this.flightFacility;
    }
}
public class Solution {
public static void main(String[] args) {
    
}    
}
