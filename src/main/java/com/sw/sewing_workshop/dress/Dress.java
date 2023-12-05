package com.sw.sewing_workshop.dress;

import com.sw.sewing_workshop.textile.Textile;
import com.sw.sewing_workshop.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dress", schema = "public")
public class Dress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @ManyToOne()
    @JoinColumn(name = "textile_id", referencedColumnName = "id")
    private Textile textile;
    @ManyToOne()
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private User customer;
    @Column(name = "start_date")
    private LocalDateTime start;
    @Column(name = "end_date")
    private LocalDateTime end;
    @Enumerated(EnumType.STRING)
    private StatusDress statusDress;
/*
id,
ткань,
размер (европейский и другие с автоконвертацией),
статус готовности и доставки одежды до потребителя,
время создания (сумма: текущий загруз, доставка ткани, доставка до потребителя, примерное время работ + 2 дня )
 */
}
