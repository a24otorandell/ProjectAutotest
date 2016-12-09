package core.HTMLReport;


import core.FileGestor.ReportFile;
import core.TestDriver.TestDriver;

/**
 * This class creates the report of the test as a html with inline css
 *
 * @author otorandell on 08/02/2016
 * @author ajvirgili on 05/07/2016
 * @see ReportFile
 * @see core.HTMLReport.HTMLFactory
 */
@SuppressWarnings("unused")
public class AutoReport extends HTMLFactory {
    String style = "body{color:#13335a;font-family:calibri,sans-serif;background:rgb(230,230,230);}" +
            " .container{border:1px solid black;padding:10px;width:90%;margin:5%;background:white;}" +
            " a{color : inherit;}" +
            " .error{color:red;font-weight:bold;}" +
            " .warning{color:orange;font-weight:bold;}" +
            " .hidden{visibility: hidden;}" +
            " .success{color:#0484a8;font-weight:bold;}" +
            " .header{color:#13335a;font-size:20px;font-weight:bold;display:block;}" +
            " .title{color:#13335a;font-size:40px;font-weight:bold;margin-bottom:-2%;margin-top:2%;margin-left:5%;}" +
            " img{width:200px;}" +
            ".container img:hover{width:1200px}";
    String meta = "";
    String content = "";
    String header = "";
    String footer = "";
    String body = "";
    String fullhtml = "";
    ReportFile file;

    public AutoReport() {
    }

    /**
     * Gets a {@code ReportFile} object
     *
     * @return {@code ReportFile}
     */
    public ReportFile getFile() {
        return file;
    }

    /**
     * Gets a {@code String} with the content
     *
     * @return {@code String}
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content string
     *
     * @param content String
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Creates a meta tag for the html report
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     */
    public void setMeta(TestDriver driver) {
        this.meta = makeHead(driver.getTestdetails().getTestname(), this.style, "UTF-8");
    }

    /**
     * Creates a header for the html report
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     */
    public void setHeader(TestDriver driver) {
        String status;
        String link = driver.getTestdetails().getTestname() + " " + driver.getTestdetails().getScreen();
        if (driver.getTeststatus() != 0) {
            status = "<div class='error'><a href='#" + link + "'>ERROR: " + link + " </a></div>";
        } else {
            status = "<div class='success'><a href='#" + link + "'>SUCCESS: " + link + " </a></div>";
        }
        String title = "<span class='header'>" +
                "<a name='" + link + "'/>" +
                " Component: " + driver.getTestdetails().getTestname() +
                " </span>" +
                " <span class='header'>" +
                " Screen: " + driver.getTestdetails().getScreen() +
                " </span>" +
                " <span class='header'>" +
                " Web Browser: firefox 43.0.1" + //TODO Update this to display actual browser version
                " </span>" +
                " <span class='header'>" +
                " Environment: " + driver.getTestdetails().getEnvironment() +
                " </span>" +
                "<hr>";
        this.header = addImg("file://C:/atlas20logo.png", "style='margin-left: 5%;'") +
                taggedLine(driver.getTestdetails().getTestname(), "p", "id='title'") +
                taggedLine(status, "div", "class='container'") +
                "<div class='container'>" +
                title;

    }

    /**
     * Creates a body for the html report
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     */
    public void setBody(TestDriver driver) {
        setHeader(driver);
        setFooter(driver);
        setMeta(driver);
        String pre = this.header + this.content + this.footer + "</div>";
        this.body = taggedLine(pre, "body", "");

    }

    /**
     * Creates a footer for the html report
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     */
    public void setFooter(TestDriver driver) {
        String semifooter;
        if (driver.getTeststatus() != 0) {
            semifooter = "<p class ='error'>Test " + driver.getTestdetails().getTestname() + " completed unsuccesfully, check the screenshot and the error line for more info.</p><hr>";
        } else {
            semifooter = "<p class ='success'>Test " + driver.getTestdetails().getTestname() + " completed succesfully.</p><hr>";
        }
        String info = "<span class='header'>" +
                " Test Realized on " + driver.getTestdate() +
                " </span>" +
                " <span class='header'>" +
                " Total time: " + (driver.getTestend() - driver.getTeststart()) / 1000 + " seconds" +
                " </span>" +
                "<a href='#title'>Go to page top</a>" +
                "<hr>";
        this.footer = semifooter + info;
    }

    /**
     * Adds content to the html report choosing the html tag and atribute of the element
     *
     * @param line    String - Text of the element to add
     * @param htmltag String - Html tag of the element to add
     * @param attr    String - Atribute tag of the element to add
     */
    public void addContent(String line, String htmltag, String attr) {
        String newline = taggedLine(line, htmltag, attr);
        this.content += newline;
        System.out.println(newline);
    }

    /**
     * Adds simple html content  with "p" tag and no attr
     *
     * @param line String - Text of the element to add
     */
    public void addContent(String line) {
        String newline = taggedLine(line, "p", "");
        this.content += newline;
        System.out.println(newline);

    }

    /**
     * Adds html to close a {@code div.container}
     */
    public void closeBlock() {
        this.content += "</div><div class ='container'>";
    }

    /**
     * Gets the html content created and makes the html file
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     * @see ReportFile#saveReport(String)
     */
    public void saveReport(TestDriver driver) {
        mergeHTML(driver);
        file = new ReportFile(driver);
        file.saveReport(this.fullhtml);
    }

    /**
     * Combines the meta content and the body
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     */
    public void mergeHTML(TestDriver driver) {
        setBody(driver);
        this.fullhtml = this.meta + this.body;
    }

    /**
     * Adds a img to the content of the html report
     *
     * @param src  String - Url of the image
     * @param attr String - Atribute alternative of the img
     */
    public void addImage(String src, String attr) {
        String newline = addImg(src, attr);
        this.content += newline;

    }

    /**
     * Adds plain text to the content of the html report
     *
     * @param raw String - Simple text without html tags
     */
    public void addRawText(String raw) {
        this.content += raw;
    }

    /**
     * Adds a html header tag for the report
     *
     * @param line   String - Text of the header
     * @param type   Integer - Type of the header(h1,h2,h3,...)
     * @param center boolean - Controls if the header is centered
     */
    public void addHeader(String line, int type, boolean center) {
        String style = "";
        if (center) {
            style = " style=\"text-align: center;\"";
        }
        String newline = "<h" + type + style + ">" + line + "</h" + type + ">";
        System.out.println(newline);
        this.content += newline;

    }
}