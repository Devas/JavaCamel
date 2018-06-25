import marshaller.GenericMarshaller;
import model.Product;
import unmarshaller.GenericUnmarshaller;

import javax.xml.bind.JAXBException;
import java.io.File;

public class Main {

    public static void main(String[] args) throws JAXBException {
        File file = new File("product.xml");
        Product product = new Product(1, "Mleko", "Mlekowita", 2.5);

        GenericMarshaller genericMarshaller = new GenericMarshaller();
        genericMarshaller.marshal(product, file);

        GenericUnmarshaller genericUnmarshaller = new GenericUnmarshaller();
        Product result = (Product) genericUnmarshaller.unmarshal(Product.class, file);
        System.out.println(result);
    }
}
