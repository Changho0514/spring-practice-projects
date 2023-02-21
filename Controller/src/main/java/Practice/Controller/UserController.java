package Practice.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.util.Optional;

@RestController
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @PostMapping("/join")
    public ResponseEntity<Object> join(@RequestBody UserJoinDto userJoinDto) {
        userDaoService.join(userJoinDto);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/user/{id}")
    public ResponseEntity<Message> findById(@PathVariable Long id) {
        Optional<User> user = userDaoService.findOne(id);
        Message message = new Message();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        message.setStatus(StatusEnum.OK);
        message.setMessage("성공 코드");
        message.setData(user);

        return new ResponseEntity<>(message, headers, HttpStatus.OK);
    }
}
