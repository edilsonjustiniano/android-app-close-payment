package br.com.justiniano.edilson.closeaccount.repository;

import java.util.List;
import java.util.Set;

/**
 * Created by edilson on 10/19/15.
 */
public interface AppRepository<T> {

    void save(T entity);
    List<T> findAll();
}
