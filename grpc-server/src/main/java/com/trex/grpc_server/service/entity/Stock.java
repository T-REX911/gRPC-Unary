package com.trex.grpc_server.service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "stocks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "stock_symbol", length = 10, unique = true, nullable = false)
    private String stockSymbol;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "last_updated", nullable = false,
            insertable = false, updatable = false,
            columnDefinition = "timestamp default current_timestamp on update current_timestamp")
    private LocalDateTime lastUpdated;
}