import javax.sound.midi.Soundbank;
import java.util.Random;

public class Store {
    Product[] products;
public void doInspection(){
    int i = 1;
    System.out.println("=======================  Inspection result  =======================\n"+
                       "Product      | Produced On   | Storage place   |  life days   | Fresh\n"+
                       "\n"+
                       "-----------+---------------+---------------+--------------+------------+");
    Random random=new Random();
    for (int j = 0; j < products.length; j++) {
        int randomIndex= random.nextInt(products.length);
        Product temp=products[i];
        products[i]=products[randomIndex];
        products[randomIndex]=temp;
    }

    for (Product pp:this.products) {
        System.out.printf("%d.| %s | %s |%s | %d | %s\n",
                i ,pp.getProductName(),
                pp.getProducedON(),
                pp.getPlaceOfProducts(),
                pp.getExpDay(),
                pp.getIsFresh());
        i++;
    }
}
    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
