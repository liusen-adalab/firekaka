import css.CSSParser;
import css.Stylesheet;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSSTest {
    public static void main(String[] args) throws IOException {
        String input = Files.readString(Path.of("res/css-input.css"), StandardCharsets.UTF_8);
        String expectedOutput = Files.readString(Path.of("res/css-output.css"), StandardCharsets.UTF_8);

        CSSParser CSSParser = new CSSParser();
        Stylesheet stylesheet = CSSParser.parse(input);
        String output = stylesheet.toString();

        System.out.println(output);
        assert output.equals(expectedOutput);
    }
}