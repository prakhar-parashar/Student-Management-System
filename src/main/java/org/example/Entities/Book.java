package org.example.Entities;

import java.time.LocalDateTime;

public class Book {
    private String Name;
    private String author;
    private int pageNo;
    private Long isbnNumber;
    private double price;
    private LocalDateTime issueDateTime;
    private LocalDateTime returnDateTime;

    public Book(String name, String author, int pageNo, Long isbnNumber, double price, LocalDateTime issueDateTime) {
        Name = name;
        this.author = author;
        this.pageNo = pageNo;
        this.isbnNumber = isbnNumber;
        this.price = price;
        this.issueDateTime = issueDateTime;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public Long getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(Long isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getIssueDateTime() {
        return issueDateTime;
    }

    public void setIssueDateTime(LocalDateTime issueDateTime) {
        this.issueDateTime = issueDateTime;
    }

    public LocalDateTime getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(LocalDateTime returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    @Override
    public String toString() {
        return "Book name: " + Name +
                ", Author: " + author +
                ", Number of pages: " + pageNo +
                ", ISBN number: " + isbnNumber +
                ", price: " + price +
                ", issue date and time: " + issueDateTime +
                ", returning date and time:" + returnDateTime + "\n";
    }
}
