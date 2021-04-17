package io.googleguice.practice;

import javax.inject.Inject;

public class HelloService {

    private HelloDao helloDao;

    @Inject
    public HelloService(HelloDao helloDao) {
        this.helloDao = helloDao;
    }

    public HelloDao getHelloDao() {
        return helloDao;
    }
}
