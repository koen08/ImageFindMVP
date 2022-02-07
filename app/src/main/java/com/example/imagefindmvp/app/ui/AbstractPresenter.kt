package com.example.imagefindmvp.app.ui

abstract class AbstractPresenter<V : BaseView> : BasePresenter<V> {
    protected var view: V? = null
        private set

    override fun attach(view: V) {
        this.view = view
    }
}