package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.Account;


@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
    private com.rt.service.AccountService accountService;

    // Create account
    @PostMapping("/account")
    public ResponseEntity<Account> createAccount(
            @RequestBody Account account) {

        Account savedAccount =
                accountService.createAccount(account);

        return new ResponseEntity<>(
                savedAccount,
                HttpStatus.CREATED
        );
    }

    // Get account
    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(
            @PathVariable Long id) {

        Account account =
                accountService.getAccount(id);

        return ResponseEntity.ok(account);
    }

    // Transfer money
    @PostMapping("/transfer")
    public ResponseEntity<String> transferMoney(
            @RequestParam Long from,
            @RequestParam Long to,
            @RequestParam double amount) {

        accountService.transferMoney(
                from,
                to,
                amount
        );

        return ResponseEntity.ok(
                "Money transferred successfully"
        );
    }
}
