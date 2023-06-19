import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PrinterTest {
    Printer printer1;
    Printer printer2;
    Printer printer3;

    @Before
    public void before(){
        printer1 = new Printer(400,2000);
        printer2 = new Printer(70,2000);
        printer3 = new Printer(500,100);
    }

    @Test
    public  void init_values_printer1(){
        int page = printer1.pageLevel();
        int toner = printer1.tonerLevel();
        assertEquals(400,page);
        assertEquals(2000,toner);
    }
    @Test
    public  void init_values_printer2(){
        int page = printer2.pageLevel();
        int toner = printer2.tonerLevel();
        assertEquals(70,page);
        assertEquals(2000,toner);
    }
    @Test
    public  void init_values_printer3(){
        int page = printer3.pageLevel();
        int toner = printer3.tonerLevel();
        assertEquals(500,page);
        assertEquals(100,toner);
    }
    @Test
    public void print(){
        printer1.print(30,2);
        int page = printer1.pageLevel();
        int toner = printer1.tonerLevel();
        assertEquals(340,page);
        assertEquals(1940,toner);
    }
    @Test
    public void low_in_pages(){
        printer2.print(50,3);
        int page = printer2.pageLevel();
        int toner = printer2.tonerLevel();
        assertEquals(70,page);
        assertEquals(2000,toner);
    }
    @Test
    public void low_toner_level(){
        printer3.print(50,3);
        int page = printer3.pageLevel();
        int toner = printer3.tonerLevel();
        assertEquals(500,page);
        assertEquals(100,toner);
    }
}
