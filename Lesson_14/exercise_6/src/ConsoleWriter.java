class ConsoleWriter implements Printer, Notifier {
    // override greeting method according
    // to Printer default implementation
    @Override
    public void greeting() {
        Printer.super.greeting();
    }
}

