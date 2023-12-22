package ir.maktab.J2OS.domain;

import ir.maktab.J2OS.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = Tag.TABLE_NAME)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tag extends BaseEntity<Long> {
    public static final String TABLE_NAME = "tag_table";
    public static final String TITLE = "title";

    @Column(name = TITLE)
    private String title;

}
