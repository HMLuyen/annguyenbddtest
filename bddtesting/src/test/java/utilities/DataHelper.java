package utilities;

import cucumber.api.DataTable;

import java.util.List;

/**
 * Created by annguyenx1 on 6/30/2017.
 */
public class DataHelper {
    public static String get_row_data_in_data_table(DataTable dataTable, int row, int column) {
        List<List<String>> dataRow = dataTable.raw();
        row = row - 1;
        column = column - 1;
        return dataRow.get(row).get(column);
    }
}
