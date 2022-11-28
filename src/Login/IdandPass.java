package Login;

import java.util.HashMap;

public class IdandPass {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    IdandPass(){
        logininfo.put("JV","good");
        logininfo.put("JV","GOOD");
        logininfo.put("JV","good1234");
        logininfo.put("JV","EXEC123");
    }

    protected HashMap getlogininfo(){
        return logininfo;
    }
}
