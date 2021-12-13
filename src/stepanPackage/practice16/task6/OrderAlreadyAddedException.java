package stepanPackage.practice16.task6;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException() {
        super("El pedido ya ha sido agregado");
    }
}
