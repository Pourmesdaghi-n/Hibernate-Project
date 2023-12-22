package ir.maktab.J2OS.domain;

import ir.maktab.J2OS.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseCategory<E extends BaseCategory<E>> extends BaseEntity<Long> {
    public static final String PARENT_ID = "parent_id";
    public static final String TITLE = "title";

    @Column(name = TITLE)
    private String title;

    @ManyToOne
    @JoinColumn(name = PARENT_ID)
    private E parent;

    @OneToMany
    @JoinColumn(name = PARENT_ID)
    private Set<E> childrenCategories = new HashSet<>();


}
