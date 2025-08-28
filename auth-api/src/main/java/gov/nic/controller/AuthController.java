package gov.nic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import gov.nic.model.Message;
import gov.nic.security.JwtUtil;


@RestController
@RequestMapping("/auth")
public class AuthController {		
	@Autowired
    private JwtUtil jwtUtil;

	    // Login POST: expects JSON with "id" and "password"
	    @PostMapping("/login")
	    public Map<String, String> login(@RequestBody Map<String, String> user) {
	        String username = user.get("id");
	        String password = user.get("password");

	      //  authManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

	        String token = jwtUtil.generateToken(username);

	        Map<String, String> response = new HashMap<>();
	        response.put("message", "Login success");
	        response.put("token", token);

	        return response;
	    }
}
