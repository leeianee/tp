package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.*;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Internship[] getSamplePersons() {
        return new Internship[] {
            new Internship(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                ApplicationStatus.Applied, new Address("Blk 30 Geylang Street 29, #06-40"),
                getTagSet("friends")),
            new Internship(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                ApplicationStatus.Applied, new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                getTagSet("colleagues", "friends")),
            new Internship(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                ApplicationStatus.Applied, new Address("Blk 11 Ang Mo Kio Street 74, #11-04"),
                getTagSet("neighbours")),
            new Internship(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                ApplicationStatus.Applied, new Address("Blk 436 Serangoon Gardens Street 26, #16-43"),
                getTagSet("family")),
            new Internship(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                ApplicationStatus.Applied, new Address("Blk 47 Tampines Street 20, #17-35"),
                getTagSet("classmates")),
            new Internship(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                ApplicationStatus.Applied, new Address("Blk 45 Aljunied Street 85, #11-31"),
                getTagSet("colleagues"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Internship sampleInternship : getSamplePersons()) {
            sampleAb.addPerson(sampleInternship);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
