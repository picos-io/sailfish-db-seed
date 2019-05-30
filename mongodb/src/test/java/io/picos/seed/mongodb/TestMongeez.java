package io.picos.seed.mongodb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestMongodbSeedApplication.class)
@ActiveProfiles(profiles = "test")
public class TestMongeez {

    @Test
    public void testFeed() {
        //do nothing just start the application, the mongeez will execute automatically
    }

}
