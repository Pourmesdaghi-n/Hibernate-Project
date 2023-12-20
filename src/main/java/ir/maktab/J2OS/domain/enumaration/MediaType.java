package ir.maktab.J2OS.domain.enumaration;

import java.util.Arrays;

public enum MediaType {
    ARTICLE(1), VIDEO(2), VOICE(3), GALLERY(4);

    private int order;

    MediaType(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "MediaType{}";
    }

    public int getOrder() {
        return this.order;
    }

    public MediaType getByOrder(int order) {
        return Arrays.stream(MediaType.values()).filter(type -> type.getOrder() == order)
                .findAny().orElse(null);
    }
}
