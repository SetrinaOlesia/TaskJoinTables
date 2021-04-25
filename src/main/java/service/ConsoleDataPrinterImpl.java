package service;

import exception.ReaderException;
import models.Department;
import models.Employee;

import java.util.List;

public class ConsoleDataPrinterImpl implements ConsoleDataPrinter {

    @Override
    public void showDataInConsole() throws ReaderException {
        FileReader fileReader = new FileReaderImpl();
        FileParser fileParser = new FileParserImpl();

        String employeesFilePath = "src/main/resources/file/Test Task.csv";
        String departmentsFilePath = "src/main/resources/file/Test_Task.csv";

        List<String> employeesFileLines = fileReader.readFile(employeesFilePath);
        List<String> departmentsFileLines = fileReader.readFile(departmentsFilePath);

        List<Employee> employeeList = fileParser.parseEmployeesCsv(employeesFileLines);
        List<Department> departmentLis = fileParser.parseDepartmentsCsv(departmentsFileLines);
        for (Employee employee : employeeList) {
            for (Department department : departmentLis) {
                if (employee.getDepartmentId().equals(department.getId())) {
                    System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSurname() + " " + department.getName());
                }
            }
        }
    }
}
