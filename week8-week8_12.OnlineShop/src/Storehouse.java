import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Dawid on 25.07.2017.
 */
public class Storehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse()
    {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }


    public void addProduct(String product, int price, int stock)
    {
        this.prices.put(product,price);
        this.stocks.put(product,stock);
    }

    public int price(String product)
    {
        if(this.prices.containsKey(product))
            return this.prices.get(product);
        return -99;
    }

    public int stock(String product)
    {
        if(this.stocks.containsKey(product))
            return this.stocks.get(product);
        return 0;
    }

    public boolean take(String product)
    {
        if(this.stocks.containsKey(product) && this.stocks.get(product)>0)
        {
            this.stocks.put(product,this.stocks.get(product)-1);
            return true;
        }
        else
            return false;

    }

    public Set<String> products()
    {
        Set<String> allProducts = new HashSet<String>();
        for(String item:this.prices.keySet())
        {
            allProducts.add(item);
        }
        return allProducts;
    }


}
