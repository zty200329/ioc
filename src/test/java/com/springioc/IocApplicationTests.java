package com.springioc;

import com.springioc.car.Audi;
import com.springioc.car.Buick;
import com.springioc.humen.Humen;
import com.springioc.humen.LiSi;
import com.springioc.humen.ZhangSan;
import org.junit.Before;
import org.junit.Test;

public class IocApplicationTests {

    private IoCContainer ioCContainer = new IoCContainer();

    /**
     * 所有的依赖关系都被集中统一的管理起来，清晰明了
     */
    /**
     * 每个类只需要关注于自己的业务逻辑
     */
    /**
     * 修改依赖关系是很容易的
     */
    @Before
    public void before(){
        ioCContainer.setBean(Audi.class,"audi");
        ioCContainer.setBean(Buick.class,"buick");
        ioCContainer.setBean(ZhangSan.class,"zhangsan","audi");
        ioCContainer.setBean(LiSi.class,"lisi","buick");
    }
    @Test
    public void contextLoads() {
        Humen zhangsan = (Humen) ioCContainer.getBean("zhangsan");
        zhangsan.goHome();
        Humen lisi = (Humen) ioCContainer.getBean("lisi");
        lisi.goHome();
    }

}
