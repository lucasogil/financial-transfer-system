package br.com.lucas.financialTranferSystem.controller;

import br.com.lucas.financialTranferSystem.entity.BankAccountEntity;
import br.com.lucas.financialTranferSystem.entity.UserEntity;
import br.com.lucas.financialTranferSystem.service.BankAccountService;
import br.com.lucas.financialTranferSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class WebViewController {

    @Autowired
    private UserService userService;

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping("/")
    public String home(Map<String, Object> model) {

        List<UserEntity> allUsers = this.userService.getAllUsers();

        if ( (null!=allUsers) && (!allUsers.isEmpty()) ){
            model.put("allUsers", allUsers);
        }

        return "home";
    }

    @GetMapping("usuario/{userId}")
    public String user(Model model, @PathVariable(value="userId") Integer userId) {
        UserEntity user = this.userService.findUserById(userId);

        if (null != user){

            model.addAttribute("user", user);
            List<BankAccountEntity> accounts = bankAccountService.getAllBankAccountsByUserId(userId);

            if ( (null != accounts ) && (!accounts.isEmpty()) ) {
                model.addAttribute("accounts", accounts);
            }

            return "user";

        } else {
            model.addAttribute("errorMessage", "Usuário não encontrado!");
            return "error";
        }
    }

    @GetMapping("conta/{accountId}")
    public String account(Model model, @PathVariable(value="accountId") Integer accountId) {
        BankAccountEntity accountOrigin = bankAccountService.findBankAccountById(accountId);
        List<BankAccountEntity> allAccounts = bankAccountService.getAllBankAccounts();

        if (null != accountOrigin){


            model.addAttribute("account", accountOrigin);
            model.addAttribute("user", accountOrigin.getUser());

            if( (null != allAccounts) && (!allAccounts.isEmpty()) ) {
                model.addAttribute("allAccounts", allAccounts);
            }

            return "account";
        } else {
            model.addAttribute("errorMessage", "Usuário não encontrado!");
            return "error";
        }
    }

}
