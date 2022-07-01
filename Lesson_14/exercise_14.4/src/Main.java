import java.awt.print.PrinterAbortException;

/* Define and implement a default method print in the Printer
interface to make code in the main method print the text
This is a default message. Do not change both Main and ConsolePrinter
classes.
* */
public class Main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();
        printer.print(); // prints: this si a defaul msg
    }
}