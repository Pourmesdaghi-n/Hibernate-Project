package ir.maktab.J2OS.repository.base;

import ir.maktab.J2OS.base.repository.BaseEntityRepository;
import ir.maktab.J2OS.domain.BaseCategory;

import java.util.List;

public interface BaseCategoryRepository<E extends BaseCategory<E>>
        extends BaseEntityRepository<E, Long> {
    List<E> findAllByTitleContaining(String title);

    List<E> findAllByParentId(Long parentId);
}
