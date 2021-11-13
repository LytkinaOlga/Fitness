package by.bntu.fitr.lytkina.exceptions;

public class UserWasNotCreatedException extends RuntimeException{
    private final String userName;

    public UserWasNotCreatedException(String userName){
        this.userName = userName;
    }

    @Override
    public String getMessage() {
        return "User with name " + userName + " was not created!";
    }
}
