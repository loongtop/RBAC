package com.gkhy.rbac.common.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface IJpaRepository<T, E extends Number> extends
        JpaRepository<T, E>,
        JpaSpecificationExecutor<T>{
}


