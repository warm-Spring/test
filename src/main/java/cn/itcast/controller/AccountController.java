package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accoutService;


    /**
     * 查询所有的数据
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll() {
        System.out.println("表现层：查询所有账户...");
        List<Account> list = accoutService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        return "list";
    }
}
