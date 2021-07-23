package ru.reksoft.xsdtojava;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import


public class JaxbSF {


    JAXBContext context;

    {
        try {
            context = JAXBContext.newInstance("target.generated-sources.xjc.generated");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    Marshaller marshaller;

    {
        try {
            marshaller = context.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    Файл файл1 = new Файл();







}
