package com.example.raraindira.aplikasibuku;

/**
 * Created by RAFIKA on 5/21/2015.
 */
public class Book {
    public String judulBuku;
    public String namaPengarang;
    public String jumlahHalaman;

    public Book(String judulBuku, String namaPengarang, String jumlahHalaman) {
        this.judulBuku = judulBuku;
        this.namaPengarang = namaPengarang;
        this.jumlahHalaman = jumlahHalaman;
    }
//
//    public static ArrayList<Book> getBooks() {
//        ArrayList<Book> books = new ArrayList<Book>();
//        books.add(new Book("Harry", "San Diego", "asa"));
//        books.add(new Book("Marla", "San Francisco"));
//        books.add(new Book("Sarah", "San Marco"));
//        return books;
//    }
}
