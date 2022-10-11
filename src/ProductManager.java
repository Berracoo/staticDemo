public class ProductManager {
    public void add(Product product){// ben ona bir product vereyim mo da product tı veri erişim tabanına göndersin.
        ProductValidator validator = new ProductValidator();
        if(validator.isValid(product)) {
            System.out.println("Eklendi");
        }else{
            System.out.println("Ürün bilgileri geçersizidr.");
        }



     // staticler class ismiyle çağırılır ve çağırıldığı andada bellekte oluşturulur am voidlerde çağırabilmek için önce newlemen gerekir.

    }
}
