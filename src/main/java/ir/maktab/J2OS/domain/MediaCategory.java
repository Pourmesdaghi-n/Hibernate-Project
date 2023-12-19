package ir.maktab.J2OS.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = MediaCategory.TABLE_NAME)
public class MediaCategory extends BaseCategory<MediaCategory> {

    public static final String TABLE_NAME = "media_category";
}
