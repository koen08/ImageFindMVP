package com.example.imagefindmvp.app.ui

abstract class AbstractPresenter<V : BaseView> : BasePresenter<V> {
    lateinit var view: V
    override fun attach(view: V) {
        this.view = view
    }
}