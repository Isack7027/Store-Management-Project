public class Naengmyeon extends Dish {
private String size;


  public Naengmyeon(){
    size = "large";
  }

public Naengmyeon(String name, double price, int amount, String size){
  super(name, price, amount);
  this.size = size;
  
}


public String size(){
  return size;
}


public void setSize(String newSize)  {
  size = newSize;
}  
  

public String toString() {
  return super.toString() + "\nSize" + size;
}

  

}