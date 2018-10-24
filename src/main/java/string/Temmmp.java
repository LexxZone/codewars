package string;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import java.util.Date;
import java.util.GregorianCalendar;

import static javax.xml.datatype.DatatypeConstants.FIELD_UNDEFINED;

public class Temmmp {

    public static XMLGregorianCalendar convertGCtoXmlDate(GregorianCalendar gc) {
        XMLGregorianCalendar xmlGC = null;
        try {
            xmlGC = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
            xmlGC.setTimezone(FIELD_UNDEFINED);
            xmlGC.setFractionalSecond(null);
        } catch (DatatypeConfigurationException e) {
            System.out.println(e.toString());;
        }
        return xmlGC;
    }

    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);
    }
}
