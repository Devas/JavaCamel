package unmarshaller;

import model.Product;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ProductUnmarshaller {

    public Product toObject() throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Product.class);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        return (Product) unmarshaller.unmarshal(new File("product.xml"));
    }
}
