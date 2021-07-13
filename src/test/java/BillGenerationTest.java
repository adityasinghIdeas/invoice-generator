import core.impl.BillGenerator;
import model.BillInput;
import org.junit.jupiter.api.Test;

public class BillGenerationTest {

    @Test
    public void test1 (){
        BillInput billInput = new BillInput();
        billInput.setCabinSeatingCount(3);
        billInput.setOpenSeatingCount(2);
        billInput.setConferenceRommHours(35);
        billInput.setMealCount(5);
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(billInput);
    }

    @Test
    public void test2 (){
        BillInput billInput = new BillInput();
        billInput.setCabinSeatingCount(1);
        billInput.setConferenceRommHours(50);
        billInput.setMealCount(10);
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(billInput);
    }

    @Test
    public void test3 (){
        BillInput billInput = new BillInput();
        billInput.setOpenSeatingCount(2);
        billInput.setMealCount(30);
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(billInput);
    }
}
