package com.max.creational.abstractfactory;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

/**
 * Example of the Abstract Factory used in the DocumentBuilder
 */
public class AbstractFactorySimpleExample {

    public static void main(String[] args) throws Exception {

        String xml = "<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document doc = factory.parse(bais);

        doc.getDocumentElement().normalize();

        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

        // Uses apache xerces implementation.  This can be swapped out for a different one
        System.out.println(abstractFactory.getClass());
        System.out.println(factory.getClass());

    }
}
