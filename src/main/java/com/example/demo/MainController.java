package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping (path = "/app")
public class MainController {
@Autowired
    public com.example.demo.Users usersDataBase;

@PutMapping(path = "/add")
public @ResponseBody  String addNewOne (@RequestParam ("name") String name, @RequestParam ("password") String password){
    User user = new User();

    user.setName(name);
    user.setPassword(password);
    usersDataBase.save(user);

    return "Saved to DataBase!!!";
}
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {

        return usersDataBase.findAll();

    }
@PutMapping (path = "/putMe")
    public String updateUser (@RequestBody String username )
{

    User user = new User  ();

    /*Iterable<User> n ;
    n = usersDataBase.findAll() ;

    username = "ASD";
    user.setName(username);*/

    return "All set up!!";
}

@DeleteMapping(path = "/delete")
public ResponseEntity<Void>  deleteUser(){
    User user = new User();
    user.setId(1);
    user.setPassword("123asd");
    user.setName("asd");
    usersDataBase.delete(user);
    return new ResponseEntity<Void>(HttpStatus.OK);
}



}
