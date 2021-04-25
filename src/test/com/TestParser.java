package com;

import exception.ReaderException;
import models.Department;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.FileParser;
import service.FileParserImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestParser {

    private FileParser fileParser;

    @Before
    public void initTest() {
        fileParser = new FileParserImpl();
    }

    @After
    public void afterTest() {
        fileParser = null;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void invalidSeparatorDepartmentTest() throws ReaderException {
        List<String> listDepartment = Arrays.asList("id,name",
                "1,Marketing",
                "2,Management",
                "3,Finance",
                "4,Production");
        fileParser.parseDepartmentsCsv(listDepartment);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void invalidSeparatorEmployeeTest() throws ReaderException {
        List<String> listEmployee = Arrays.asList("id,name,surname,department_id",
                "1,John,Smith,2",
                "2;Pete;Hallock,1",
                "3,Freddie,Ruckman"
        );
        fileParser.parseDepartmentsCsv(listEmployee);
    }

    @Test
    public void isListEmptyTest() {
        List<String> list = new ArrayList<>();
        List<Department> departmentList = fileParser.parseDepartmentsCsv(list);
        Assert.assertEquals(list, departmentList);
    }
}
