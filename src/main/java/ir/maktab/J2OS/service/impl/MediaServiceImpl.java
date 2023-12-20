package ir.maktab.J2OS.service.impl;

import ir.maktab.J2OS.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.J2OS.domain.Media;
import ir.maktab.J2OS.repository.MediaRepository;
import ir.maktab.J2OS.service.MediaService;

public class MediaServiceImpl extends BaseEntityServiceImpl<Media, Long, MediaRepository>
        implements MediaService {

    public MediaServiceImpl(MediaRepository repository) {
        super(repository);
    }
}
