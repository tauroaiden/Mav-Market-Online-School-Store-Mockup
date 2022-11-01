import java.util.List;
import java.util.ArrayList;
public class ShoppingCart {
    private double taxRates [] = {0.04, 0.00, 0.056, 0.065, 0.075, 0.029, 0.0635, 0.00, 0.0575, 0.06, 0.04, 0.04, 0.06, 0.0625, 0.07, 0.06, 0.065, 0.06, 0.04, 0.055, 0.06, 0.0625, 0.06, 0.0688, 0.07, 0.0423, 0.00, 0.055, 0.0685, 0.00, 0.07, 0.0513, 0.04, 0.0475, 0.05, 0.0575, 0.045, 0.00, 0.06, 0.06, 0.07, 0.06, 0.04, 0.07, 0.0625, 0.0595, 0.06, 0.053, 0.065, 0.06, 0.05, 0.04};
    private List<Item> shoppingCart;
    public ShoppingCart(){
        shoppingCart = new ArrayList<Item>();
    }

    public void buyItem(String s, int n){
        if(s.equalsIgnoreCase("Orange Crush")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Orange Crush", 17.50, "Merchandise", "010101"));
            }
        }
        else if(s.equalsIgnoreCase("Blue Mav Tee")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Blue Mav Tee", 14.25, "Merchandise", "010102"));
            }
        }
        else if(s.equalsIgnoreCase("Blue Sleeve")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Blue Sleeve", 20.75, "Merchandise", "010201"));
            }
        }
        else if(s.equalsIgnoreCase("Orange Fog Sleeve")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Orange Fog Sleeve", 18.50, "Merchandise", "010202"));
            }
        }
        else if(s.equalsIgnoreCase("Black Sleeve")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Black Sleeve", 20.75, "Merchandise", "010203"));
            }
        }
        else if(s.equalsIgnoreCase("Split Orange Crush")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Split Orange Crush", 18.25, "Merchandise", "010302"));
            }
        }
        else if(s.equalsIgnoreCase("Blue Aeros")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Blue Aeros", 16.25, "Merchandise", "010301"));
            }
        }
        else if(s.equalsIgnoreCase("Monogrammed Marvin Perch")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Monogrammed Marvin Perch", 32.25, "Merchandise", "010401"));
            }
        }
        else if(s.equalsIgnoreCase("Blue Marvin Genero")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Blue Marvin Genero", 24.75, "Merchandise", "010402"));
            }
        }
        else if(s.equalsIgnoreCase("Marvin Joggers")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Marvin Joggers", 27.50, "Merchandise", "010501"));
            }
        }
        else if(s.equalsIgnoreCase("Zip-Up Joggers")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Zip-Up Joggers", 29.75, "Merchandise", "010502"));
            }
        }
        else if(s.equalsIgnoreCase("Orange Crush Sweatpants")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Orange Crush Sweatpants", 21.25, "Merchandise", "010503"));
            }
        }
        else if(s.equalsIgnoreCase("Blue JJ Sweatpants")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Blue JJ Sweatpants", 23.25, "Merchandise", "010504"));
            }
        }
        else if(s.equalsIgnoreCase("Marvin Black Tights")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Marvin Black Tights", 18.75, "Merchandise", "010505"));
            }
        }
        else if(s.equalsIgnoreCase("Pack of 12 Pencils")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Pack of 12 Pencils", 4.99, "Supplies", "020101"));
            }
        }
        else if(s.equalsIgnoreCase("Pack of 24 Pencils")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Pack of 24 Pencils", 7.99, "Supplies", "020102"));
            }
        }
        else if(s.equalsIgnoreCase("Pack of 36 Pencils")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Pack of 36 Pencils", 9.99, "Supplies", "020103"));
            }
        }
        else if(s.equalsIgnoreCase("Pack of 48 Pencils")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Pack of 48 Pencils", 12.99, "Supplies", "020104"));
            }
        }
        else if(s.equalsIgnoreCase("Pack of 10 Pens")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Pack of 10 Pens", 8.75, "Supplies", "020201"));
            }
        }
        else if(s.equalsIgnoreCase("Pack of 30 Pens")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Pack of 30 Pens", 12.25, "Supplies", "020202"));
            }
        }
        else if(s.equalsIgnoreCase("Pack of 12 Markers")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Pack of 12 Markers", 8.85, "Supplies", "020301"));
            }
        }
        else if(s.equalsIgnoreCase("Pack of 24 Markers")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Pack of 24 Markers", 14.25, "Supplies", "020302"));
            }
        }
        else if(s.equalsIgnoreCase("Blue Folder")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Blue Folder", 4.99, "Supplies", "020401"));
            }
        }
        else if(s.equalsIgnoreCase("Red Folder")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Red Folder", 4.99, "Supplies", "020403"));
            }
        }
        else if(s.equalsIgnoreCase("Green Folder")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Green Folder", 4.99, "Supplies", "020402"));
            }
        }
        else if(s.equalsIgnoreCase("Yellow Folder")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Yellow Folder", 4.99, "Supplies", "020404"));
            }
        }
        else if(s.equalsIgnoreCase("1-inch Binder")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("1-inch Binder", 5.99, "Supplies", "020501"));
            }
        }
        else if(s.equalsIgnoreCase("1.5-inch Binder")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("1.5-inch Binder", 6.49, "Supplies", "020502"));
            }
        }
        else if(s.equalsIgnoreCase("3-inch Binder")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("3-inch Binder", 8.99, "Supplies", "020503"));
            }
        }
        else if(s.equalsIgnoreCase("Blue Notebook")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Blue Notebook", 6.99, "Supplies", "020601"));
            }
        }
        else if(s.equalsIgnoreCase("Red Notebook")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Red Notebook", 6.99, "Supplies", "020602"));
            }
        }
        else if(s.equalsIgnoreCase("Yellow Notebook")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("Yellow Notebook", 6.99, "Supplies", "020603"));
            }
        }
        else if(s.equalsIgnoreCase("yes")){
            for(int i = 0; i < n; i++){
                shoppingCart.add(new Item("TEDX ticket", 12.25, "Tickets", "030101"));
            }
        }
    }

    public double addTax(double n, String s){
        if(s.equalsIgnoreCase("Alabama"))
            n *= (1 + taxRates[0]);
        else if(s.equalsIgnoreCase("Alaska"))
            n *= (1 + taxRates[1]);
        else if(s.equalsIgnoreCase("Arizona"))
            n *= (1 + taxRates[2]);
        else if(s.equalsIgnoreCase("Arkansas"))
            n *= (1 + taxRates[3]);
        else if(s.equalsIgnoreCase("California"))
            n *= (1 + taxRates[4]);
        else if(s.equalsIgnoreCase("Colorado"))
            n *= (1 + taxRates[5]);
        else if(s.equalsIgnoreCase("Connecticut"))
            n *= (1 + taxRates[6]);
        else if(s.equalsIgnoreCase("Delaware"))
            n *= (1 + taxRates[7]);
        else if(s.equalsIgnoreCase("District of Columbia"))
            n *= (1 + taxRates[8]);
        else if(s.equalsIgnoreCase("Florida"))
            n *= (1 + taxRates[9]);
        else if(s.equalsIgnoreCase("Georgia"))
            n *= (1 + taxRates[10]);
        else if(s.equalsIgnoreCase("Hawaii"))
            n *= (1 + taxRates[11]);
        else if(s.equalsIgnoreCase("Idaho"))
            n *= (1 + taxRates[12]);
        else if(s.equalsIgnoreCase("Illinois"))
            n *= (1 + taxRates[13]);
        else if(s.equalsIgnoreCase("Indiana"))
            n *= (1 + taxRates[14]);
        else if(s.equalsIgnoreCase("Iowa"))
            n *= (1 + taxRates[15]);
        else if(s.equalsIgnoreCase("Kansas"))
            n *= (1 + taxRates[16]);
        else if(s.equalsIgnoreCase("Kentucky"))
            n *= (1 + taxRates[17]);
        else if(s.equalsIgnoreCase("Louisiana"))
            n *= (1 + taxRates[18]);
        else if(s.equalsIgnoreCase("Maine"))
            n *= (1 + taxRates[19]);
        else if(s.equalsIgnoreCase("Maryland"))
            n *= (1 + taxRates[20]);
        else if(s.equalsIgnoreCase("Massachusetts"))
            n *= (1 + taxRates[21]);
        else if(s.equalsIgnoreCase("Michigan"))
            n *= (1 + taxRates[22]);
        else if(s.equalsIgnoreCase("Minnesota"))
            n *= (1 + taxRates[23]);
        else if(s.equalsIgnoreCase("Mississippi"))
            n *= (1 + taxRates[24]);
        else if(s.equalsIgnoreCase("Missouri"))
            n *= (1 + taxRates[25]);
        else if(s.equalsIgnoreCase("Montana"))
            n *= (1 + taxRates[26]);
        else if(s.equalsIgnoreCase("Nebraska"))
            n *= (1 + taxRates[27]);
        else if(s.equalsIgnoreCase("Nevada"))
            n *= (1 + taxRates[28]);
        else if(s.equalsIgnoreCase("New Hampshire"))
            n *= (1 + taxRates[29]);
        else if(s.equalsIgnoreCase("New Jersey"))
            n *= (1 + taxRates[30]);
        else if(s.equalsIgnoreCase("New Mexico"))
            n *= (1 + taxRates[31]);
        else if(s.equalsIgnoreCase("New York"))
            n *= (1 + taxRates[32]);
        else if(s.equalsIgnoreCase("North Carolina"))
            n *= (1 + taxRates[33]);
        else if(s.equalsIgnoreCase("North Dakota"))
            n *= (1 + taxRates[34]);
        else if(s.equalsIgnoreCase("Ohio"))
            n *= (1 + taxRates[35]);
        else if(s.equalsIgnoreCase("Oklahoma"))
            n *= (1 + taxRates[36]);
        else if(s.equalsIgnoreCase("Oregon"))
            n *= (1 + taxRates[37]);
        else if(s.equalsIgnoreCase("Pennsylvania"))
            n *= (1 + taxRates[38]);
        else if(s.equalsIgnoreCase("Puerto Rico"))
            n *= (1 + taxRates[39]);
        else if(s.equalsIgnoreCase("Rhode Island"))
            n *= (1 + taxRates[40]);
        else if(s.equalsIgnoreCase("South Carolina"))
            n *= (1 + taxRates[41]);
        else if(s.equalsIgnoreCase("South Dakota"))
            n *= (1 + taxRates[42]);
        else if(s.equalsIgnoreCase("Tennessee"))
            n *= (1 + taxRates[43]);
        else if(s.equalsIgnoreCase("Texas"))
            n *= (1 + taxRates[44]);
        else if(s.equalsIgnoreCase("Utah"))
            n *= (1 + taxRates[45]);
        else if(s.equalsIgnoreCase("Vermont"))
            n *= (1 + taxRates[46]);
        else if(s.equalsIgnoreCase("Virginia"))
            n *= (1 + taxRates[47]);
        else if(s.equalsIgnoreCase("Washington"))
            n *= (1 + taxRates[48]);
        else if(s.equalsIgnoreCase("West Virginia"))
            n *= (1 + taxRates[49]);
        else if(s.equalsIgnoreCase("Wisconsin"))
            n *= (1 + taxRates[50]);
        else if(s.equalsIgnoreCase("Wyoming"))
            n *= (1 + taxRates[51]);
        return n;
    }

    public double getCartTotal(){
        double total = 0;
        if(shoppingCart.size() == 0)
            total = 0.00;
        else{
            for(Item item : shoppingCart){
                total += item.getPrice();
            }
        }
        return total;
    }

    public String toString(){
        String result = "";
        for(Item item : shoppingCart){
            result += item.getName();
            result += "\n";
        }
        return result;
    }
}
