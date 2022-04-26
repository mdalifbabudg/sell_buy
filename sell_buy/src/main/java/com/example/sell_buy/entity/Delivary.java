package com.example.sell_buy.entity;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "delivary")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Delivary extends BaseEntity{

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
        name = "order_detail_delivary",
        joinColumns = @JoinColumn(name = "delivary_id"),
        inverseJoinColumns = @JoinColumn(name = "order_detail_id")
    )
    private List<OrderDetail> orderDetails;
    
}
