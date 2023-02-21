package Practice.Controller;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(length = 10)
    private String name;

    @Column(length = 11)
    private Long phoneNumber;

    @Builder
    public User(String name, Long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
