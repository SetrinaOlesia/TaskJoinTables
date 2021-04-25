package service;

import models.Department;
import models.Employee;

import java.util.List;

public interface FileParser {

    List<Employee> parseEmployeesCsv(List<String> readFile);

    List<Department> parseDepartmentsCsv(List<String> readFile);
}
