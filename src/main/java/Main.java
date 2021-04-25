
import exception.ReaderException;
import service.ConsoleDataPrinter;
import service.ConsoleDataPrinterImpl;

public class Main {

    public static void main(String[] args) throws ReaderException {
        ConsoleDataPrinter consoleDataPrinter = new ConsoleDataPrinterImpl();
        consoleDataPrinter.showDataInConsole();
    }
}
