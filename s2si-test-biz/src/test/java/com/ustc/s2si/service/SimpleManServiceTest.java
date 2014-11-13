package com.ustc.s2si.service;

import com.ustc.s2si.TestBase;
import com.ustc.s2si.entity.SimpleMan;
import static junit.framework.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

/**
 * Created by Rudy on 2014/10/15.
 */
public class SimpleManServiceTest extends TestBase {

    @Autowired
    private SimpleManService simpleManService;

    @Test
    public void testFind(){

        int id = 1;
        SimpleMan man = simpleManService.findById(id);
        assertNotNull(man);
    }

    @Test
    public void testAdd(){

        String name = "小测";
        int age = 100;
        String sex = "女";

        SimpleMan man = new SimpleMan();
        man.setName(name);
        man.setAge(age);
        man.setSex(sex);

        int id = simpleManService.add(man);

        assertTrue(id > 0);
    }

    /**
     * 为系统添加测试数据
     */
//    @Test
    public void addTestData(){

        SimpleMan man = null;
        boolean sex = false;
        Random random = new Random();
        for (int i=5;i<100;i++){
            man = new SimpleMan();
            man.setName(String.format("第%d人",i));
            man.setAge(random.nextInt(100));
            if (sex){
                man.setSex("男");
                sex = false;
            }else {
                man.setSex("女");
                sex = true;
            }
            simpleManService.add(man);
        }
    }

    @Test
    public void testDel(){

        String name = "小测";
        int age = 100;
        String sex = "女";

        SimpleMan man = new SimpleMan();
        man.setName(name);
        man.setAge(age);
        man.setSex(sex);

        int id = simpleManService.add(man);

        assertTrue(id > 0);

        simpleManService.delete(id);

        man = simpleManService.findById(id);

        assertNull(man);

    }
}
