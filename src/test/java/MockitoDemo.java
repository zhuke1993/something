import org.testng.annotations.Test;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by ZHUKE on 2016/9/18.
 */
public class MockitoDemo {
    @Test
    public void test1() {
        List mock = mock(List.class);
        mock.add("zhuke");
        when(mock.get(0)).thenReturn("hahfadhfkdjfkdjs");
        System.out.println(mock.get(0));
        verify(mock).get(0);
    }
}
