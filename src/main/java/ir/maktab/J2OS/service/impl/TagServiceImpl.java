package ir.maktab.J2OS.service.impl;

import ir.maktab.J2OS.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.J2OS.domain.Tag;
import ir.maktab.J2OS.repository.TagRepository;
import ir.maktab.J2OS.service.TagService;

public class TagServiceImpl extends BaseEntityServiceImpl<Tag, Long, TagRepository>
        implements TagService {

    public TagServiceImpl(TagRepository repository) {
        super(repository);
    }
}
