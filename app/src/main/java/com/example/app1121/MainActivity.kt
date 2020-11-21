package com.example.app1121

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

            //有内容了
            val content = "${mTextView.text}\n\n ${mNameEditText.text}-${mAuthorEditText.text}"
            mTextView.text = content
        }
    }
}