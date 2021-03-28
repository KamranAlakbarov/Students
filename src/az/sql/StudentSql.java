/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.sql;

import az.connect.SqlConnection;
import az.model.Student;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kamran
 */
public class StudentSql {

    private SqlConnection sqlConnection;

    public StudentSql() {
        try {
            sqlConnection = SqlConnection.getInstance();
        } catch (SQLException ex) {

        }
    }

    public List<Student> findAllStudents() {
        List<Student> students = new ArrayList<>();
        try {
            Connection connection = sqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from student");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                students.add(new Student(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getDouble(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8)));

            }
        } catch (SQLException e) {
            System.out.println("select xetasi");
        }
        return students;
    }

    public Student findById(int id) {
        try {
            Connection connection = sqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from student where id=?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Student student = new Student(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4),
                    resultSet.getDouble(5),
                    resultSet.getString(6),
                    resultSet.getString(7),
                    resultSet.getString(8));

            return student;
        } catch (SQLException e) {
            System.out.println("select by id xetasi");
        }
        return null;
    }

    public void insert(Student student) {
        try {
            Connection connection = sqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student (name,surname,age,point,city,gender,favorite) values(?,?,?,?,?,?,?)");
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setDouble(4, student.getPoint());
            preparedStatement.setString(5, student.getCity());
            preparedStatement.setString(6, student.getGender());
            preparedStatement.setString(7, student.getFavorite());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("insert xetasi");
        }

    }

    public void update(Student student) {
        try {
            Connection connection = sqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update student set name=?,surname=?,age=?,point=?,city=?,gender=?,favorite=? where id=?");
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getSurname());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setDouble(4, student.getPoint());
            preparedStatement.setString(5, student.getCity());
            preparedStatement.setString(6, student.getGender());
            preparedStatement.setString(7, student.getFavorite());
            preparedStatement.setInt(8, student.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("update xetasi");
        }
    }

    public void delete(int studentId) {
        try {
            Connection connection = sqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("delete from student where id=?");
            preparedStatement.setInt(1, studentId);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Delete xetasi");
        }
    }

}
