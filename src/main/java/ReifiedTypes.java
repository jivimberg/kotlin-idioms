import com.fasterxml.jackson.databind.ObjectMapper;
import model.Address;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class ReifiedTypes {
    private <T> T fromJson(@NotNull String json, Class<T> clazz) {
        try {
            return new ObjectMapper().readValue(json, clazz);
        } catch (IOException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        String json = "{ \"city\" : \"San Francisco\" }";
        final Address address = new ReifiedTypes().fromJson(json, Address.class);
        System.out.println(address);
    }
}
