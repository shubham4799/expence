package com.geekster.expencetracker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Expence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="expense_id")
    private Integer id;
    @Column(name = "expense_date")
    private Date expenseDate;
    @Column(name = "description")
    private String description;
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Product productId;
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User userId;
//}
}
