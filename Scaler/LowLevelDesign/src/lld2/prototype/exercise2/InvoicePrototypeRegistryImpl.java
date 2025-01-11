import java.util.HashMap;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {

    private HashMap<InvoiceType, Invoice> map = new HashMap<>();

    public void addPrototype(Invoice user) {
        map.put(user.getType(), user);
    }

    public Invoice getPrototype(InvoiceType type) {
        if(type != null) {
            return map.get(type);
        }
        return null;
    }

    public Invoice clone(InvoiceType type) {
        if(type != null) {
            return map.get(type).cloneObject();
        }
        return null;
    }

}
