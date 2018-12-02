package org.lanqiao;

import java.util.List;

public interface IBookTypeInfoDao {

    public void addBookTypeInfo(BookTypeInfo bookTypeInfo);

    public void deleteBookTypeInfoById(int bookTypeInfoId);

    public void updateBookTypeInfo(BookTypeInfo bookTypeInfo);

    public List<BookTypeInfo> getBookTypeInfoList();

    public BookTypeInfo getBookTypeInfoById();
}
