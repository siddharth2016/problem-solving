package src.lld2.singleton.connectionpool;

import java.util.HashMap;
import java.util.Map;

public class ConnectionPoolImpl implements ConnectionPool {

    private int maxConnections;
    private static ConnectionPoolImpl instance;
    private Map<DatabaseConnection, Boolean> connectionPool;

    private ConnectionPoolImpl(int maxConnections) {
        this.maxConnections = maxConnections;
        this.connectionPool = new HashMap<>(maxConnections);
        initializePool();
    }

    public static ConnectionPoolImpl getInstance(int maxConnections) {
        if(instance == null) {
            synchronized (ConnectionPoolImpl.class) {
                if(instance == null) instance = new ConnectionPoolImpl(maxConnections);
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

    @Override
    public void initializePool() {
        for(int i=0; i<this.maxConnections; i++) {
            connectionPool.put(new DatabaseConnection(), true);
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        for(DatabaseConnection dbc: connectionPool.keySet()) {
            if(connectionPool.get(dbc)) {
                connectionPool.put(dbc, false);
                return dbc;
            }
        }
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        connectionPool.put(connection, true);
    }

    @Override
    public int getAvailableConnectionsCount() {
        int count = 0;
        for(Boolean bool: connectionPool.values()) {
            if(bool) count++;
        }
        return count;
    }

    @Override
    public int getTotalConnectionsCount() {
        return this.maxConnections;
    }
}
