package ir.maktab.J2OS.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = MediaCategory.TABLE_NAME)
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class MediaCategory extends BaseCategory<MediaCategory> {

    public static final String TABLE_NAME = "media_category";
}
