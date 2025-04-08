package org.example.bootjspex.model.dto;

import jakarta.persistence.*;
import lombok.*;

// Lombok
@Getter
@Setter
@NoArgsConstructor // 그냥 생성자
@ToString // 주소값(객체값) 으로 뜨지않고 String 형태로
//@AllArgsConstructor // 모든 필드를 만드는 생성자
//@RequiredArgsConstructor // 꼭 있어야하는 생성자 (자동으로 만들어지는 필드 제외)
// JPA
@Entity
public class RealEstate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private long price;
}
