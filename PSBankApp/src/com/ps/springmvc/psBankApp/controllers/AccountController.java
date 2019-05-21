package com.ps.springmvc.psBankApp.controllers;

import com.ps.springmvc.psBankApp.controllers.com.ps.springmvc.psBankApp.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AccountController {

    @RequestMapping("/")
    public String showHome(){
        return "index";
    }

    @RequestMapping("/new")
    public String newAccount(Model model){
        model.addAttribute("account", new Account());
        return "new account";
    }

    @RequestMapping("/showAccount")
    public String showAccount(){
        return "showAccount";
    }

    @RequestMapping(value = "/saveAccount", method= RequestMethod.POST)
    public String saveAccount(Model model, HttpServletRequest httpServletRequest){
        String accountNo = null;
        String accountHolder = null;
        String balance = null;

        accountNo = (String) httpServletRequest.getParameter("accountNo");
        accountHolder = (String)httpServletRequest.getParameter("accountHolderName");
        balance = (String)httpServletRequest.getParameter("balance");

//        model.addAttribute("accountNo", accountNo);
//        model.addAttribute("accountHolder", accountHolder);
//        model.addAttribute("balance", balance);

        Account account = new Account(Integer.valueOf(accountNo), accountHolder, Integer.valueOf(balance));
        model.addAttribute("account", account);
        return "showAccount";
    }

}
