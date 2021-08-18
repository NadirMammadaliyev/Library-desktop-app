/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.nadir.library.service.impl;

import az.nadir.library.dao.LoginUserDao;
import az.nadir.library.model.LoginUser;
import az.nadir.library.service.LoginUserService;

/**
 *
 * @author Asus
 */
public class LoginUserServiceImpl implements LoginUserService{

    private  LoginUserDao loginUserDao;

    public LoginUserServiceImpl(LoginUserDao loginUserDao) {
        this.loginUserDao=loginUserDao;
    }
    
    
    
    
    
    @Override
    public LoginUser login(String username, String password) throws Exception {
        return loginUserDao.login(username, password);
    }
    
}
