package Practice.Controller;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserJoinDto {
    private String name;
    private Long phoneNumber;


    public User toEntity(){
        return User.builder()
                .phoneNumber(phoneNumber)
                .name(name)
                .build();
    }

}
