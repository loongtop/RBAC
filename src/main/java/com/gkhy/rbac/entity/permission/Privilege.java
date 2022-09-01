package com.gkhy.rbac.entity.permission;

import com.gkhy.rbac.entity.base.DateModel;
import com.gkhy.rbac.entity.permission.Operation;
import com.gkhy.rbac.entity.permission.Resource;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Privilege extends DateModel {

    @GeneratedValue
    @Id
    private Long id;

    @Column(name = "permission_id")
    private Long permissionId;

    @JoinColumn(name = "id",referencedColumnName = "id")
    @OneToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    private Resource resource;

    @JoinColumn(name = "id",referencedColumnName = "id")
    @OneToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    private Operation operation;

    private String name;

    private String defaultValue;

    private String description;

}