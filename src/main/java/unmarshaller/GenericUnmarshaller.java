package unmarshaller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class GenericUnmarshaller {

    public Object unmarshal(Class c, File file) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(c);
        Unmarshaller unmarshaller = ctx.createUnmarshaller();
        return unmarshaller.unmarshal(file);
    }
}
