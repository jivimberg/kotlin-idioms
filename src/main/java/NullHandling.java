import model.Address;
import model.Order;
import org.jetbrains.annotations.Nullable;

public class NullHandling {

    public Address getAddressFromOrder(@Nullable Order order) {
        if (order == null || order.getCustomer() == null || order.getCustomer().getAddress() == null){
            throw new IllegalArgumentException("Invalid Order");
        }

        return order.getCustomer().getAddress();
    }
}
