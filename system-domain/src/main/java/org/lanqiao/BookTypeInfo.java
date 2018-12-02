package org.lanqiao;

public class BookTypeInfo {
    private int bookTypeId;
    private String bookTypeName;

    public BookTypeInfo() {
    }

    public BookTypeInfo(int bookTypeId, String bookTypeName) {
        this.bookTypeId = bookTypeId;
        this.bookTypeName = bookTypeName;
    }

    public BookTypeInfo(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public int getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(int bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }


    @Override
    public String toString() {
        return "BookTypeInfo{" +
                "bookTypeId=" + bookTypeId +
                ", bookTypeName='" + bookTypeName + '\'' +
                '}';
    }
}
