package com.gkhy.rbac.entity.base;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"created_by", "updated_by"},
        allowGetters = true)
public abstract class OperatorModel extends DateModel {

    @Column(name = "created_by")
    private String created;

    @Column(name = "updated_by")
    private String updated;;
}



