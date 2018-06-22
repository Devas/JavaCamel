import marshaller.ProductMarshaller;
import unmarshaller.ProductUnmarshaller;

import javax.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException {
        ProductMarshaller productMarshaller = new ProductMarshaller();
        productMarshaller.toXml();

        ProductUnmarshaller productUnmarshaller = new ProductUnmarshaller();
        System.out.println(productUnmarshaller.toObject());
    }
}
