package src;

import java.util.Optional;

/**
 * The {@code Optional  Demo} class provides examples of how to use the {@link Optional} class in Java.
 * It demonstrates the usage of {@link Optional#of(Object)}, {@link Optional#ofNullable(Object)}, and {@link Optional#empty()} methods.
 * <p>
 * This class is intended for educational purposes to show best practices in handling potentially null values using {@code Optional}.
 * </p>
 *
 *
 * @author Shiv kant
 * @version 22.0.0
 * @since 2024-09-03
 */
public class javaDocCode {

    /**
     *  Retrieves a non-null string wrapped in an {@link Optional}.
     *
     * @return an {@code Optional} containing a non-null string.
     * @throws NullPointerException if the value is null.
     * @see Optional#of(Object)
     */
    public Optional<String> getNonNullString() {
        return Optional.of("Hello, World!");
    }

    /**
     * Retrieves an optional string that may or may not contain a value.
     *
     * @param value the string value that may be null.
     * @return an {@code Optional} containing the value if non-null, otherwise an empty {@code Optional}.
     * @see Optional#ofNullable(Object)
     */
    public Optional<String> getNullableString(String value) {
        return Optional.ofNullable(value);
    }

    /**
     * Retrieves an empty {@link Optional}.
     *
     * @return an empty {@code Optional}.
     * @see Optional#empty()
     */
    public Optional<String> getEmptyOptional() {
        return Optional.empty();
    }

    /**
     * Demonstrates the usage of {@link Optional} methods.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        javaDocCode demo = new javaDocCode();

        // Demonstrate Optional.of
        Optional<String> nonNullOptional = demo.getNonNullString();
        nonNullOptional.ifPresent(value -> System.out.println("Non-Null Value: " + value));

        // Demonstrate Optional.ofNullable with non-null value
        Optional<String> nullableOptional = demo.getNullableString("Optional with value");
        nullableOptional.ifPresent(value -> System.out.println("Nullable Value Present: " + value));

        // Demonstrate Optional.ofNullable with null value
        Optional<String> emptyOptional = demo.getNullableString(null);
        System.out.println("Empty Optional: " + emptyOptional.orElse("No Value"));

        // Demonstrate Optional.empty
        Optional<String> trulyEmptyOptional = demo.getEmptyOptional();
        System.out.println("Truly Empty Optional: " + trulyEmptyOptional.orElse("Empty"));
    }
}
