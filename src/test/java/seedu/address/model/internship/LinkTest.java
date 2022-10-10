package seedu.address.model.internship;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class LinkTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Link(null));
    }

    @Test
    public void constructor_invalidLink_throwsIllegalArgumentException() {
        String invalidLink = "a b";
        assertThrows(IllegalArgumentException.class, () -> new Link(invalidLink));
    }

    @Test
    public void isValidLink() {
        /*
        // null link
        assertThrows(NullPointerException.class, () -> Link.isValidLink(null));
        */

        // invalid links
        //assertFalse(Link.isValidLink("")); // empty string
        //assertFalse(Link.isValidLink(" ")); // spaces only
        assertFalse(Link.isValidLink("9 1")); // whitespace within link
        //assertFalse(Link.isValidLink("phone")); // non-numeric
        //assertFalse(Link.isValidLink("9011p041")); // alphabets within digits
        //assertFalse(Link.isValidLink("9312 1534")); // spaces within digits

        // valid links
        assertTrue(Link.isValidLink("911")); // exactly 3 numbers
        assertTrue(Link.isValidLink("93121534"));
        assertTrue(Link.isValidLink("124293842033123")); // long phone numbers
    }
}