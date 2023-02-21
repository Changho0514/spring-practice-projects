package Practice.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("users")
    public ResponseEntity getAllUsers() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
