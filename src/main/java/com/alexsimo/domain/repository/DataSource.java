
package com.alexsimo.domain.repository;

import java.util.List;

public interface DataSource<T> {
    List<T> getByLimit(int limit);
}
