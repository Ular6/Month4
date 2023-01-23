package com.example.month4.ui.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.month4.R
import com.example.month4.databinding.FragmentOnBoardBinding

class OnBoardFragment : Fragment(), OnBoardPageFragment.OnBoardListener {

    private var binding: FragmentOnBoardBinding? = null
    private var boardAdapter: OnBoardAdapter? = null
    private var boardModels = listOf(

        BoardModel(
            imageResId = R.drawable.img1,
            title = "To-do list!",
            description = "Here you can write down something important or make a schedule for tomorrow:)"
        ),

        BoardModel(
            imageResId = R.drawable.img2,
            title = "Share your crazy idea ^_^",
            description = "You can easily share with your report, list or schedule and it's convenient",
        ),
        BoardModel(
            imageResId = R.drawable.img3,
            title = "Flexibility",
            description = "Your note with you at home, at work, even at the resort"
        )
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardBinding.inflate(
            LayoutInflater.from(context), container, false)
        return binding!!.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()

    }
    private fun initViews(){
        boardAdapter = OnBoardAdapter(
            childFragmentManager, lifecycle, boardModels
        )
        binding?.viewPager?.adapter = boardAdapter
    }

    override fun onSkipClicked() {
        binding?.viewPager?.setCurrentItem(boardModels.lastIndex, true)
    }

    override fun onNextClicked() {


    }

    override fun onStartClicked() {
        TODO("Not yet implemented")
    }


}