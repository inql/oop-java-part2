import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid on 25.07.2017.
 */
public class ShoppingBasket {

    private List<Purchase> list;

    public ShoppingBasket()
    {
        this.list = new ArrayList<Purchase>();
    }

    public void add(String product, int price)
    {

        Purchase purchase = new Purchase(product,1,price);
        boolean check=false;
        for(Purchase item:this.list)
        {
            if(item.getProduct().contains(purchase.getProduct()))
            {
                item.increaseAmount();
                check = true;
                break;
            }
        }
        if(!check)
            this.list.add(purchase);


    }

    public int price()
    {
        int total = 0;
        for(Purchase item:this.list)
        {
            total+=item.price();
        }
        return total;
    }

    public void print()
    {
        for(Purchase item:this.list)
        {
            System.out.println(item);
        }
    }


}
