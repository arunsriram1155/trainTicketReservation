package codinpad.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import codinpad.model.User;

@RestController public class TrainController {

  private final Map<String, User> users = new HashMap<>();
  private final Double ticketPrice=20.0;
  
   @GetMapping("/users")
    public Map<String, User> getUsers() {
        return users;
    }


  

    @PostMapping("/ticket")
    public ResponseEntity<Map<String, Object>>  purchaseTicket(@RequestBody User user,
                                  @RequestParam String from,
                                  @RequestParam String to) {
        Map<String, Object> responseBody = new HashMap<>();
        if (!from.equals("London") || !to.equals("France")) {
            responseBody.put("Invalid route",null);
            return ResponseEntity.ok(responseBody);
        }

      
        // Book a ticket and assign seat
        if (users.size() < 4) { // Assuming 2 sections with 2 seats each
            user.setSeat("A" + (users.size() + 1));
        } else {
            user.setSeat("B" + (users.size() - 1));
        }

        users.put(user.getEmail(), user);
        responseBody.put("From", from);
        responseBody.put("To", to);
        responseBody.put("User", user);
        responseBody.put("Price Paid", ticketPrice+ "$");

        return ResponseEntity.ok(responseBody);
    }

     @DeleteMapping("/remove/{email}")
    public User removeUser(@PathVariable String email) {
        return users.remove(email);
    }

    @PutMapping("/modify/{email}")
    public boolean modifyUserSeat(@PathVariable String email, @RequestParam String newSeat) {
        User user = users.get(email);
        if (user != null) {
            user.setSeat(newSeat);
            return true;
        }
        return false;
    }

     @GetMapping("/receipt/{email}")
    public ResponseEntity<Map<String, Object>> getReceipt(@PathVariable String email) {
        Map<String, Object> responseBody = new HashMap<>();
        User user = users.get(email);
        responseBody.put("From", "London");
        responseBody.put("To", "France");
        responseBody.put("User", user);
        responseBody.put("Price Paid", ticketPrice+ "$");
         return ResponseEntity.ok(responseBody);
    }

}
