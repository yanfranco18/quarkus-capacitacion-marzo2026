package com.nttdata.apps.ordermangement.service.impl;

import com.nttdata.apps.ordermangement.entities.QueryLogEntity;
import com.nttdata.apps.ordermangement.repositories.QueryLogRepository;
import com.nttdata.apps.ordermangement.service.QueryLogService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class QueryLogServiceImpl implements QueryLogService {

    @Inject
    QueryLogRepository repository;

    @Override
    public List<QueryLogEntity> getAll() {
        return repository.findAll()
                .stream()
                .toList();
    }

    @Transactional
    @Override
    public QueryLogEntity create(QueryLogEntity request) {
        repository.persist(request);
        return request;
    }
}
