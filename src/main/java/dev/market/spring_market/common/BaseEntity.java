package dev.market.spring_market.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Column(name = "created_at")
    @CreatedDate
    private LocalDateTime createdAt ;

    @Column(name = "updated_at")
    @LastModifiedDate
    private LocalDateTime updatedAt ;

    private int status;

    public BaseEntity(LocalDateTime createdAt,int status) {
        this.createdAt=createdAt;
        this.status = status;
    }
}
