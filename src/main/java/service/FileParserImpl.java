package service;

import models.Department;
import models.Employee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileParserImpl implements FileParser {

    @Override
    public List<Employee> parseEmployeesCsv( List<String> fileLines) {
        List<Employee> employees = new ArrayList<>();
        for (String fileLine : fileLines) {
            String[] splitText = fileLine.split(";");
            ArrayList<String> columnList = new ArrayList<>(Arrays.asList(splitText));
            if (!columnList.isEmpty()) {
                Employee employee = new Employee();
                employee.setId(columnList.get(0));
                employee.setName(columnList.get(1));
                employee.setSurname(columnList.get(2));
                employee.setDepartmentId(columnList.get(3));
                employees.add(employee);
            }
        }
        return employees;
    }

    @Override
    public List<Department> parseDepartmentsCsv(List<String> fileLines) {
        List<Department> departments = new ArrayList<>();
        for (String fileLine : fileLines) {
            String[] splitText = fileLine.split(";");
            ArrayList<String> columnList = new ArrayList<>(Arrays.asList(splitText));
            if (!columnList.isEmpty()) {
                Department department = new Department();
                department.setId(columnList.get(0));
                department.setName(columnList.get(1));
                departments.add(department);
            }
        }
        return departments;
    }

}
