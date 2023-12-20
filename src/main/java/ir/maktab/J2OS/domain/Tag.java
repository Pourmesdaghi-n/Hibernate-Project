package ir.maktab.J2OS.domain;

import ir.maktab.J2OS.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Tag.TABLE_NAME)
public class Tag extends BaseEntity<Long> {
    public static final String TABLE_NAME = "tag_table";
    public static final String TITLE = "title";

    @Column(name = TITLE)
    private String title;

    public Tag() {
    }

    public Tag(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Tag setTitle(String title) {
        this.title = title;
        return this;
    }
}
