package ir.maktab.J2OS.domain;

import ir.maktab.J2OS.base.domain.BaseEntity;
import ir.maktab.J2OS.domain.enumaration.MediaType;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = Media.TABLE_NAME)
public class Media extends BaseEntity<Long> {
    public static final String TABLE_NAME = "media_table";
    public static final String TITLE = "title";
    public static final String CONTEXT = "context";
    public static final String CREATE_DATE = "create_date";
    public static final String LAST_UPDATE_DATE = "last_update_date";
    public static final String PUBLISH_DATE = "publish_date";
    public static final String MEDIA_TYPE = "media_type";
    public static final String MEDIA_TAGS = "media_tags";
    public static final String MEDIA_ID = "media_id";
    public static final String TAG_ID = "tag_id";
    public static final String ID = "id";
    public static final String USER_ID = "user_id";
    public static final String MEDIA_CATEGORY_ID = "media_category_id";

    @Column(name = TITLE)
    private String title;
    @Column(name = CONTEXT)
    @Lob
    private String context;
    @Column(name = CREATE_DATE)
    private ZonedDateTime createDate;
    @Column(name = LAST_UPDATE_DATE)
    private ZonedDateTime lastUpdateDate;
    @Column(name = PUBLISH_DATE)
    private ZonedDateTime publishDate;
    @Column(name = MEDIA_TYPE)
    private MediaType mediaType;

    @ManyToOne
    @JoinColumn(name = MEDIA_CATEGORY_ID)
    private MediaCategory mediaCategory;

    @ManyToMany
    @JoinTable(name = MEDIA_TAGS, joinColumns = {@JoinColumn(name = MEDIA_ID, referencedColumnName = ID)},
            inverseJoinColumns = {@JoinColumn(name = TAG_ID, referencedColumnName = ID)})
    private Set<Tag> tagSet = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = USER_ID)
    private User user;

    public Media() {
    }

    public Media(String title, String context, ZonedDateTime createDate, ZonedDateTime lastUpdateDate, ZonedDateTime publishDate, MediaType mediaType) {
        this.title = title;
        this.context = context;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
        this.publishDate = publishDate;
        this.mediaType = mediaType;
    }

    public String getTitle() {
        return title;
    }

    public Media setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContext() {
        return context;
    }

    public Media setContext(String context) {
        this.context = context;
        return this;
    }

    public ZonedDateTime getCreateDate() {
        return createDate;
    }

    public Media setCreateDate(ZonedDateTime createDate) {
        this.createDate = createDate;
        return this;
    }

    public ZonedDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public Media setLastUpdateDate(ZonedDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    public ZonedDateTime getPublishDate() {
        return publishDate;
    }

    public Media setPublishDate(ZonedDateTime publishDate) {
        this.publishDate = publishDate;
        return this;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public Media setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    public MediaCategory getMediaCategory() {
        return mediaCategory;
    }

    public Media setMediaCategory(MediaCategory mediaCategory) {
        this.mediaCategory = mediaCategory;
        return this;
    }

    public Set<Tag> getTagSet() {
        return tagSet;
    }

    public Media setTagSet(Set<Tag> tagSet) {
        this.tagSet = tagSet;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Media setUser(User user) {
        this.user = user;
        return this;
    }
}
