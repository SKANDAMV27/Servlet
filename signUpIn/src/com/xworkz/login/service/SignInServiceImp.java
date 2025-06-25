package com.xworkz.login.service;

import com.xworkz.login.dto.SignInDTO;
import com.xworkz.login.dto.SignUpDTO;
import com.xworkz.login.repository.SignInRepositry;
import com.xworkz.login.repository.SignInRepositryImp;

import java.sql.SQLException;

public class SignInServiceImp implements SignInService{


    @Override
    public boolean validiation(int userId, String passWord) {
            if(userId<=0 || passWord==null || passWord.isEmpty()){
                System.out.println("Invalaid Input.....");
                return false;
            }
        SignInRepositry signInRepositry = new SignInRepositryImp();
            signInRepositry.check(userId,passWord);
            return true;
    }

}
