package test.strings;

import main.strings.IsARotation;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kgresmer on 3/5/2017.
 */
public class IsARotationTest {
    @Test
    public void rotation() throws Exception {
        assertTrue(IsARotation.rotation("waterbottle", "erbottlewat"));
    }

}