import java.sql.Struct;
import java.time.LocalDate;
import java.util.Random;

public class Product {
    private String productName;
    private int expDay;
    private boolean isFresh;
    private LocalDate producedON;
    private String placeOfProducts;

    public static Random random=new Random();

    public Product(String productName, int expDay) {
        this.productName = productName;
        this.expDay = expDay;
       generateDate();
       setPlace();
       isFresh();
    }

    public  void isFresh(){
        int ex=0;
        if(this.placeOfProducts.equals("Show-Case")){
            ex=this.expDay/2;
        }else{
            ex=this.expDay;
        }
        if(LocalDate.now().isAfter(this.producedON.plusDays(ex))){
            this.isFresh=false;
        }else {
            this.isFresh=true;
        }
    }
    public void generateDate(){
        this.producedON=LocalDate.of(2023,
                random.nextInt(8)+1,
                random.nextInt(30)+1);
    }
    public void setPlace(){
        int randomNumber=random.nextInt(2);
        if(randomNumber==1){
            this.placeOfProducts="Show Case";
        }else {
            this.placeOfProducts="Ice-Box";
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getExpDay() {
        return expDay;
    }


    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public LocalDate getProducedON() {
        return producedON;
    }

    public void setProducedON(LocalDate producedON) {
        this.producedON = producedON;
    }

    public String getPlaceOfProducts() {
        return placeOfProducts;
    }

    public void setPlaceOfProducts(String placeOfProducts) {
        this.placeOfProducts = placeOfProducts;
    }
    public boolean getIsFresh(){
        return this.isFresh;
    }
}
