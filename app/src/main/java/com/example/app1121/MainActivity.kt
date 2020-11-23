package com.example.app1121

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.app1121.data.dp.Book
import com.example.app1121.data.dp.BookRepository
import com.example.app1121.data.dp.dp.Database
import com.example.app1121.utils.ProvideRepositoryFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun initializeUI(){
        //监听按钮的点击事件
        mButton.setOnClickListener{
            if (mNameEditText.text.toString().isEmpty()){
                Toast.makeText(this,"书名不能为空",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (mAuthorEditText.text.toString().isEmpty()){
                Toast.makeText(this,"作者名不能为空",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            //数据保存到本地的数据库
            val book  = Book(mNameEditText.text.toString(),mAuthorEditText.text.toString())
            val repository = ProvideRepositoryFactory.getRepository()
            repository.addBook(book)
        }
    }
}