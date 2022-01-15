package test.java;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import main.java.Greet;

public class GreetTest  {

    private Greet greet = new Greet();

    @Test
    public void greet_0を入力する() {
        assertThat(greet.greet(0), is("Good Evening!"));
    }

    @Test
    public void greet_4を入力する() {
        assertThat(greet.greet(4), is("Good Evening!"));
    }

    @Test
    public void greet_18を入力する() {
        assertThat(greet.greet(18), is("Good Evening!"));
    }

    @Test
    public void greet_19を入力する() {
        assertThat(greet.greet(19), is("Good Evening!"));
    }

    @Test
    public void greet_25を入力する() {
        assertThat(greet.greet(25), is("Good Evening!"));
    }

    @Test
    public void greet_11を入力する() {
        assertThat(greet.greet(11), is("Hello!"));
    }

    @Test
    public void greet_17を入力する() {
        assertThat(greet.greet(17), is("Hello!"));
    }

    @Test
    public void greet_5を入力する() {
        assertThat(greet.greet(5), is("Good Morning!"));
    }

    @Test
    public void greet_6を入力する() {
        assertThat(greet.greet(6), is("Good Morning!"));
    }

    @Test
    public void greet_10を入力する() {
        assertThat(greet.greet(10), is("Good Morning!"));
    }
}
