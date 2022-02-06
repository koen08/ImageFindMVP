package com.example.imagefindmvp.app.ui

interface BasePresenter<V: BaseView> {
    fun attach(view: V)
}