package ru.reksoft.xsdtojava;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class JaxbSF {

    public JaxbSF() throws JAXBException {
        JAXBContext context= JAXBContext.newInstance("src.main.resources.ru.reksoft.xsdtojava");

        Marshaller marshaller = context.createMarshaller();

    }
}
