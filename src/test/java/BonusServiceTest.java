import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000000;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNoneRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 2000;
        boolean registered = false;
        long expected = 20;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNoneRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 2000000;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }




}