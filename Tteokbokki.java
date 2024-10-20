public class Tteokbokki extends Dish{
  private String flavor;

public Tteokbokki(){
  flavor = "spicy";
}


public Tteokbokki(String name, double price, int amount, String flavor){
  super(name, price, amount);
  this.flavor = flavor;
  
} 

  public String flavor(){
    return flavor;
  }


public void setFlavor(String newFlavor)  {
  flavor = newFlavor;
}


public String toString () {
  return super.toString() + "\nFlavor" + flavor;
}

  
}