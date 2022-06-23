package com.laioffer.onlineorder.dao;
import com.laioffer.onlineorder.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository//这是spring的annotation，里面也有一个component，专门跟数据库交互
public class CustomerDao {

    public void signUp(Customer customer) {
    }

    public Customer getCustomer(String email) {
        return new Customer();
    }
}

