package report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by annguyenx1 on 7/5/2017.
 */
public class GenerateReport {
    public static void GenerateMasterthoughtReport(){
        try{
            String RootDir = System.getProperty("screenshot");
            File reportOutputDirectory = new File("target/Masterthought");
            List<String> list = new ArrayList<String>();
            list.add("target/FirstThread.json");
            list.add("target/SecondThread.json");
            list.add("target/ThirdThread.json");

            String pluginUrlPath = "";
            String buildNumber = "1";
            String buildProject = "cucumberBDDAnNguyen";
            boolean skippedFails = true;
            boolean pendingFails = true;
            boolean undefinedFails = true;
            boolean missingFails = true;
            boolean flashCharts = true;
            boolean runWithJenkins = false;
            boolean highCharts = false;
            boolean parallelTesting = true;
            boolean artifactsEnabled = false;
            String artifactConfig = "";

            Configuration configuration = new Configuration(reportOutputDirectory, buildProject);
            configuration.setParallelTesting(parallelTesting);
            configuration.setRunWithJenkins(runWithJenkins);
            configuration.setBuildNumber(buildNumber);

            ReportBuilder reportBuilder = new ReportBuilder(list, configuration);

            reportBuilder.generateReports();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void removeAfterHookJson() throws IOException {
        Path file = Paths.get("target/FirstThread.json");
        String input = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
        JSONObject obj = (JSONObject) JSONValue.parse(input);
        obj.remove("after");
        String output = JSONValue.toJSONString(obj);
        Files.write(file, output.getBytes(StandardCharsets.UTF_8));
    }
}
