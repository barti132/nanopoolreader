package pl.bartoszsredzinski.nanopoolreader.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.bartoszsredzinski.nanopoolreader.model.account.AccountInfo;
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

        AccountInfo accountInfo = accountDataService.getAccountInfo(address);
        model.addAttribute("info", accountInfo);
        model.addAttribute("payout", (int)(accountInfo.getData().getBalance() / accountDataService.getPayout(address).getData().getPayout() * 100));
        model.addAttribute("chartData", accountDataService.getCharData(address));

        return "account";
    }
}
