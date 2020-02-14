package br.com.lucas.financialTranferSystem.controller;

import br.com.lucas.financialTranferSystem.entity.BankAccountEntity;
import br.com.lucas.financialTranferSystem.entity.UserEntity;
import br.com.lucas.financialTranferSystem.service.BankAccountService;
import br.com.lucas.financialTranferSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/")
    public String home(Map<String, Object> model) {

        List<UserEntity> allUsers = this.userService.getAllUsers();

        if ( (null!=allUsers) && (!allUsers.isEmpty()) ){
            model.put("allUsers", allUsers);
        }

        return "home";
    }

    @RequestMapping("usuario/{userId}")
    public String user(Map<String, Object>  model, @PathVariable(value="userId") Integer userId) {
        UserEntity user = this.userService.findUserById(userId);

        if (null != user){

            model.put("user", user);
            List<BankAccountEntity> accounts = bankAccountService.getAllBankAccountsByUserId(userId);

            if ( (null != accounts ) && (!accounts.isEmpty()) ) {
                model.put("accounts", accounts);
            }

            return "user";

        } else {
            model.put("errorMessage", "Usuário não encontrado!");
            return "error";
        }
    }

    @RequestMapping("conta/{accountId}")
    public String account(Map<String, Object>  model, @PathVariable(value="accountId") Integer accountId) {
        BankAccountEntity accountOrigin = bankAccountService.findBankAccountById(accountId);
        List<BankAccountEntity> allAccounts = bankAccountService.getAllBankAccounts();

        if (null != accountOrigin){


            model.put("account", accountOrigin);
            model.put("user", accountOrigin.getUser());

            if( (null != allAccounts) && (!allAccounts.isEmpty()) ) {
                model.put("allAccounts", allAccounts);
            }

            return "account";
        } else {
            model.put("errorMessage", "Usuário não encontrado!");
            return "error";
        }
    }

}
