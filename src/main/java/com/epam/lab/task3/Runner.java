package com.epam.lab.task3;

import com.epam.lab.task3.comparators.WebPageTitleComparator;
import com.epam.lab.task3.model.WebPage;
import com.epam.lab.task3.xml.WebPageXmlReader;
import com.epam.lab.task3.xml.WebPageXmlValidator;
import com.epam.lab.task3.xml.WebPageXmlWriter;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException, XMLStreamException {
        System.out.println(System.getProperty("user.dir"));
        WebPageXmlValidator validator = new WebPageXmlValidator(Constants.XML_PATH);
        if (validator.validate()) {
            WebPageXmlReader reader = new WebPageXmlReader();
            List<WebPage> webPages = reader.read(Constants.XML_PATH);
            for (WebPage webPage : webPages) {
                System.out.println(webPage);
            }
            Collections.sort(webPages, new WebPageTitleComparator());
            WebPageXmlWriter writer = new WebPageXmlWriter();
            writer.write(webPages, Constants.NEW_XML_PATH);
            System.out.println("is valid");
        } else {
            System.out.println(validator.getError());
        }
    }
}