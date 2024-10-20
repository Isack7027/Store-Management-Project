public class Dish {
private String name;
private double price;
private int amount;


public Dish(){
  name = "Korean Cuisine";
  price = 15.98;
  amount = 1;  
}

public Dish(String name, double price, int amount){
  this.name = name;
this.price = price;
this.amount = amount;
}

  public String getName(){
  return name;
}
public double getPrice(){
 return price;
}
public int getAmount(){
return amount;
}




public void setName(String newName)  {
  name = newName;
}


public void setPrice(double newPrice)   {
    price = newPrice;
}


  public void setAmount(int newAmount)   {
  amount = newAmount;
  }

  public String toString() {
    return "Name: " + name + "\nPrice: " + price + "\nAmount: " + amount;
  }









  
}