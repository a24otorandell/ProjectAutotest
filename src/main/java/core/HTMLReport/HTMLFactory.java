package core.HTMLReport;

/**
 * This abstract class help us to create the report of the test,<br>
 *
 * @author otorandell on 08/02/2016
 */
public abstract class HTMLFactory {
    /**
     * Creates a html tag with the content, tagKind and attr as parameters
     *
     * @param content String - The content of the html tag
     * @param tagKind String - The tag of the html tag
     * @param attr    String - The attr of the html tag
     * @return {@code String} the html tag
     */
    protected String taggedLine(String content, String tagKind, String attr) {
        String result;
        result = "<" + tagKind + " " + attr + ">" + content + "</" + tagKind + " " + attr + ">";
        return result;
    }

    /**
     * Creates a html head
     *
     * @param title   String - The title of the html
     * @param style   String - The css of the html
     * @param charset String - Type charset of the html
     * @return {@code String} the head html tag
     * @see <a href="http://www.w3schools.com/html/html_charset.asp">Charset on w3schools</a>
     */
    protected String makeHead(String title, String style, String charset) {
        return "<!doctype html>" +
                "<html>" +
                "<head>" +
                "<meta charset='" + charset + "'>" +
                taggedLine(title, "title", "") +
                taggedLine(style, "style", "type='text/css'") +
                "</head>";
    }

    /**
     * Creates an img tag with the source(src) and alternative(attr)
     *
     * @param src  String - The URL or URI of the image
     * @param attr String - The alternative of the image
     * @return {@code String} with the img tag
     */
    protected String addImg(String src, String attr) {
        return "<img src ='" + src + "' alt='" + attr + "'>";
    }
}
