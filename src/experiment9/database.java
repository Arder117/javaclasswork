// 1. 创建一学生数据库School，创建一表studb，包含字段：学号、姓名、性别、专业、入学年份。
// 编写程序对studb表进行学生信息的增、删、改、查操作

package experiment9;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class database {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.244.129:3306",
                "root", "GreatSQL@2024");
        Statement stmt = con.createStatement();
        createDatabase(stmt);
        insertData(stmt);
        alterData(stmt);
        deleteData(stmt);
        System.out.println("查询结果为：");
        search(stmt);
        stmt.close();
        con.close();
    }

    // 创建School数据库和studb表
    private static void createDatabase(Statement stmt) throws SQLException {
        String sql = "drop database if exists School";
        stmt.execute(sql);
        sql = "create database School";
        stmt.execute(sql);
        sql = "use School";
        stmt.execute(sql);
        sql = "create table studb (学号 varchar(10), 姓名 varchar(20), 性别 varchar(10), " +
                "专业 varchar(20), 入学年份 int)";
        stmt.execute(sql);
    }

    // 插入数据
    private static void insertData(Statement stmt) throws SQLException {
        System.out.println("插入数据后：");
        String sql = "insert into studb values ('20180001', '张三', '男', '计算机', 2018)";
        stmt.addBatch(sql);
        sql = "insert into studb values ('20180002', '李四', '女', '数学', 2018)";
        stmt.addBatch(sql);
        sql = "insert into studb values ('20180003', '王五', '男', '物理', 2018)";
        stmt.addBatch(sql);
        sql = "insert into studb values ('20180004', '赵六', '女', '化学', 2018)";
        stmt.addBatch(sql);
        stmt.executeBatch();
        search(stmt);
    }

    // 删除数据
    private static void deleteData(Statement stmt) throws SQLException {
        String sql;
        sql = "delete from studb where 学号 = '20180001'";
        stmt.executeUpdate(sql);
        System.out.println("删除学号为20180001的学生信息后：");
        search(stmt);
    }

    // 修改数据
    private static void alterData(Statement stmt) throws SQLException {
        String sql;
        sql = "update studb set 专业 = '生物' where 学号 = '20180001'";
        stmt.executeUpdate(sql);
        sql = "select * from studb";
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("更改结果为：");
        search(stmt);
    }

    // 查找数据
    private static void search(Statement stmt) throws SQLException {
        String sql;
        sql = "select * from studb";
        ResultSet rs = stmt.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.printf("%8s", rsmd.getColumnName(i));
        }
        System.out.println();
        while (rs.next()) {
            System.out.printf("%12s %4s %7s %8s %8s\n", rs.getString(1),
                    rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getInt(5));
        }
    }

}
