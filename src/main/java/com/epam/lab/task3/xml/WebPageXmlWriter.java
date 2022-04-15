package com.epam.lab.task3.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import com.epam.lab.task3.model.WebPage;
import com.epam.lab.task3.model.chars.Chars;

public class WebPageXmlWriter {

    public void write(List<WebPage> webPages, String fileName)
            throws FileNotFoundException, XMLStreamException {
        XMLStreamWriter writer = null;
        try {
            XMLOutputFactory factory = XMLOutputFactory.newFactory();
            writer = factory.createXMLStreamWriter(new FileOutputStream(fileName), "UTF-8");
            writer.writeStartDocument("UTF-8", "1.0");
            writer.writeStartElement("webPages");
            writer.writeAttribute("xmlns", "http://www.example.org/webPages");
            writer.writeAttribute("xsi:schemaLocation", "http://www.example.org/webPages webPages.xsd");
            writer.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            for (WebPage webPage : webPages) {
                writer.writeStartElement("webPage");
                writer.writeAttribute("id", webPage.getIdentity());
                writer.writeStartElement("title");
                writer.writeCharacters(webPage.getTitle());
                writer.writeEndElement();
                writer.writeStartElement("webPageType");
                writer.writeCharacters(webPage.getWebPageType().toString());
                writer.writeEndElement();
                writer.writeStartElement("needAuthorization");
                writer.writeCharacters(webPage.getNeedAuthorization().toString());
                writer.writeEndElement();
                writer.writeStartElement("chars");
                for (Chars chars : webPage.getChars()) {
                    writer.writeStartElement(chars.getElement());
                    writer.writeCharacters(chars.getValue());
                    writer.writeEndElement();
                }
                writer.writeEndElement();
                writer.writeEndElement();
            }
            writer.writeEndElement();
            writer.writeEndDocument();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
