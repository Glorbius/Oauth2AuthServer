package kz.marat.authserver.resource;

import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @RequestMapping("/user")
    public HttpTrace.Principal user(HttpTrace.Principal user)
    {
        return user;
    }
}