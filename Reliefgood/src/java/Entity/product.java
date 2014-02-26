/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author kendrick
 */
public class product {
    private String SellerName;
    private String dessertName;
    private String category;
    private Boolean isFeatured;
    private int price;
    private String description;
    private String dessertpic;
    
    public product(){
        
    }
    /**
     * @return the SellerName
     */
    public String getSellerName() {
        return SellerName;
    }

    /**
     * @param SellerName the SellerName to set
     */
    public void setSellerName(String SellerName) {
        this.SellerName = SellerName;
    }

    /**
     * @return the dessertName
     */
    public String getDessertName() {
        return dessertName;
    }

    /**
     * @param dessertName the dessertName to set
     */
    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the isFeatured
     */
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    /**
     * @param isFeatured the isFeatured to set
     */
    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the dessertpic
     */
    public String getDessertpic() {
        return dessertpic;
    }

    /**
     * @param dessertpic the dessertpic to set
     */
    public void setDessertpic(String dessertpic) {
        this.dessertpic = dessertpic;
    }
    
    
}
