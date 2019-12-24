package com.example.moviedb.presentation.movie.profile


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.moviedb.R
import com.example.moviedb.base.BaseFragment
import com.example.moviedb.utils.AppPreferences
import org.koin.android.ext.android.inject

class ProfileFragment : BaseFragment() {
    private val viewModel: ProfileViewModel by inject()
    private lateinit var progressBar: ProgressBar
    private lateinit var tvName: TextView
    private lateinit var tvUsername: TextView
    private lateinit var tvAdult: TextView
    private lateinit var imageView:ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews(view)
        Log.d("profile","Here is an error")
        setData()
    }

    override fun bindViews(view: View) = with(view){
        progressBar = view.findViewById(R.id.progressBarProfile)
        tvName = view.findViewById(R.id.NameValue)
        tvUsername = view.findViewById(R.id.UsernameValue)
        tvAdult = view.findViewById(R.id.AdultValue)
        imageView=view.findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.ava)

    }

    override fun setData() {
        val sessionId = activity?.applicationContext?.let{AppPreferences.getSessionId(it)}
        sessionId?.let {
            viewModel.getAccountDetails(sessionId)
        }
        viewModel.liveData.observe(viewLifecycleOwner, Observer { result ->
            when (result) {
                is ProfileViewModel.State.ShowLoading -> {
                    progressBar.visibility = View.VISIBLE
                }
                is ProfileViewModel.State.HideLoading -> {
                    progressBar.visibility = View.GONE
                }
                is ProfileViewModel.State.Result -> {
                    tvName.text = result.account?.name
                    tvUsername.text = result.account?.username
                    tvAdult.text = result.account?.adult.toString()
                }
                is ProfileViewModel.State.Error -> {
                    Toast.makeText(context, result.error, Toast.LENGTH_SHORT).show()
                }
                is ProfileViewModel.State.IntError -> {
                    Toast.makeText(context, result.error, Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}
