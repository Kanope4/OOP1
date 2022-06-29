
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

public class RadioTest {
    @Test
    public void test () {
        Object stationsCount;
        Radio radio = new Radio (stationsCount:20);
        radio.setCurrentStation(15);

        assertEquals(15, radio.getCurrentStation() );
    }

}