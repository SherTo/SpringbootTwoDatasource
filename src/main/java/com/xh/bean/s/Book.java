package com.xh.bean.s;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by admin on 2016/12/27.
 */
@Entity
@Table(name = "book")
public class Book implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private int count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Book(String name, int count) {
        this.name = name;
        this.count = count;
    }
}
