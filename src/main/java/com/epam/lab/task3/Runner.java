package com.epam.lab.task3;

import com.epam.lab.task3.comparators.WebPageTitleComparator;
import com.epam.lab.task3.model.WebPage;
import com.epam.lab.task3.xml.WebPageXmlReader;
import com.epam.lab.task3.xml.WebPageXmlValidator;
import com.epam.lab.task3.xml.WebPageXmlWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.stream.XMLStreamException;

public class Runner {

    private static final String FILE_PATH = "src\\main\\java\\com\\epam\\lab\\task3\\webPages.xml";
    private static final String NEW_FILE_PATH = "src\\main\\java\\com\\epam\\lab\\task3\\newWebPages.xml";

    public static void main(String[] args) throws IOException, XMLStreamException {
        List<WebPage> webPages = new ArrayList<>();
        WebPageXmlValidator validator = new WebPageXmlValidator(FILE_PATH);
        if (validator.validate()) {
            WebPageXmlReader reader = new WebPageXmlReader();
            webPages = reader.read(NEW_FILE_PATH);
            for (WebPage webPage : webPages) {
                System.out.println(webPage);
            }
            Collections.sort(webPages, new WebPageTitleComparator());
            WebPageXmlWriter writer = new WebPageXmlWriter();
            writer.write(webPages,
                "src\\main\\java\\com\\epam\\lab\\task3\\newWebPages.xml");
            System.out.println("OK");
        } else {
            System.out.println(validator.getError());
        }
    }
}