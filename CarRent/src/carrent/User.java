/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrent;


public class User {
    private String brandname;
    private String modelno;
    private String status;
    private int price;
    
    public  User(String BrandName , String ModelNo, String Status, int Price){
        this.brandname = BrandName;
        this.modelno = ModelNo;
        this.status = Status;
        this.price = Price;
    }

    User(String aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getBrandname(){
    return brandname;
}
    public String getModelNo(){
        return modelno;
    }
    public String getStatus(){
        return status;
    }
    public int getPrice(){
        return price;
    }
    
}
