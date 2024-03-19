package kr.co.print_personal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.print_personal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.apply {

            button.apply {
                setOnClickListener {
                    textView.apply {
                        text = "안녕하세요"
                    }
                }
            }


            button2.apply {
                setOnClickListener {
                    textView.apply {
                        text = "반갑습니다"
                    }
                }
            }

            button3.apply {
                setOnClickListener {
                    textView.apply {
                        text = "감사합니다"
                    }
                }
            }

            button4.apply {
                setOnClickListener {
                    textView.apply {
                        text = "잘가요"
                    }
                }
            }

        }
    }
}