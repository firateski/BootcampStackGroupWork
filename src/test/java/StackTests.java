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

    @Test(expected = IllegalArgumentException.class)
    public void pop_ShouldThrowError_WhenStackIsEmpty() {
        // Arrange
        Stack sut = new Stack();

        // Act
        sut.pop();
    }

    @Test
    public void pop_ShouldRemoveRootItem_WhenStackHasOneItem() {
        // Arrange
        Stack sut = new Stack();
        sut.push(1);

        // Act
        int output = sut.pop();

        // Verify
        assertEquals(output, 1);
        assertEquals(0, sut.getSize());
    }

    @Test
    public void pop_ShouldRemoveLastItem_WhenStackHasMoreThanOneItem(){
        // Arrange
        Stack sut = new Stack();

        sut.push(1);
        sut.push(2);
        sut.push(3);

        // Act
        int result = sut.pop();

        // Verify
        assertEquals(3,result);
        assertEquals(2,sut.getSize());
    }

    @Test
    public void push_ShouldReturnOne_WhenAddOneItem() {
        //Arrange
        Stack sut = new Stack();

        //Act
        int pushed = sut.push(1);

        //Verify
        assertEquals(1, pushed);
        assertEquals(1, sut.getSize());
    }

    @Test
    public void push_ShouldReturnTwo_WhenAddTwoItem() {
        // Arrange
        Stack sut = new Stack();

        // Act
        sut.push(99);
        sut.push(55);

        // Verify
        assertEquals(2, sut.getSize());
    }
}
