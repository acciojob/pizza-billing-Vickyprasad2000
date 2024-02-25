package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private String bill;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;
    private final int paperBagPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            this.price = 300;
        else
            this.price = 400;
        this.bill = "Base price of Pizza: " + this.price + "\n";
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
            this.bill += "Extra Cheese Added:" + this.price + "\n";
        }
    }
    public int getCheese()
    {
        return this.price;
    }


    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded)
        {
            if(isVeg)
            {
                this.price += 70;
                this.bill += "70\n";
            }
            else
            {
                this.price += 120;
                this.bill += "120\n";
            }
            extraToppingsAdded = true;
            this.bill += "Extra Toppings Added:" + this.price + "\n";
        }
    }
    public int getTopping()
    {
        return this.price;
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBagAdded)
        {
            paperBagAdded = true;
            this.price += paperBagPrice;
            this.bill += "Paper Bag Added: "+ this.price + "\n";
        }
    }
    public int getPaperBagPrice()
    {
        return this.paperBagPrice;
    }

    public String getBill(){
        // your code goes here
        this.bill = "Base Price Of The Pizza: " + this.getPrice() + "Extra Cheese Added: "+ this.getCheese()+ "Extra Toppings Added: "+ this.getTopping() + "Paper bag added: "+ this.getPaperBagPrice()+ this.bill + "Total Price: " + this.price ;
        return this.bill;
    }
}
