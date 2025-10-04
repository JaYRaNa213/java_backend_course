package ticket_booking.services;
import java.util.*;
import java.io.*;


import ticket_booking.entities.User;
import jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import ticket_booking.util.UserServiceUtil;

import static java.util.spi.ToolProvider.findFirst;



public class UserBookingService {

  private User user;

  private List<User> userList;

  private static ObjectMapper OBJECT_MAPPER = new ObjectMapper();


  private static final String USERS_PATH = "app/src/main/java/ticket_booking/localDb/users.json";




  public UserBookingService(User user1) throws IOException{

    this.user = user1;

    loadUsers();
  }


  public UserBookingService() throws IOException{
    loadUsers();

  }
/// // load users from the .json
  public List<User> loadUsers() throws IOException{


    File users = new File(USERS_PATH);

    userList = OBJECT_MAPPER.readValue(users, new TypeReference<List<User>>() {});

  }




  public Boolean loginUser(){
    Optional<User> foundUser = userList.stream().filter(user1 ->{
      return user1.getName().equals(user.getName() && UserServiceUtil.checkPassword(user.getPassword(),user1.getHashPasswordString()))
    })findFirst();

    return foundUser.isPresent();

  }


  public Boolean signUp(User user1){

    try{

      userList.add(user1);
      saveUserListToFile();
      return Boolean.TRUE;

    }catch (IOException ex){
      return Boolean.FALSE;
    }
  }

  private void saveUserListToFile() throws IOException {

    File usersFile = new File(USERS_PATH);


    objectMapper.writeValue(usersFile,userList);
  }


}
