package ir.maktab.J2OS.service.impl;

import ir.maktab.J2OS.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.J2OS.domain.Media;
import ir.maktab.J2OS.domain.User;
import ir.maktab.J2OS.repository.MediaRepository;
import ir.maktab.J2OS.service.MediaService;
import ir.maktab.J2OS.util.SecurityContext;

public class MediaServiceImpl extends BaseEntityServiceImpl<Media, Long, MediaRepository>
        implements MediaService {

    public MediaServiceImpl(MediaRepository repository) {
        super(repository);
    }

    @Override
    public Media save(Media media) {
        User currentUser = SecurityContext.getCurrentUser();
        if (currentUser == null) {
            throw new RuntimeException("access denied !!!");
        }
        if (media.getId() == null) {
            repository.getEntityManager().getTransaction().begin();
            media = repository.save(media);
            media.setUser(currentUser);
            repository.getEntityManager().getTransaction().commit();
            return media;
        } else {
            return super.save(media);
        }
    }
}
