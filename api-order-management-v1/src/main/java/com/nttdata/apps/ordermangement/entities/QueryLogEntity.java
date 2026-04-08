package com.nttdata.apps.ordermangement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Data
@Entity
@Table(name = "tb_query_log")
@AllArgsConstructor
@NoArgsConstructor
public class QueryLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String dni;

    private BigDecimal sunat;

    private BigDecimal compra;

    private BigDecimal venta;
}
