package ir.maktab.J2OS.service.base;

import ir.maktab.J2OS.base.service.BaseEntityService;
import ir.maktab.J2OS.domain.BaseCategory;

import java.util.List;

public interface BaseCategoryService<E extends BaseCategory<E>> extends BaseEntityService<E, Long> {
    List<E> findAllByTitleContaining(String title);

    List<E> findAllByParentId(Long parentId);
}
