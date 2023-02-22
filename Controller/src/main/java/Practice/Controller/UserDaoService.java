package Practice.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDaoService {

    private final UserRepository userRepository;

    public Optional<User> findOne(Long id) {
        return Optional.ofNullable(userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("UserPrincipalNotFoundException")
        ));
    }

    public void join(UserJoinDto userJoinDto) {
        User user = userJoinDto.toEntity();
        userRepository.save(user);
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }
}
