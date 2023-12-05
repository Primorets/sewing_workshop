package com.sw.sewing_workshop.textile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "textile", schema = "public")
public class Textile {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "textile_name")
    private String name;
    @Column(name = "color")
    private String color;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name="length")
    private int length;
    @Column(name = "width")
    private int width;
    @Column(name = "delivery_time")
    private LocalDateTime delivery_time;

    /*
    id,
        вид ткани,
        цвет,
        узор,
        статус доступности ткани,
        количество на данный момент (видимость для мастера),
        время доставки ткани (видимость для мастера)
     */
}
