package com.ustc.plan;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Rudy on 2014/10/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    locations = {
            "classpath*:/config/spring/appcontext-*.xml"
    }
)
public abstract class TestBase {
}
