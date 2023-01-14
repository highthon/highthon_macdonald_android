package com.yongjincompany.app.feature.article.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yongjincompany.app.util.MutableEventFlow
import com.yongjincompany.app.util.asEventFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/*class ArticleViewModel @Inject constructor(
    private val
) : ViewModel() {
    private val _ = MutableEventFlow<>()
    val  = _.asEventFlow()

    private fun event(event: ) {
        viewModelScope.launch {
            _.emit(event)
        }
    }

    sealed class  {

        data class (val ) : ()

        data class ErrorMessage(val errorMessage: String) : ()
    }
}*/