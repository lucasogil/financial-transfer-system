package br.com.lucas.financialTranferSystem.controller;

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

    @RequestMapping("/")
    public String index(Map<String, Object> model) {

        List<UserEntity> allUsers = this.userService.getAllUsers();

        if ( (null!=allUsers) && (!allUsers.isEmpty()) ){
            model.put("allUsers", allUsers);
        }

        return "index";
    }

    @GetMapping("initial/{userId}")
    public String home(Model model, @PathVariable(value="userId") Integer userId) {
        UserEntity user = this.userService.findUserById(userId);

        if (null != user){
            model.addAttribute("user", user);
            model.addAttribute("bankAccount", bankAccountService.findBankAccountById(userId));
            return "home";

        } else {
            model.addAttribute("errorMessage", "Usuário não encontrado!");
            return "error";
        }
    }

}
