package backend.ostats.controller;

import backend.ostats.models.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class mainController {

    @GetMapping(value = "/account")
    public ResponseEntity<Account> getAccountByLogin() {
        ResponseEntity<Account> account = new ResponseEntity<Account>(HttpStatus.OK);

        return account;
    }
}
