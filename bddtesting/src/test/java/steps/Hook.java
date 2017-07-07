package steps;

import gherkin.formatter.Formatter;
import gherkin.formatter.model.*;
import gherkin.formatter.model.Scenario;
import parallel.ParallelFactory;
import report.GenerateReport;
import utilities.InstanceHelper;

import java.util.List;

/**
 * Created by annguyenx1 on 6/29/2017.
 */
public class Hook implements Formatter {

    @Override
    public void syntaxError(String s, String s1, List<String> list, String s2, Integer integer) {

    }

    @Override
    public void uri(String s) {

    }

    @Override
    public void feature(Feature feature) {

    }

    @Override
    public void scenarioOutline(ScenarioOutline scenarioOutline) {

    }

    @Override
    public void examples(Examples examples) {

    }

    @Override
    public void startOfScenarioLifeCycle(Scenario scenario) {
        ParallelFactory.setDriver(InstanceHelper.getDriverInstance());

    }

    @Override
    public void background(Background background) {

    }

    @Override
    public void scenario(Scenario scenario) {
    }

    @Override
    public void step(Step step) {

    }

    @Override
    public void endOfScenarioLifeCycle(Scenario scenario) {
        ParallelFactory.freeDriverInstance();

    }

    @Override
    public void done() {
    }

    @Override
    public void close() {
        GenerateReport.GenerateMasterthoughtReport();
    }

    @Override
    public void eof() {

    }
}
