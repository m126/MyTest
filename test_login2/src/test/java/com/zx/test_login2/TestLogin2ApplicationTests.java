package com.zx.test_login2;

import com.zx.test_login2.controller.PostController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestLogin2ApplicationTests {
    @Autowired
    PostController postController;

    @Test
    public void contextLoads() {
        postController.loadAllPostInfo();

    }

}
