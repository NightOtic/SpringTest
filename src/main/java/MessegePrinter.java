class MessagePrinter {
    private final SimpleMessageProducer messageProducer = new SimpleMessageProducer();

    public void printMessage() {
        String message = messageProducer.getMessage();
        System.out.println(message);
    }
}