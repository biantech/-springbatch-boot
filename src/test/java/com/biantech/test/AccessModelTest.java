package com.biantech.test;

import com.biantech.model.Access;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import java.sql.Timestamp;



@RunWith(SpringRunner.class)
@SpringBootTest
public class AccessModelTest {
    Logger logger = LoggerFactory.getLogger(AccessModelTest.class);

    @Resource
    private EntityManagerFactory emf;           //注入实例化Factory 访问数据

    @Test
    public void test(){
        logger.info("datest");
        EntityManager manager=emf.createEntityManager();
        Access access =new Access();
        access.setBrandName("brandName");
        access.setCategoryName("categoryName");
        access.setCreateTime(new Timestamp(System.currentTimeMillis()));
        manager.setFlushMode(FlushModeType.COMMIT);
        EntityTransaction transaction=manager.getTransaction();
        transaction.begin();
        manager.persist(access);
        transaction.commit();
        manager.close();
        //emf.createEntityManager().flush();
    }
}
