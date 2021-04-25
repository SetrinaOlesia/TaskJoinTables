package service;

import exception.ReaderException;
import models.Department;
import models.Employee;

import java.util.List;

public class ConsoleDataPrinterImpl implements ConsoleDataPrinter {

    final String employeesFilePath = "src/main/resources/file/Test Task.csv";
    final String departmentsFilePath = "src/main/resources/file/Test_Task.csv";

    FileReader fileReader = new FileReaderImpl();
    FileParser fileParser = new FileParserImpl();

    @Override
    public void showDataInConsole() throws ReaderException {
        List<Employee> employeeList = this.getEmployeesList();
        List<Department> departmentList = this.getDepartmentsList();
        for (Employee employee : employeeList) {
            for (Department department : departmentList) {
                if (employee.getDepartmentId().equals(department.getId())) {
                    System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSurname() + " " + department.getName());
                }
            }
        }
    }

    private List<Employee> getEmployeesList() throws ReaderException {
        List<String> employeesFileLines = fileReader.readFile(employeesFilePath);
        return fileParser.parseEmployeesCsv(employeesFileLines);
    }

    private List<Department> getDepartmentsList() throws ReaderException {
        List<String> departmentsFileLines = fileReader.readFile(departmentsFilePath);
        return fileParser.parseDepartmentsCsv(departmentsFileLines);
    }

}
