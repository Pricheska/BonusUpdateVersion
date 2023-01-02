

    import Netology.homeworks.BonusService;
    import org.junit.jupiter.params.ParameterizedTest;
    import org.junit.jupiter.params.provider.CsvFileSource;

    import static org.junit.jupiter.api.Assertions.*;

    public class BonusServiceTest {

        @ParameterizedTest
        @CsvFileSource(files = "src/test/resources/bonus.csv")
        void shouldCalculateForRegisteredAndUnderLimit(long amount, boolean registered, long expected) {
            BonusService service = new BonusService();

//            long amount = 1000;
//            boolean registered = true;
//            long expected = 30;

            long actual = service.calculate(amount, registered);

            assertEquals(expected, actual);
        }
    }

//        @org.junit.jupiter.api.Test
//        void shouldCalculateForRegisteredAndOverLimit() {
//            BonusService service = new BonusService();
//
//            long amount = 1_000_000;
//            boolean registered = true;
//            long expected = 500;
//
//            long actual = service.calculate(amount, registered);
//            assertEquals(expected, actual);
//        }
