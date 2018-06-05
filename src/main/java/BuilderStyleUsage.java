import model.Address;

public class BuilderStyleUsage {

    public Address createAddressSF() {
        Address result = new Address();
        result.setCity("San Francisco");
        return result;
    }
}
