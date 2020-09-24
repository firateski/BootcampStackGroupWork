import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTests {

    @Test
    public void getSize_ShouldReturnZero_WhenStackIsEmpty() {
        // Arrange
        Stack sut = new Stack();

        // Act
        int output = sut.getSize();

        // Verify
        assertEquals(0, output);
    }

    @Test
    public void getSize_ShouldReturnThree_WhenStackHasThreeItems() {
        // Arrange
        Stack sut = new Stack();
        sut.push(1);
        sut.push(2);
        sut.push(3);

        // Act
        int output = sut.getSize();

        // Verify
        assertEquals(3, output);
    }
}
