package org.quera.bime.service;

public interface BaseService<T>{
    void save(T t);
    T findOne(Long id);
}
