package com.epam.lab.task3.xml;

import com.epam.lab.task3.model.WebPage;
import com.epam.lab.task3.model.WebPageType;
import com.epam.lab.task3.model.chars.*;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class WebPageXmlReader {

    public List<WebPage> read(String fileName) throws FileNotFoundException {
        XMLStreamReader reader = null;
        try {
            List<WebPage> webPages = new ArrayList<>();
            WebPage webPage = null;
            XMLInputFactory factory = XMLInputFactory.newFactory();
            reader = factory.createXMLStreamReader(new FileInputStream(fileName));
            while (reader.hasNext()) {
                int type = reader.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT: {
                        String tagName = reader.getLocalName();
                        if ("webPage".equals(tagName)) {
                            webPage = new WebPage();
                            webPage.setIdentity(reader.getAttributeValue(null, "id"));
                        } else if ("title".equals(tagName)) {
                            webPage.setTitle(reader.getElementText());
                        } else if ("webPageType".equals(tagName)) {
                            webPage.setWebPageType(WebPageType.valueOf(reader.getElementText()));
                        } else if ("needAuthorization".equals(tagName)) {
                            webPage.setNeedAuthorization(
                                    Boolean.parseBoolean(reader.getElementText()));
                        } else if ("votingAvailable".equals(tagName)) {
                            VotingAvailable votingAvailable = new VotingAvailable();
                            votingAvailable.setElement(tagName);
                            votingAvailable.setValue(reader.getElementText());
                            webPage.getChars().add(votingAvailable);
                        } else if ("votingType".equals(tagName)) {
                            VotingType votingType = new VotingType();
                            votingType.setElement(tagName);
                            votingType.setValue(reader.getElementText());
                            webPage.getChars().add(votingType);
                        } else if ("paidInformation".equals(tagName)) {
                            PaidInformation paidInformation = new PaidInformation();
                            paidInformation.setElement(tagName);
                            paidInformation.setValue(reader.getElementText());
                            webPage.getChars().add(paidInformation);
                        } else if ("emailAvailable".equals(tagName)) {
                            EmailAvailable emailAvailable = new EmailAvailable();
                            emailAvailable.setElement(tagName);
                            emailAvailable.setValue(reader.getElementText());
                            webPage.getChars().add(emailAvailable);
                        } else if ("archiveAvailable".equals(tagName)) {
                            ArchiveAvailable archiveAvailable = new ArchiveAvailable();
                            archiveAvailable.setElement(tagName);
                            archiveAvailable.setValue(reader.getElementText());
                            webPage.getChars().add(archiveAvailable);
                        } else if ("numberOfNews".equals(tagName)) {
                            NumberOfNews numberOfNews = new NumberOfNews();
                            numberOfNews.setElement(tagName);
                            numberOfNews.setValue(reader.getElementText());
                            webPage.getChars().add(numberOfNews);
                        }
                        break;
                    }
                    case XMLStreamConstants.END_ELEMENT: {
                        String tagName = reader.getLocalName();
                        if ("webPage".equals(tagName)) {
                            webPages.add(webPage);
                        }
                        break;
                    }
                    case XMLStreamConstants.CHARACTERS: {
                        break;
                    }
                    case XMLStreamConstants.END_DOCUMENT: {
                        break;
                    }
                    default:
                        throw new IllegalStateException("Unexpected value: " + type);
                }
            }
            return webPages;
        } catch (XMLStreamException e) {
            return null;
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}