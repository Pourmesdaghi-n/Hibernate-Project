package ir.maktab.J2OS.service.impl;

import ir.maktab.J2OS.domain.MediaCategory;
import ir.maktab.J2OS.repository.MediaCategoryRepository;
import ir.maktab.J2OS.service.MediaCategoryService;
import ir.maktab.J2OS.service.base.impl.BaseCategoryServiceImpl;

public class MediaCategoryServiceImpl extends BaseCategoryServiceImpl<MediaCategory, MediaCategoryRepository>
        implements MediaCategoryService {

    public MediaCategoryServiceImpl(MediaCategoryRepository repository) {
        super(repository);
    }
}
