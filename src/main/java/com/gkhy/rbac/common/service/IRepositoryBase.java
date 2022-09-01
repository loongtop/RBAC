package com.gkhy.rbac.common.service;

import com.gkhy.rbac.common.service.repository.IJpaRepository;
import com.gkhy.rbac.common.service.repository.IService;
import org.springframework.data.repository.NoRepositoryBean;

//@Transactional
@NoRepositoryBean
public interface IRepositoryBase<T, E extends Number> extends
        IService<T, E>,
        IJpaRepository<T, E> {
}
