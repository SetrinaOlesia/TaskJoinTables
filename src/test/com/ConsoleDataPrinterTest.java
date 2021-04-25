package com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.FileParser;
import service.FileParserImpl;

public class ConsoleDataPrinterTest {

    private FileParser fileParser;

    @Before
    public void initTest() {
        fileParser = new FileParserImpl();
    }

    @After
    public void afterTest() {
        fileParser = null;
    }
    @Test
    public void showDataInConsoleTest() throws Exception {


    }
}
