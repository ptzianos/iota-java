package org.iota.jota.store;

import java.util.Map;
import java.util.Properties;

public class PropertiesStore extends MemoryStore {
    
    public PropertiesStore(Properties properties) {
        super();
        for (Map.Entry entry : properties.entrySet()) {
            set(entry.getKey().toString(), entry.getValue().toString());
        }
    }
}
