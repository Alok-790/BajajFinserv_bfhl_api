package com.vit.bfhl;

import com.vit.bfhl.util.TextUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextUtilsTest {

    @Test
    void reverseAlternateCaps_exampleC() {
        String letters = "AABcDDOE"; // from inputs: "A","ABcD","DOE"
        String out = TextUtils.reverseAlternateCaps(letters);
        assertEquals("EoDdCbAa", out);
    }
}