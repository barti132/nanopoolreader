package pl.bartoszsredzinski.nanopoolreader.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.bartoszsredzinski.nanopoolreader.services.GeneralDataFromNanopoolService;

@Controller
public class IndexController{

    private final GeneralDataFromNanopoolService dataFromNanopoolService;

    public IndexController(GeneralDataFromNanopoolService dataFromNanopoolService){
        this.dataFromNanopoolService = dataFromNanopoolService;
    }


    @GetMapping({"/index", "/"})
    public String getIndexPage(Model model){
        model.addAttribute("NumberOfMiners", dataFromNanopoolService.getNumberOfMiners());
        model.addAttribute("NumberOfWorkers", dataFromNanopoolService.getNumberOfWorkers());
        model.addAttribute("PoolHashrate", dataFromNanopoolService.getPoolHashrate());
        model.addAttribute("ShareCoefficient", dataFromNanopoolService.getShareCoefficient());
        model.addAttribute("Prices", dataFromNanopoolService.getPrices());

        return "index";
    }
}
