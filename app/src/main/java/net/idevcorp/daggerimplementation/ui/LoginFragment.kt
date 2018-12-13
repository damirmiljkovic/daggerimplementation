package net.idevcorp.daggerimplementation.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import net.idevcorp.daggerimplementation.R
import net.idevcorp.daggerimplementation.databinding.FragmentLoginBinding

class LoginFragment : DaggerFragment(), LoginView {
    private var layoutBinding: FragmentLoginBinding? = null
    private var onButtonClickListener: (() -> Unit)? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        layoutBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        layoutBinding?.loginView = this
        return layoutBinding?.root
    }

    override fun onButtonClicked() {
        onButtonClickListener?.invoke()
    }

    public fun setOnButtonClickListener(mListener: () -> Unit) {
        onButtonClickListener = mListener
    }
}