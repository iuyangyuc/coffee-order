package edu.iu.habahram.coffeeorder.controllers;

import edu.iu.habahram.coffeeorder.model.Customer;
import edu.iu.habahram.coffeeorder.repository.CustomerRepository;
import edu.iu.habahram.coffeeorder.security.TokenService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AuthenticationController {

    private final AuthenticationManager authenticationmanager;
    private final TokenService tokenService;
    CustomerRepository customerRepository;

    public AuthenticationController(CustomerRepository customerRepository, AuthenticationManager authenticationmanager, TokenService tokenService) {
        this.customerRepository = customerRepository;
        this.authenticationmanager = authenticationmanager;
        this.tokenService = tokenService;
    }

    @PostMapping("/signup")
    public void signup(@RequestBody Customer customer) {
        try {
            customerRepository.save(customer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/login")
    public String login(@RequestBody Customer customer) {
        Authentication authentication = authenticationmanager.authenticate(
                new UsernamePasswordAuthenticationToken(customer.username(), customer.password())
        );
        return tokenService.generateToken(authentication);
    }
}
