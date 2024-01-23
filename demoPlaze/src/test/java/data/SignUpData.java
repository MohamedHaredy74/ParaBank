package data;

import net.datafaker.Faker;

public class SignUpData {

    Faker faker=new Faker();
    UserData userData=new UserData(faker.funnyName().name(),faker.number().digits(6));

    public String username ()
    {
        return  userData.username();
    }
    public String password()
    {
        return userData.password();
    }
}
