package dev.westerhofen;

import org.junit.Assert;
import org.junit.Test;

import com.github.database.rider.cdi.api.DBRider;
import com.github.database.rider.core.api.dataset.DataSet;

import dev.westerhofen.dataBase.DataBaseyfeCicle;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

@DBRider
@QuarkusTest
@QuarkusTestResource(DataBaseyfeCicle.class)
public class CarTest {

    @Test
    @DataSet("carro1.yml")
    public void testUM() {
         
        Assert.assertEquals(getClass(), getClass());
    }

}
