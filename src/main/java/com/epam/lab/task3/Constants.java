package com.epam.lab.task3;

import java.nio.file.Paths;

public interface Constants {
    String SCHEME_PATH = Paths.get("src", "main", "java", "com", "epam", "lab", "task3", "webPages.xsd").toAbsolutePath().toString();
    String XML_PATH = Paths.get("src","main","java", "com", "epam", "lab","task3", "webPages.xml").toAbsolutePath().toString();
    String NEW_XML_PATH = Paths.get("src","main","java", "com", "epam", "lab","task3", "webPagesNew.xml").toAbsolutePath().toString();

}
