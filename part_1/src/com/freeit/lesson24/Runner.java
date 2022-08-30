package com.freeit.lesson24;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws SQLException {

        //0 - connect to DB
        //1 - read database
        //2 - create books with read data
        //3 - insert created books into library

        // 0
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
        Statement postman = con.createStatement();
        //1
        ResultSet rs = postman.executeQuery("select b.id as id, b.title as title, b.author as who_wrote, b.genre_id as genre_id, g.genre as genre from books b\n" +
                "    left join genres g on b.genre_id = g.id");
        List<Book> bookList = new ArrayList<>();
        while (rs.next()) {
            Book b = new Book(rs.getInt(1),
                    rs.getString(2),
                    rs.getString("who_wrote"),
                    new Genre(rs.getInt(4), rs.getString(5)));
//                    getGenreById(rs.getInt(4), con));
            bookList.add(b);
        }

        bookList.forEach(System.out::println);

        //Book removing
//        PreparedStatement ps = con.prepareStatement("delete from books where id = ?");
//        ps.setInt(1, bookList.get(0).getId());
//        int i = ps.executeUpdate();
//        if(i > 0) {
//            System.out.println("Книга с айди " + bookList.get(0).getId() + " была удалена");
//        }
        //Book creation
//        Genre genre = new Genre();
//        genre.setGenre("тестовый жанр");
//
//        PreparedStatement psGenre = con.prepareStatement("insert into genres (genre) values (?)", Statement.RETURN_GENERATED_KEYS);
//        psGenre.setString(1, genre.getGenre());
//        psGenre.executeUpdate();
//        ResultSet resSetGenre = psGenre.getGeneratedKeys();
//        if(resSetGenre.next())
//        {
//            genre.setId(resSetGenre.getInt(1));
//        }
//
//        Book newBook = new Book();
//        newBook.setTitle("test book");
//        newBook.setGenre(genre);
//        newBook.setAuthor("Author 1");
//        System.out.println("*****");
//        System.out.println(newBook);
//        System.out.println("***** DB Insertion");
//
//        PreparedStatement ps = con.prepareStatement("insert into books (title, author, genre_id) values (?, ?, ?)");
//        ps.setString(1, newBook.getTitle());
//        ps.setString(2, newBook.getAuthor());
//        ps.setInt(3, newBook.getGenre().getId());
//        ps.executeUpdate();

        //Book Update
//        PreparedStatement ps = con.prepareStatement("update books set title = ? where id = ?");
//        ps.setString(1, "Updated!");
//        ps.setInt(2, 7);
//        ps.executeUpdate();

        System.out.println();
    }

    private static Genre getGenreById(int id, Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select * from genres where id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return new Genre(rs.getInt(1), rs.getString(2));
    }
}
