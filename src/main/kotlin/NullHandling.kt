import model.Address
import model.Order

class NullHandlingKt {

    fun getAddressFromOrder(order: Order?): Address = order?.customer?.address
            ?: throw IllegalArgumentException()
}