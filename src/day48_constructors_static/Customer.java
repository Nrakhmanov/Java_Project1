package day48_constructors_static;

public class Customer {
    private String name;
    private int id;

    public Customer() {
        System.out.println("No-args constructor");
        name = "new customer";
        id = -1;
    }

    public Customer(String name, int id){
        System.out.println("2-args constructor");
        this.name = name;
        this.id = id;
        //setName(name); --> if there any condition in SETTER we need to use SETTER all the time
        //setId(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


