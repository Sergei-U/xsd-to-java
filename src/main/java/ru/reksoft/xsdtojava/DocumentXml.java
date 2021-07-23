package ru.reksoft.xsdtojava;

import org.w3c.dom.Element;
import sun.plugin.dom.core.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DocumentXml {
    public void docXmlCreate() throws ParserConfigurationException {
        DocForXml docForXml = new DocForXml();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        Document doc = (Document) factory.newDocumentBuilder().newDocument();


        DocForXml.СвУчДокОбор.СвОЭДОтпр.setНаимОрг("Reksoft");
        DocForXml.СвУчДокОбор.СвОЭДОтпр.setИдЭДО("evotor");
        DocForXml.СвУчДокОбор.СвОЭДОтпр.setИННЮЛ("5060708090");
        new DocForXml.СвУчДокОбор.СвОЭДОтпр("30", "40", "50");
        DocForXml.СвУчДокОбор.setИдОтпр("35");
        DocForXml.СвУчДокОбор.setИдПол("36");


        Element root = doc.createElement("root");
        root.setAttribute("xmlns", "http://www.javacore.ru/schemas/");
        doc.appendChild(root);

        Element item1 = doc.createElement("item");
        item1.setAttribute("val", "1");
        root.appendChild(item1);

        Element item2 = doc.createElement("item");
        item2.setAttribute("val", "2");
        root.appendChild(item2);

        Element item3 = doc.createElement("item");
        item3.setAttribute("val", "3");
        root.appendChild(item3);
    }
}
