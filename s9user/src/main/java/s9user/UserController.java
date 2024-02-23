package s9user;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final MeterRegistry meterRegistry;

    public UserController(UserService userService, MeterRegistry meterRegistry) {
        this.userService = userService;
        this.meterRegistry = meterRegistry;
    }

    @GetMapping
    public List<User> getAllUsers() {
        meterRegistry.counter("seminar_11_getAllUsers").increment();
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        meterRegistry.counter("seminar_11_getUserById").increment();
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        meterRegistry.counter("seminar_11_create_user").increment();
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestParam String name) {
        return userService.updateUser(id, name);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
