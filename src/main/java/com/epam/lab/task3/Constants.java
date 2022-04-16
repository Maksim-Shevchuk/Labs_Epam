package com.epam.lab.task3;

import java.nio.file.Paths;

public interface Constants {
    String SCHEME_PATH = Paths.get("src", "main", "java", "com", "epam", "lab", "task3","resources", "webPages.xsd").toAbsolutePath().toString();
    String XML_PATH = Paths.get("src","main","java", "com", "epam", "lab","task3", "resources", "webPages.xml").toAbsolutePath().toString();
    String NEW_XML_PATH = Paths.get("src","main","java", "com", "epam", "lab","task3", "resources", "webPagesNew.xml").toAbsolutePath().toString();

}
