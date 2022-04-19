package shapes;

public class Customer extends Person {
    private int balance;
    public Customer(String name, int age, int balance){
        super(name, age);
        this.balance = balance;
    }
    public void setBalance(){
    }
    public int getBalance(){
        return balance;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Balance: " + balance);
    }
}