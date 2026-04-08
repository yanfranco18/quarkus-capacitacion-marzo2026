package com.nttdata.apps.ordermangement.repositories;

import com.nttdata.apps.ordermangement.entities.QueryLogEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class QueryLogRepository implements PanacheRepositoryBase<QueryLogEntity, UUID> {
}
