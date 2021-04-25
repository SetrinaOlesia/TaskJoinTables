import exception.AppException;
import service.ConsoleDataPrinter;
import service.ConsoleDataPrinterImpl;

public class Main {

    public static void main(String[] args) throws AppException {
        ConsoleDataPrinter consoleDataPrinter = new ConsoleDataPrinterImpl();
        consoleDataPrinter.showDataInConsole();
    }
}
