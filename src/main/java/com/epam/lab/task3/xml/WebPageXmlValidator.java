package com.epam.lab.task3.xml;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class WebPageXmlValidator extends DefaultHandler {
    public static final String SCHEMA_FILE_NAME = "src\\main\\java\\com\\epam\\lab\\task3\\webPages.xsd";

    private StringBuilder error = new StringBuilder();

    private String fileName;

    public WebPageXmlValidator(String fileName) {
        this.fileName = fileName;
    }

    private StringBuilder getErrorInfo(SAXParseException e) {
        StringBuilder builder = new StringBuilder();
        builder.append('[').append(e.getLineNumber()).append(':').append(e.getColumnNumber()).append(']');
        builder.append('\n').append(e.getLocalizedMessage()).append('\n');
        return builder;
    }

    @Override
    public void warning(SAXParseException e) throws SAXException {
        error.append("WARNING: ");
        error.append(getErrorInfo(e));
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        error.append("ERROR: ");
        error.append(getErrorInfo(e));
    }

    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        error.append("FATALERROR: ");
        error.append(getErrorInfo(e));
    }

    public String getError() {
        if (error.length() > 0) {
            return error.toString();
        } else {
            return null;
        }
    }

    public boolean validate() throws IOException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            //Schema schema = factory.newSchema(new File("webPages.xsd"));
            Schema schema = factory.newSchema(new StreamSource(getClass().getResourceAsStream(SCHEMA_FILE_NAME)));
            Validator validator = schema.newValidator();
            validator.setErrorHandler(this);
            validator.validate(new StreamSource(fileName));
            return getError() == null;
        } catch (SAXException e) {
            return false;
        }
    }
}