package marshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class GenericMarshaller {

    public void marshal(Object object, File file) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(object, file);
    }
}
