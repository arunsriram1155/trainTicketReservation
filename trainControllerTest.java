// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;

// import java.util.HashMap;
// import java.util.Map;

// import codinpad.model.User;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.*;

// class TrainControllerTest {

//     @Mock
//     private Map<String, User> users;

//     @InjectMocks
//     private TrainController trainController;

//     @BeforeEach
//     void setUp() {
//         MockitoAnnotations.initMocks(this);
//     }

//     @Test
//     void testPurchaseTicket_ValidRoute() {
//         // Mocking
//         User user = new User();
//         when(users.size()).thenReturn(3);

//         // Test
//         ResponseEntity<Map<String, Object>> response = trainController.purchaseTicket(user, "London", "France");

//         // Verify
//         assertEquals(HttpStatus.OK, response.getStatusCode());
//         Map<String, Object> responseBody = response.getBody();
//         assertEquals("London", responseBody.get("From"));
//         assertEquals("France", responseBody.get("To"));
//         assertEquals(user, responseBody.get("User"));
//         assertEquals("20.0$", responseBody.get("Price Paid"));
//     }

//      @Test
//     void testGetReceipt_UserDoesNotExist() {
//         // Mocking
//         when(users.get("john@example.com")).thenReturn(null);

//         // Test
//         ResponseEntity<Map<String, Object>> response = trainController.getReceipt("john@example.com");

//         // Verify
//         assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
//         assertNull(response.getBody());
//     }

//      @Test
//     void testGetReceipt_UserExists() {
//         // Mocking
//         User user = new User("John", "john@example.com");
//         user.setSeat("A1");
//         when(users.get("john@example.com")).thenReturn(user);

//         // Test
//         ResponseEntity<Map<String, Object>> response = trainController.getReceipt("john@example.com");

//         // Verify
//         assertEquals(HttpStatus.OK, response.getStatusCode());
//         Map<String, Object> responseBody = response.getBody();
//         assertEquals("London", responseBody.get("From"));
//         assertEquals("France", responseBody.get("To"));
//         assertEquals(user, responseBody.get("User"));
//         assertEquals("20.0$", responseBody.get("Price Paid"));
//     }


//   @Test
//     void testGetUsers() {
//         // Mocking
//         Map<String, User> expectedUsers = new HashMap<>();
//         expectedUsers.put("john@example.com", new User("John", "john@example.com"));
//         when(users).thenReturn(expectedUsers);

//         // Test
//         Map<String, User> result = trainController.getUsers();

//         // Verify
//         assertEquals(expectedUsers, result);
//     }
     
// }
