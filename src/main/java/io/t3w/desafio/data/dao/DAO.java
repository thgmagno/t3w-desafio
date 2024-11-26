package io.t3w.desafio.data.dao;

import java.sql.Connection;

public abstract class DAO {

    private final Connection connection;

    public DAO(Connection connection) {
        this.connection = connection;
    }

    Connection getConnection() {
        return connection;
    }
}
