package et.edu.aait.viewpagerexample


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_course.view.*


class CourseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_course, container, false)

        val course = arguments?.getSerializable("course") as Course

        view.detail_code_tv.text = course.code
        view.detail_title_tv.text = course.title
        view.detail_ects_tv.text = course.ects.toString()
        view.detail_description_tv.text = course.description

        return view
    }

    companion object {

        fun newInstance(course: Course): CourseFragment {

            val args = Bundle()

            args.putSerializable("course", course)

            val courseFragment = CourseFragment()
            courseFragment.arguments = args

            return courseFragment

        }
    }
}

