package com;


import exception.ReaderException;
import org.junit.*;
import service.FileReader;
import service.FileReaderImpl;
import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;

public class TestReader {

    private  FileReader fileReader;

    @Before
    public  void beforeTests() {
        fileReader = new FileReaderImpl();
    }
    @After
    public  void afterTest() {
        fileReader = null;
    }

    @Test
    public void fileIsEmptyTest() throws ReaderException {
        assertEquals(true,  fileReader.readFile("src/main/resources/file/emptyFileTest.csv").isEmpty());
    }

    @Test
    public void normalDataTest() throws ReaderException {
        List<String> expected = Arrays.asList("id;name",
                "1;Marketing",
                "2;Management",
                "3;Finance",
                "4;Production");
        List<String> actual = fileReader.readFile("src/main/resources/file/Test_Task.csv");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSizeTest() throws ReaderException {
        List<String> actual = fileReader.readFile("src/main/resources/file/Test Task.csv");
        Assert.assertEquals(8, fileReader.readFile("src/main/resources/file/Test Task.csv").size());
    }
}
