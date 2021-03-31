
package com.example.work3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var first: Double = 0.00
    var math: Int = 0
    var put: Int = 0
    var btn : Double = 0.00
    var plusa : Double = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            one.setOnClickListener {
                if (textView.text.toString() == "0" && put == 0) {
                    textView.setText("1")
                } else if (put == 1) {
                    textView.setText("")
                    put = 0
                    textView.setText("1")
                } else {
                    var str = textView.text.toString().plus(1)
                    textView.setText(str)
                }

            }


            two.setOnClickListener {
                if (textView.text.toString() == "0" && put == 0) {
                    textView.setText("2")
                } else if (put == 1) {
                    textView.setText("")
                    put = 0
                    textView.setText("2")
                } else {
                    var str = textView.text.toString().plus(2)
                    textView.setText(str)
                }
            }
            three.setOnClickListener {
                if (textView.text.toString() == "0" && put == 0) {
                    textView.setText("3")
                } else if (put == 1) {
                    textView.setText("")
                    put = 0
                    textView.setText("3")
                } else {
                    var str = textView.text.toString().plus(3)
                    textView.setText(str)
                }
            }
            four.setOnClickListener {
                if (textView.text.toString() == "0" && put == 0) {
                    textView.setText("4")
                } else if (put == 1) {
                    textView.setText("")
                    put = 0
                    textView.setText("4")
                } else {
                    var str = textView.text.toString().plus(4)
                    textView.setText(str)
                }
            }
            five.setOnClickListener {
                if (textView.text.toString() == "0" && put == 0) {
                    textView.setText("5")
                } else if (put == 1) {
                    textView.setText("")
                    put = 0
                    textView.setText("5")
                } else {
                    var str = textView.text.toString().plus(5)
                    textView.setText(str)
                }
            }
            six.setOnClickListener {
                if (textView.text.toString() == "0" && put == 0) {
                    textView.setText("6")
                } else if (put == 1) {
                    textView.setText("")
                    put = 0
                    textView.setText("6")
                } else {
                    var str = textView.text.toString().plus(6)
                    textView.setText(str)
                }
            }
            seven.setOnClickListener {
                if (textView.text.toString() == "0" && put == 0) {
                    textView.setText("7")
                } else if (put == 1) {
                    textView.setText("")
                    put = 0
                    textView.setText("7")
                } else {
                    var str = textView.text.toString().plus(7)
                    textView.setText(str)
                }
            }
            eight.setOnClickListener {
                if (textView.text.toString() == "0" && put == 0) {
                    textView.setText("8")
                } else if (put == 1) {
                    textView.setText("")
                    put = 0
                    textView.setText("8")
                } else {
                    var str = textView.text.toString().plus(8)
                    textView.setText(str)
                }
            }
            nine.setOnClickListener {
                if (textView.text.toString() == "0" && put == 0) {
                    textView.setText("9")
                } else if (put == 1) {
                    textView.setText("")
                    put = 0
                    textView.setText("9")
                } else {
                    var str = textView.text.toString().plus(9)
                    textView.setText(str)
                }
            }
            zero.setOnClickListener {
                if (textView.text.toString() == "0" && put == 0) {
                    textView.setText("0")
                } else if (put == 1) {
                    textView.setText("")
                    put = 0
                    textView.setText("0")
                } else {
                    var str = textView.text.toString().plus(0)
                    textView.setText(str)
                }
            }
            cancel.setOnClickListener {
                textView.setText("0")
                first = 0.00
                math = 0
                put = 0
            }

            del.setOnClickListener {
                if (textView.text.toString().length <= 1) {
                    textView.setText("0")
                } else if (textView.text.isNotEmpty()) {
                    textView.text = textView.text.dropLast(1)
                }
            }

            plus.setOnClickListener {
                if (textView.text.toString() > "0") {
                    var str = textView.text.toString().toDouble()
                    first = first + str
                    math = 1
                    put = 1
                }
            }

            minus.setOnClickListener {
                if (textView.text.toString() > "0") {
                    var str = textView.text.toString().toDouble()
                    first = first + str
                    math = 2
                    put = 1
                }
            }

            kun.setOnClickListener {
                if (textView.text.toString() > "0") {
                    var str = textView.text.toString().toDouble()
                    first = first + str
                    math = 3
                    put = 1
                }
            }

            han.setOnClickListener {
                if (textView.text.toString() > "0") {
                    var str = textView.text.toString().toDouble()
                    first = first + str
                    math = 4
                    put = 1
                }
            }

            persent.setOnClickListener {
                if (textView.text.toString() > "0") {
                    var str = textView.text.toString().toDouble()
                    first = first + str
                    math = 5
                    put = 1
                }
            }

            ans.setOnClickListener {

                if (textView.text.toString() > "0") {
//                var str = rst.text.toString().toDouble()
//                first = first + str
//                rst.setText("$first")
                }
                if (math == 1) {
                    var str = textView.text.toString().toDouble()
                    first = first + str
                    textView.setText("$first")

                } else if (math == 2) {
                    var str = textView.text.toString().toDouble()
                    first = first - str
                    textView.setText("$first")
                } else if (math == 3) {
                    var str = textView.text.toString().toDouble()
                    first = first * str
                    textView.setText("$first")
                } else if (math == 4) {
                    var str = textView.text.toString().toDouble()
                    if (str == 0.00) {
                        textView.setText("ERROR")
                    } else {
                        first = first / str
                        textView.setText("$first")
                    }
                }else if (math == 5) {
                    var str = textView.text.toString().toDouble()
                    first = first % str
                    textView.setText("$first")
                 }
            }
        }
    }
