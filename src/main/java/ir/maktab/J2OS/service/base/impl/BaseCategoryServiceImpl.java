package ir.maktab.J2OS.service.base.impl;

import ir.maktab.J2OS.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.J2OS.domain.BaseCategory;
import ir.maktab.J2OS.repository.base.BaseCategoryRepository;
import ir.maktab.J2OS.service.base.BaseCategoryService;

import java.util.List;

public class BaseCategoryServiceImpl<E extends BaseCategory<E>, R extends BaseCategoryRepository<E>>
        extends BaseEntityServiceImpl<E, Long, R>
        implements BaseCategoryService<E> {

    public BaseCategoryServiceImpl(R repository) {
        super(repository);
    }

    @Override
    public List<E> findAllByTitleContaining(String title) {
        return repository.findAllByTitleContaining(title);
    }

    @Override
    public List<E> findAllByParentId(Long parentId) {
        return repository.findAllByParentId(parentId);
    }
}
