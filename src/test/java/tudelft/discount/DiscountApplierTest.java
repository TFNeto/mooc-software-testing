package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;

public class DiscountApplierTest {


    @Test
    public void TestBusinessProduct(){
        ProductDao MockedDao = Mockito.mock(ProductDao.class);
        List<Product> ProductsList = new ArrayList<Product>();

        ProductsList.add(new Product("Phone",100, "BUSINESS"));

        Mockito.when(MockedDao.all()).thenReturn(ProductsList);
        DiscountApplier discounts= new DiscountApplier(MockedDao);
        discounts.setNewPrices();

        Assertions.assertEquals(110,ProductsList.get(0).getPrice(),0.00001);
    }
    @Test
    public void TestHomeProduct(){
        ProductDao MockedDao = Mockito.mock(ProductDao.class);
        List<Product> ProductsList = new ArrayList<Product>();

        ProductsList.add(new Product("Phone",100, "HOME"));

        Mockito.when(MockedDao.all()).thenReturn(ProductsList);
        DiscountApplier discounts= new DiscountApplier(MockedDao);
        discounts.setNewPrices();

        Assertions.assertEquals(90,ProductsList.get(0).getPrice(),0.00001);
    }
}
