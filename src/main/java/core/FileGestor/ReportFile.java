package core.FileGestor;


import core.TestDriver.TestDriver;

import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class manages the creation of reports both Maven and Hudson
 *
 * @author otorandell on 08/02/2016
 */
public class ReportFile {

    private String filename;
    private String filepath;
    private String finalpath;

    /**
     * This funtion calls setFilename(TestDriver driver) and setFilepath(TestDriver driver)
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     * @see #setFilename(TestDriver)
     * @see #setFilepath(TestDriver)
     */
    public ReportFile(TestDriver driver) {
        setFilename(driver);
        setFilepath(driver);
    }

    /**
     * Gets the string of the finalpath var
     *
     * @return {@code String}
     */
    public String getFinalpath() {
        return finalpath;
    }

    /**
     * Sets the string of the finalpath var
     *
     * @param finalpath String
     */
    public void setFinalpath(String finalpath) {
        this.finalpath = finalpath;
    }

    /**
     * Sets the string of filename var with the name of the component and actual system date
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     * @see DateFormat#format(Date)
     */
    public void setFilename(TestDriver driver) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH_mm_ss");
        String date = df.format(driver.getTestdate());
        this.filename = driver.getTestdetails().getTestname() + date + ".html";
    }

    /**
     * Gets the filepath var
     *
     * @return {@code String}
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * This function establishes where the file of the report will be saved
     *
     * @param driver TestDriver - This object gathers all the info refferent to the current test
     */
    public void setFilepath(TestDriver driver) {
        String provisionalpath;
        String name = driver.getTestdetails().getTestname();
        if (driver.getTestdetails().getEnvironment().equals("sis")) {
            provisionalpath = "C:/HudsonSis/jobs/Sis" + name + "/workspace/";
        } else {
            provisionalpath = "C:/Hudson/jobs/Test" + name + "/workspace/";
        }
        File folder = new File(provisionalpath);
        if (!folder.exists()) {
            provisionalpath = "C:/mavenlog/";
        }
        if (!folder.exists()) { //The workspace is not present -> put results in log folde
            folder = new File(provisionalpath);
            folder.mkdir();
        }
        this.filepath = provisionalpath;
    }

    /**
     * This funtion gets the path and name of the file and saves it, with that name on that path
     *
     * @param content String - Contains all the html generated
     */
    public void saveReport(String content) {
        FileWriter out;
        setFinalpath(this.filepath + this.filename);
        try {
            out = new FileWriter(getFinalpath());
            out.write(content);
            out.close();
            System.out.println("--Report saved on " + getFinalpath() + "--");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
