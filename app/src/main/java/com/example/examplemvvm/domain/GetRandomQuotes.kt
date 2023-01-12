package com.example.examplemvvm.domain

import com.example.examplemvvm.data.QuoteRepository
import com.example.examplemvvm.data.model.QuoteModel
import com.example.examplemvvm.data.model.QuoteProvider

class GetRandomQuotes {
    private val repository = QuoteRepository()
    operator fun invoke():QuoteModel?{
        val quotes:List<QuoteModel> = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            //indices devuelve el size de la list menos 1
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}