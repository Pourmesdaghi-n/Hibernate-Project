package ir.maktab.J2OS.service.impl;

import ir.maktab.J2OS.domain.Media;
import ir.maktab.J2OS.domain.User;
import ir.maktab.J2OS.repository.impl.MediaRepositoryImpl;
import ir.maktab.J2OS.service.MediaService;
import ir.maktab.J2OS.util.SecurityContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MediaServiceImplTest {
    private final MediaService mediaService;

    private MediaServiceImplTest() {
        MediaRepositoryImpl mediaRepository = mock(MediaRepositoryImpl.class);
        Media media = new Media();
        media.setId(1L);
        when(mediaRepository.save(any(Media.class))).thenReturn(media);
        mediaService = new MediaServiceImpl(mediaRepository);
    }

    @Test
    void save() {
        Assertions.assertThrows(RuntimeException.class, () -> mediaService.save(new Media()));
        SecurityContext.setCurrentUser(new User());
        Media media = mediaService.save(new Media());
        Assertions.assertNotNull(media.getId());
        Assertions.assertNotNull(media.getUser());
    }
}