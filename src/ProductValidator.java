public class ProductValidator {

    static {
        System.out.println(" Static yapıcı blok çalıştı.");
    }
    // When we produce a new product ,we use this to detect whether the product is suitable to the rules or not
    public ProductValidator() { // new leyince çalışan blok
        System.out.println("Yapıcı blok çalıştı.");
    }

    public static boolean isValid(Product product) { // ben sana bir product vericem ve sen onu doğrulayacaksın demiş oluyoruz.
        if (product.price > 0 && !product.name.isEmpty()) {// bizim ürünümüzün veri tabanına kaydedilmesi için fiyatının 0 dan büyük olması ve isminin verilmiş olması lazım
            return true;
        } else {
            return false;
        }


        // araç amacıyla kullanıcağımız yapılarda staticlerden yararlanırız. Static kullanıldığında bir kere nesne oluşur ve kullanıcılarda o oluşan nesneyi kullanır.
        // utility
        // static kullandığımzı zaman oluşturulan nesne uygulama sıfırlanmadığı sürece bellekten atılmaz.
        // new ile oluşturduğumuzda ise işimiz bittiği an sıfırlanır.
    }
    public void bisey(){


    }
}
