package stream.flarebot.flarebot.util;

import stream.flarebot.flarebot.objects.Report;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ReportManager {

    public List<Report> getGuildReports(long guildID){
        try {
            SQLController.runSqlTask(conn ->{
                ResultSet set = conn.createStatement().executeQuery("SELECT guild_id, report_id FROM reports WHERE guild_id = " + String.valueOf(guildID));
                //TODO figure this stuff out
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}