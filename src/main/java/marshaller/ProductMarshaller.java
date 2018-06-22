package marshaller;

import model.Product;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class ProductMarshaller {

    public void toXml() throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(Product.class);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Product product = new Product(1, "Mleko", "Mlekowita", 2.5);
        marshaller.marshal(product, new File("product.xml"));
    }
}
