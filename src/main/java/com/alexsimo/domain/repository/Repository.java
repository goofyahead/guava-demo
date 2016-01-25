package com.alexsimo.domain.repository;

import java.util.List;

public class Repository<T> {

    private final DataSource<T> dataSource;

    public Repository(DataSource<T> dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource<T> getDataSource() {
        return dataSource;
    }

    public List<T> getByLimit(int limit) {
        return dataSource.getByLimit(limit);
    }
}
