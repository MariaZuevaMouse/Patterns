package patternts.behavioral.chainOfResponsiblity.example2;

import patternts.behavioral.chainOfResponsiblity.example2.middleware.Middleware;
import patternts.behavioral.chainOfResponsiblity.example2.middleware.RoleCheckMiddleware;
import patternts.behavioral.chainOfResponsiblity.example2.middleware.ThrottlingMiddleware;
import patternts.behavioral.chainOfResponsiblity.example2.middleware.UserExistsMiddleware;
import patternts.behavioral.chainOfResponsiblity.example2.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    private static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init(){
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middlware = new ThrottlingMiddleware(2);
        middlware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middlware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do{
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        }while(!success);
    }

}
