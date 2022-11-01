public class Item {
    private double price;
    private String department, name, id;
    public Item(String n, double p, String d, String i){
        name = n;
        price = p;
        department = d;
        id = i;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getDepartment(){
        return department;
    }

    public String getID(){
        return id;
    }

    public String toString(){
        return name + " was bought. It costs $" + price + ".";
    }
}
