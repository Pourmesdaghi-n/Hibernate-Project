package ir.maktab.J2OS;

import com.github.javafaker.Faker;
import ir.maktab.J2OS.domain.*;
import ir.maktab.J2OS.domain.enumaration.MediaType;
import ir.maktab.J2OS.domain.enumaration.UserType;
import ir.maktab.J2OS.service.MediaCategoryService;
import ir.maktab.J2OS.service.MediaService;
import ir.maktab.J2OS.service.WriterService;
import ir.maktab.J2OS.util.ApplicationContext;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class MainApplication {
    public static void main(String[] args) {
        initUser();
        initMediaCategory();
        intMedia();
    }

    private static void initUser() {
        WriterService writerService = ApplicationContext.getWriterService();
        if (writerService.countAll() == 0) {
            writerService.save(
                    Writer.builder()
                            .firstName("Niloofar")
                            .lastName("Pourmesdaghi")
                            .userName("Niloofar")
                            .userType(UserType.WRITER.name())
                            .password("123456")
                            .build()
            );


        }
    }

    private static void initMediaCategory() {
        MediaCategoryService mediaCategoryService = ApplicationContext.getMediaCategoryService();
        if (mediaCategoryService.countAll() == 0) {
            MediaCategory mediaCategory = new MediaCategory();
            mediaCategory.setTitle("sport");
            mediaCategoryService.save(mediaCategory);

            MediaCategory child = new MediaCategory();
            child.setTitle("football");
            child.setParent(mediaCategory);
            mediaCategoryService.save(child);
        }
    }

    public static void intMedia() {
        MediaService mediaService = ApplicationContext.getMediaService();
        if (mediaService.countAll() == 0) {
            MediaCategory mediaCategory = ApplicationContext.getMediaCategoryService().findAllByTitleContaining("foo").get(0);
            User user = ApplicationContext.getUserService().getUserByUserName("Niloofar");
            Faker faker = new Faker();
            IntStream.range(0, 5).forEach(i -> {
                        Media media = new Media();
                        media.setTitle(faker.book().title());
                        media.setContext(faker.lorem().characters(120));
                        media.setMediaCategory(mediaCategory);
                        media.setCreateDate(ZonedDateTime.now());
                        media.setLastUpdateDate(ZonedDateTime.now());
                        media.setMediaType(MediaType.ARTICLE);
                        media.setUser(user);
                        media.setTagSet(
                                new HashSet<>(
                                        Arrays.asList(
                                                new Tag(
                                                        faker.book().genre()
                                                ),
                                                new Tag(
                                                        faker.book().genre()
                                                ),
                                                new Tag(
                                                        faker.book().genre()
                                                )
                                        )
                                )
                        );
                        mediaService.insert(media);
                    }
            );
        }

    }
}
