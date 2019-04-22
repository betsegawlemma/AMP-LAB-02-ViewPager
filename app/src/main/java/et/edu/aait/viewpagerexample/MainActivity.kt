package et.edu.aait.viewpagerexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager

    private lateinit var pagerAdapter: CoursePagerAdapter

    private val courses = listOf(
        Course("Social Networks","ITSE-4182",6,"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eros in cursus turpis massa tincidunt dui ut. Neque viverra justo nec ultrices dui sapien"),
        Course("Advanced IT Security","ITSE-4092",7,"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eros in cursus turpis massa tincidunt dui ut. Neque viverra justo nec ultrices dui sapien"),
        Course("Ethics and Professionalism","ITSE-4181",6,"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eros in cursus turpis massa tincidunt dui ut. Neque viverra justo nec ultrices dui sapien"),
        Course("Introduction to Logic","ITSE-1033",6,"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eros in cursus turpis massa tincidunt dui ut. Neque viverra justo nec ultrices dui sapien"),
        Course("Software Quality Assurance and Testing","ITSE-4213",7,"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eros in cursus turpis massa tincidunt dui ut. Neque viverra justo nec ultrices dui sapien"),
        Course("FPGA Programming","ITSE-5257",6,"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Eros in cursus turpis massa tincidunt dui ut. Neque viverra justo nec ultrices dui sapien")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = view_pager
        pagerAdapter = CoursePagerAdapter(supportFragmentManager,courses)
        viewPager.adapter = pagerAdapter
    }
}
