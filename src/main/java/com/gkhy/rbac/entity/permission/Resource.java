package com.gkhy.rbac.entity.permission;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @ClassName Resource
 * @Description: the resource of system
 * @Author: leo
 * @CreatedDate: 2022-08-31
 * @UpdatedDate: 2022-08-31
 * @Version: 1.0
 **/
@Setter
@Getter
@Entity
public class Resource {

    private static final long serialVersionUID = 690845200839397661L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "access_id")
    private Long accessId;

    private String name;

    private String description;
}
