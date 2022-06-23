package com.laioffer.onlineorder;

import com.laioffer.onlineorder.entity.Customer;
import com.laioffer.onlineorder.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller//里面也包含了component
public class SignUpController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void signUp(@RequestBody Customer customer) {
        System.out.println(customer.getFirstName());
        customerService.signUp(customer);
    }
}

/*import com.laioffer.onlineorder.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@Controller//必须写，用来让dispatch servlet知道我这里有些方法可以处理http request
public class SignUpController {
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    //根据signup的网址以及method建立mapping，表示signup是个http POST请求，至于如何执行取决于@RequestBody
    @ResponseStatus(value = HttpStatus.CREATED)
    public void signUp(@RequestBody Customer customer, HttpServletRequest request)//这个annotation是把前端发送过来的json数据de-serialize成Customer类field
    {
    }
}*/

