package day45_OOP;

public class Coffee {
    double amount;
    String type;

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill(){
        amount = 100;
    }

    public void drink(int someAmount) {
        if(amount>someAmount){
            amount -= someAmount;
        }else{
            System.out.println("invalid amount");
        }

    }
     public double getAmount(){
        return amount;
     }

     public void setType(String newType){
        type = newType;
     }

    public String getType() {
        return type;
    }
}
