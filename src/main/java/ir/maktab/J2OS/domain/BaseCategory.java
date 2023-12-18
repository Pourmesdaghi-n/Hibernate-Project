package ir.maktab.J2OS.domain;

import ir.maktab.J2OS.base.domain.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
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


    public BaseCategory() {
    }

    public BaseCategory(String title, E parent, Set<E> childrenCategories) {
        this.title = title;
        this.parent = parent;
        this.childrenCategories = childrenCategories;
    }

    public static String getParentId() {
        return PARENT_ID;
    }

    public String getTitle() {
        return title;
    }

    public BaseCategory<E> setTitle(String title) {
        this.title = title;
        return this;
    }

    public E getParent() {
        return parent;
    }

    public BaseCategory<E> setParent(E parent) {
        this.parent = parent;
        return this;
    }

    public Set<E> getChildrenCategories() {
        return childrenCategories;
    }

    public BaseCategory<E> setChildrenCategories(Set<E> childrenCategories) {
        this.childrenCategories = childrenCategories;
        return this;
    }


}
