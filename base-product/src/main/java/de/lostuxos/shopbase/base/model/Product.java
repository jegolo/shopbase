package de.lostuxos.shopbase.base.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Product extends BaseEntity {
    @Id
    private long id;
    private String name;
}
