package com.example.memelist.view

import androidx.fragment.app.Fragment
import com.example.memelist.di.DI


//classes in kotlin are final or closed by default
//final means it cannot be inherited
//'open' is used to make a class inheritable
open class ViewModelFragment: Fragment() {

    protected val viewModel by lazy {
        DI.provideViewModel(requireActivity())
    }

}