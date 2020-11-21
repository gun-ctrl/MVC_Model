package com.example.app1121.data.dp.dp

import com.example.app1121.data.dp.Book
import com.example.app1121.data.dp.BookDao

/**
 *@Description
 *@Author PC
 *@QQ 1578684787
 */
class BookDaoDbImpl : BookDao {
    //模拟数据库中存储的数据
    override var bookList: MutableList<Book> = mutableListOf()

    override fun getBooks(): List<Book> {
        return bookList
    }

    override fun addBook(book: Book) {
        bookList.add(book)
    }
}