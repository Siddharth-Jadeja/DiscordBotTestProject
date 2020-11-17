package demoBot;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class demoBotAttempt1 {
    public static JDA jda;

    //Main Method
    public static void main(String[] args) throws LoginException {
        jda = new JDABuilder(AccountType.BOT).setToken("Nzc4MDkxOTc5MjM2OTY2NDAx.X7M8oA._BkzrepKkX76el6YIoudrxAfKnE").build();

    }

}
