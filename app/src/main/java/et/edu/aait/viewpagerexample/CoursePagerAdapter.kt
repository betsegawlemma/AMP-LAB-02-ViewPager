package et.edu.aait.viewpagerexample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class CoursePagerAdapter(fragmentManager: FragmentManager, private val courses:List<Course>):
    FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return CourseFragment.newInstance(courses[position])
    }

    override fun getCount(): Int {
        return courses.size
    }
}

