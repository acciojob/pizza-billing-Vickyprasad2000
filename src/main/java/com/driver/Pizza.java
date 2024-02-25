package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg = true;
    private String bill;
    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean paperBagAdded = false;
    private int paperBagPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            this.price = 300;
        else
            this.price = 400;
        this.bill = "Base Price of Pizza: "+ this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded)
        {
            this.price += 80;
            extraCheeseAdded = true;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }


    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded)
        {
            if(isVeg)
            {
                this.price += 70;
                this.bill += "Extra Toppings Added: 70\n";
            }
            else
            {
                this.price += 120;
                this.bill += "Extra Toppings Added: 120\n";
            }
            extraToppingsAdded = true;

        }
    }
    public void addTakeaway(){
        // your code goes here
        if(!paperBagAdded)
        {
           paperBagAdded = true;
            this.price += 20;
            this.bill += "Paper Bag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: " + this.price ;
        return this.bill;
    }
}
