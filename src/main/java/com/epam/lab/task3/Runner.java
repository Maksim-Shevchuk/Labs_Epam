package com.epam.lab.task3;

import com.epam.lab.task3.model.WebPage;
import com.epam.lab.task3.xml.WebPageXmlReader;
import com.epam.lab.task3.xml.WebPageXmlValidator;
import com.epam.lab.task3.xml.WebPageXmlWriter;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException, XMLStreamException {
        WebPageXmlValidator validator = new WebPageXmlValidator("webPages.xml");
        if (validator.validate()) {
            WebPageXmlReader reader = new WebPageXmlReader();
            List<WebPage> webPages = reader.read("webPages.xml");
            for (WebPage webPage : webPages) {
                System.out.println(webPage);
            }
            WebPageXmlWriter writer = new WebPageXmlWriter();
            writer.write(webPages, "webPages.xml");
            System.out.println("is valid");
        } else {
            System.out.println(validator.getError());
        }
    }
}