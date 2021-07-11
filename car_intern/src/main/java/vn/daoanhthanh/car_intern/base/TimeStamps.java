package vn.daoanhthanh.car_intern.base;

import java.time.LocalDateTime;

public interface TimeStamps {
    LocalDateTime getCreatedAt();
    void setCreatedAt(LocalDateTime time);

    LocalDateTime getUpdatedAt();
    void setUpdatedAt(LocalDateTime time);

}