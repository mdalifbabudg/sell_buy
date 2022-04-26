package com.example.sell_buy.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail extends BaseEntity{

    @Column(name = "order_detail")
    private String orderDetail;

    @OneToMany(mappedBy = "order_detail", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Product> products;

    @ManyToMany(mappedBy = "order_details", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Delivary> delivaries;

    @OneToOne(mappedBy = "order_detail", fetch = FetchType.LAZY)
    private Order order;
}
