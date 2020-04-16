package com.jsoncompare.jsoncompare.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @Author Varadharajan
 * @Projectname employee-management
 */

@Entity
@Table(name="roles")
public class Role extends com.employee.model.AuditEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(nullable=false, unique=true)
    @NotEmpty
    private String name;

    @ManyToMany(mappedBy="roles")
    private List<com.employee.model.User> users;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<com.employee.model.User> getUsers() {
        return users;
    }

    public void setUsers(List<com.employee.model.User> users) {
        this.users = users;
    }
}
