package az.nadir.library.main;

import az.nadir.library.dao.AuthorDao;
import az.nadir.library.dao.BookDao;
import az.nadir.library.dao.BookInfoDao;
import az.nadir.library.dao.DBHelper;
import az.nadir.library.dao.EmployeeDao;
import az.nadir.library.dao.GiveBookDao;
import az.nadir.library.dao.LanguageDao;
import az.nadir.library.dao.PositionDao;
import az.nadir.library.dao.ReadingRoomDao;
import az.nadir.library.dao.ShelfDao;
import az.nadir.library.dao.TopicDao;
import az.nadir.library.dao.UserDao;
import az.nadir.library.dao.impl.AuthorDaoImpl;
import az.nadir.library.dao.impl.BookDaoImpl;
import az.nadir.library.dao.impl.BookInfoDaoImpl;
import az.nadir.library.dao.impl.EmployeeDaoImpl;
import az.nadir.library.dao.impl.GiveBookDaoImpl;
import az.nadir.library.dao.impl.LanguageDaoImpl;
import az.nadir.library.dao.impl.PositionDaoImpl;
import az.nadir.library.dao.impl.ReadingRoomDaoImpl;
import az.nadir.library.dao.impl.ShelfDaoImpl;
import az.nadir.library.dao.impl.TopicDaoImpl;
import az.nadir.library.dao.impl.UserDaoImpl;
import az.nadir.library.gui.LoginFrame;
import az.nadir.library.gui.MainFrame;
import az.nadir.library.model.Author;
import az.nadir.library.model.BookInfo;
import az.nadir.library.model.Employee;
import az.nadir.library.model.GiveBook;
import az.nadir.library.model.Language;
import az.nadir.library.model.Position;
import az.nadir.library.model.Shelf;
import az.nadir.library.model.Topic;
import az.nadir.library.model.User;
import az.nadir.library.service.AuthorService;
import az.nadir.library.service.BookInfoService;
import az.nadir.library.service.BookService;
import az.nadir.library.service.EmployeeService;
import az.nadir.library.service.GiveBookService;
import az.nadir.library.service.LanguageService;
import az.nadir.library.service.PositionService;
import az.nadir.library.service.ReadingRoomService;
import az.nadir.library.service.ShelfService;
import az.nadir.library.service.TopicService;
import az.nadir.library.service.UserService;
import az.nadir.library.service.impl.AuthorServiceImpl;
import az.nadir.library.service.impl.BookInfoServiceImpl;
import az.nadir.library.service.impl.BookServiceImpl;
import az.nadir.library.service.impl.EmployeeServiceImpl;
import az.nadir.library.service.impl.GiveBookServiceImpl;
import az.nadir.library.service.impl.LanguageServiceImpl;
import az.nadir.library.service.impl.PositionServiceImpl;
import az.nadir.library.service.impl.ReadingRoomServiceImpl;
import az.nadir.library.service.impl.ShelfServiceImpl;
import az.nadir.library.service.impl.TopicServiceImpl;
import az.nadir.library.service.impl.UserServiceImpl;
import az.nadir.library.util.Utility;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UserDao userDao = new UserDaoImpl();
        UserService userService = new UserServiceImpl(userDao);

        LanguageDao languageDao = new LanguageDaoImpl();
        LanguageService languageService = new LanguageServiceImpl(languageDao);

        AuthorDao authorDao = new AuthorDaoImpl();
        AuthorService authorService = new AuthorServiceImpl(authorDao);

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        EmployeeService employeeService = new EmployeeServiceImpl(employeeDao);
        
        TopicDao topicDao = new TopicDaoImpl();
        TopicService topicService = new TopicServiceImpl(topicDao);
        
        PositionDao positionDao = new PositionDaoImpl();
        PositionService positionService = new PositionServiceImpl(positionDao);
        
        BookDao bookDao = new BookDaoImpl();
        BookService bookService = new BookServiceImpl(bookDao);
        
        ShelfDao shelfDao = new ShelfDaoImpl();
        ShelfService shelfService = new ShelfServiceImpl(shelfDao);
        
        BookInfoDao bookInfoDao = new BookInfoDaoImpl();
        BookInfoService bookInfoService = new BookInfoServiceImpl(bookInfoDao);
        
        ReadingRoomDao readingRoomDao = new ReadingRoomDaoImpl();
        ReadingRoomService readingRoomService = new ReadingRoomServiceImpl(readingRoomDao);
        
        GiveBookDao giveBookDao = new GiveBookDaoImpl();
        GiveBookService giveBookService = new GiveBookServiceImpl(giveBookDao);

        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
       
         try{
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
       }catch(Exception ex){
           ex.printStackTrace();
       }
         
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        loginFrame.setTitle("Log in");
        loginFrame.setLocationRelativeTo(null);
      
         
    }

}
