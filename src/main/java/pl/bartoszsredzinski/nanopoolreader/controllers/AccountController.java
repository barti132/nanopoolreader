package pl.bartoszsredzinski.nanopoolreader.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.bartoszsredzinski.nanopoolreader.services.AccountDataService;

@Controller
public class AccountController{

    private final AccountDataService accountDataService;

    public AccountController(AccountDataService accountDataService){
        this.accountDataService = accountDataService;
    }

    @PostMapping("/address")
    public String getAccount(@RequestParam(value = "address", required = false)String address, Model model){
        model.addAttribute("address", address);
        model.addAttribute("info", accountDataService.getAccountInfo(address));
        model.addAttribute("payout", accountDataService.getPayout(address));
        model.addAttribute("chartData", accountDataService.getCharData(address));

        return "account";
    }
}
