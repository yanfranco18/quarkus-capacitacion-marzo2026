package com.nttdata.apps.ordermangement.service;

import com.nttdata.apps.ordermangement.entities.QueryLogEntity;

import java.util.List;

public interface QueryLogService {

    List<QueryLogEntity> getAll();

    QueryLogEntity create(QueryLogEntity request);
}
